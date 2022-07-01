package net.mikoto.pixiv.core.connector;

import com.alibaba.fastjson2.JSONObject;
import net.mikoto.pixiv.core.connector.client.PixivDirectClient;
import net.mikoto.pixiv.core.model.Artwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;

/**
 * @author mikoto
 * @date 2022/6/25 1:22
 */
@SuppressWarnings("AlibabaMethodTooLong")
@Component("pixivDirectConnector")
public class DirectConnectorImpl implements DirectConnector {
    /**
     * Mikoto pixiv usual date format.
     * <p>
     * e.g.
     * 2020-03-05T01:23:36+00:00
     * 2021-07-15T15:48:17+00:00
     */
    public static final SimpleDateFormat USUAL_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
    /**
     * Constants
     */
    private static final String PIXIV_IMAGE_URL = "https://i.pximg.net";
    private static final String SERIES_NAV_DATA = "seriesNavData";
    /**
     * Instances
     */
    @Qualifier
    private final PixivDirectClient pixivDirectClient;

    @Autowired
    public DirectConnectorImpl(PixivDirectClient pixivDirectClient) {
        this.pixivDirectClient = pixivDirectClient;
    }

    /**
     * Get the artwork by id.
     *
     * @param artworkId The artwork id.
     * @return The artwork.
     */
    @Override
    public Artwork getArtwork(int artworkId) throws ParseException {
        Artwork artwork = new Artwork();

        JSONObject artworkRawJson = JSONObject.parseObject(pixivDirectClient.getArtwork(artworkId));
        if (!artworkRawJson.getBooleanValue("error")) {
            JSONObject artworkRawJsonBody = artworkRawJson.getJSONObject("body");

            // 处理基础数据
            artwork.setArtworkId(Integer.parseInt(artworkRawJsonBody.getString("illustId")));
            artwork.setArtworkTitle(artworkRawJsonBody.getString("illustTitle"));
            artwork.setAuthorId(Integer.parseInt(artworkRawJsonBody.getString("userId")));
            artwork.setAuthorName(artworkRawJsonBody.getString("userName"));
            artwork.setDescription(artworkRawJsonBody.getString("description"));
            artwork.setPageCount(artworkRawJsonBody.getIntValue("pageCount"));
            artwork.setBookmarkCount(artworkRawJsonBody.getIntValue("bookmarkCount"));
            artwork.setLikeCount(artworkRawJsonBody.getIntValue("likeCount"));
            artwork.setLikeCount(artworkRawJsonBody.getIntValue("viewCount"));
            artwork.setCreateTime(USUAL_DATE_FORMAT.parse(artworkRawJsonBody.getString("createDate")));
            artwork.setUpdateTime(USUAL_DATE_FORMAT.parse(artworkRawJsonBody.getString("uploadDate")));
            artwork.setPatchTime(new Date());

            // 处理链接
            artwork.setIllustUrlMini(artworkRawJsonBody.getJSONObject("urls").getString("mini").replace(PIXIV_IMAGE_URL, ""));
            artwork.setIllustUrlOriginal(artworkRawJsonBody.getJSONObject("urls").getString("original").replace(PIXIV_IMAGE_URL, ""));
            artwork.setIllustUrlRegular(artworkRawJsonBody.getJSONObject("urls").getString("regular").replace(PIXIV_IMAGE_URL, ""));
            artwork.setIllustUrlThumb(artworkRawJsonBody.getJSONObject("urls").getString("thumb").replace(PIXIV_IMAGE_URL, ""));
            artwork.setIllustUrlSmall(artworkRawJsonBody.getJSONObject("urls").getString("small").replace(PIXIV_IMAGE_URL, ""));

            // 根据标签判定年龄分级
            int grading = 0;

            StringJoiner stringJoiner = new StringJoiner(";");
            for (int i = 0;
                 i <
                         artworkRawJsonBody
                                 .getJSONObject("tags")
                                 .getJSONArray("tags")
                                 .size();
                 i++) {
                String tag =
                        artworkRawJsonBody.getJSONObject("tags")
                                .getJSONArray("tags")
                                .getJSONObject(i)
                                .getString("tag");
                if ("R-18".equals(tag)) {
                    grading = 1;
                } else if ("R-18G".equals(tag)) {
                    grading = 2;
                }

                stringJoiner.add(tag);
            }
            artwork.setGrading(grading);
            artwork.setTags(stringJoiner.toString());

            // 处理系列作品数据
            JSONObject seriesJson = artworkRawJsonBody.getJSONObject(SERIES_NAV_DATA);
            if (seriesJson != null) {
                artwork.setHasSeries(true);
                artwork.setSeriesId(Integer.parseInt(seriesJson.getString("seriesId")));
                artwork.setSeriesOrder(seriesJson.getIntValue("order"));
                JSONObject previousJson = seriesJson.getJSONObject("prev");
                if (previousJson != null) {
                    artwork.setPreviousArtworkId(Integer.parseInt(previousJson.getString("id")));
                    artwork.setPreviousArtworkTitle(previousJson.getString("title"));
                } else {
                    artwork.setPreviousArtworkId(0);
                    artwork.setPreviousArtworkTitle(null);
                }

                JSONObject nextJson = seriesJson.getJSONObject("next");
                if (nextJson != null) {
                    artwork.setNextArtworkId(Integer.parseInt(nextJson.getString("id")));
                    artwork.setNextArtworkTitle(nextJson.getString("title"));
                } else {
                    artwork.setNextArtworkId(0);
                    artwork.setNextArtworkTitle(null);
                }
            } else {
                artwork.setHasSeries(false);
                artwork.setSeriesId(0);
                artwork.setSeriesOrder(0);
                artwork.setNextArtworkId(0);
                artwork.setNextArtworkTitle(null);
                artwork.setPreviousArtworkId(0);
                artwork.setPreviousArtworkTitle(null);
            }
        }
        return artwork;
    }

    /**
     * Get the image of this url.
     *
     * @param url The url.
     * @return The image.
     */
    @Override
    public byte[] getImage(String url) {
        return pixivDirectClient.getImage(url);
    }
}

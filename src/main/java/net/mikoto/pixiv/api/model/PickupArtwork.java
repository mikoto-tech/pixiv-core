package net.mikoto.pixiv.api.model;

import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/6/11 21:30
 */
public class PickupArtwork {
    private int artworkId;
    private String artworkTitle;
    private String url;
    private String alt;

    public int getArtworkId() {
        return artworkId;
    }

    public void setArtworkId(int artworkId) {
        this.artworkId = artworkId;
    }

    public String getArtworkTitle() {
        return artworkTitle;
    }

    public void setArtworkTitle(String artworkTitle) {
        this.artworkTitle = artworkTitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PickupArtwork that = (PickupArtwork) o;
        return artworkId == that.artworkId && artworkTitle.equals(that.artworkTitle) && url.equals(that.url) && alt.equals(that.alt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artworkId, artworkTitle, url, alt);
    }

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nPickupArtwork{" +
                "artworkId=" + artworkId +
                ", artworkTitle='" + artworkTitle + '\'' +
                ", url='" + url + '\'' +
                ", alt='" + alt + '\'' +
                '}';
    }
}
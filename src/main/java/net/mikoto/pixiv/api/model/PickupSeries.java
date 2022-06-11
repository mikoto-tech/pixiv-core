package net.mikoto.pixiv.api.model;

import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/6/11 21:46
 */
public class PickupSeries {
    int seriesId;
    String seriesTitle;
    String url;
    int firstArtworkId;
    int latestArtworkId;

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getFirstArtworkId() {
        return firstArtworkId;
    }

    public void setFirstArtworkId(int firstArtworkId) {
        this.firstArtworkId = firstArtworkId;
    }

    public int getLatestArtworkId() {
        return latestArtworkId;
    }

    public void setLatestArtworkId(int latestArtworkId) {
        this.latestArtworkId = latestArtworkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PickupSeries that = (PickupSeries) o;
        return seriesId == that.seriesId && firstArtworkId == that.firstArtworkId && latestArtworkId == that.latestArtworkId && Objects.equals(seriesTitle, that.seriesTitle) && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seriesId, seriesTitle, url, firstArtworkId, latestArtworkId);
    }

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nPickupSeries{" +
                "seriesId=" + seriesId +
                ", seriesTitle='" + seriesTitle + '\'' +
                ", url='" + url + '\'' +
                ", firstArtworkId=" + firstArtworkId +
                ", latestArtworkId=" + latestArtworkId +
                '}';
    }
}

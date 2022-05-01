package net.mikoto.pixiv.api.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/5/1 0:01
 */
@Entity
@Getter
@Setter
@Table(name = "series_artwork")
public class SeriesArtwork {
    @Id
    @Column(name = "pk_artwork_id", nullable = false, unique = true)
    private int artworkId;
    @Column(name = "series_id", nullable = false)
    private int seriesId;
    @Column(name = "order", nullable = false)
    private int order;
    @Column(name = "next_artwork_id")
    private int nextArtworkId;
    @Column(name = "next_artwork_title")
    private String nextArtworkTitle;
    @Column(name = "previous_artwork_id")
    private int previousArtworkId;
    @Column(name = "previous_artwork_title")
    private String previousArtworkTitle;
    @Column(name = "illust_url_thumb")
    private String illustUrlThumb;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SeriesArtwork that = (SeriesArtwork) o;
        return artworkId == that.artworkId && seriesId == that.seriesId && order == that.order && nextArtworkId == that.nextArtworkId && previousArtworkId == that.previousArtworkId && Objects.equals(nextArtworkTitle, that.nextArtworkTitle) && Objects.equals(previousArtworkTitle, that.previousArtworkTitle) && Objects.equals(illustUrlThumb, that.illustUrlThumb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artworkId, seriesId, order, nextArtworkId, nextArtworkTitle, previousArtworkId, previousArtworkTitle, illustUrlThumb);
    }

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nSeriesArtwork{" +
                "artworkId=" + artworkId +
                ", seriesId=" + seriesId +
                ", order=" + order +
                ", nextArtworkId=" + nextArtworkId +
                ", nextArtworkTitle='" + nextArtworkTitle + '\'' +
                ", previousArtworkId=" + previousArtworkId +
                ", previousArtworkTitle='" + previousArtworkTitle + '\'' +
                ", illustUrlThumb='" + illustUrlThumb + '\'' +
                '}';
    }
}

package net.mikoto.pixiv.api.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

/**
 * @author mikoto
 * Created at 21:30:24, 2021/9/19
 */
@Entity
@Getter
@Setter
@Table(name = "artwork")
public class Artwork {
    @Id
    @Column(name = "pk_artwork_id", nullable = false, unique = true)
    private int artworkId;
    @Column(name = "artwork_title", nullable = false)
    private String artworkTitle;
    @Column(name = "author_id", nullable = false)
    private int authorId;
    @Column(name = "has_series", nullable = false)
    private boolean hasSeries;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "illust_url_small", nullable = false)
    private String illustUrlSmall;
    @Column(name = "illust_url_Original", nullable = false)
    private String illustUrlOriginal;
    @Column(name = "illust_url_mini", nullable = false)
    private String illustUrlMini;
    @Column(name = "illust_url_Thumb", nullable = false)
    private String illustUrlThumb;
    @Column(name = "illust_url_Regular", nullable = false)
    private String illustUrlRegular;
    @Column(name = "page_count", nullable = false)
    private int pageCount;
    @Column(name = "bookmark_count", nullable = false)
    private int bookmarkCount;
    @Column(name = "like_count", nullable = false)
    private int likeCount;
    @Column(name = "view_count", nullable = false)
    private int viewCount;
    @Column(name = "grading", nullable = false)
    private int grading;
    @Column(name = "tags", nullable = false)
    private String tags;
    @Column(name = "create_time", nullable = false)
    private Date createTime;
    @Column(name = "update_time", nullable = false)
    private Date updateTime;
    @Column(name = "patch_time", nullable = false)
    private Date patchTime;
    private int seriesId;
    private int order;
    private int nextArtworkId;
    private String nextArtworkTitle;
    private int previousArtworkId;
    private String previousArtworkTitle;

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nArtwork{" +
                "artworkId=" + artworkId +
                ", artworkTitle='" + artworkTitle + '\'' +
                ", authorId=" + authorId +
                ", hasSeries=" + hasSeries +
                ", description='" + description + '\'' +
                ", illustUrlSmall='" + illustUrlSmall + '\'' +
                ", illustUrlOriginal='" + illustUrlOriginal + '\'' +
                ", illustUrlMini='" + illustUrlMini + '\'' +
                ", illustUrlThumb='" + illustUrlThumb + '\'' +
                ", illustUrlRegular='" + illustUrlRegular + '\'' +
                ", pageCount=" + pageCount +
                ", bookmarkCount=" + bookmarkCount +
                ", likeCount=" + likeCount +
                ", viewCount=" + viewCount +
                ", grading=" + grading +
                ", tags='" + tags + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", patchTime=" + patchTime +
                ", seriesId=" + seriesId +
                ", order=" + order +
                ", nextArtworkId=" + nextArtworkId +
                ", nextArtworkTitle='" + nextArtworkTitle + '\'' +
                ", previousArtworkId=" + previousArtworkId +
                ", previousArtworkTitle='" + previousArtworkTitle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Artwork artwork = (Artwork) o;
        return artworkId == artwork.artworkId && authorId == artwork.authorId && pageCount == artwork.pageCount && bookmarkCount == artwork.bookmarkCount && likeCount == artwork.likeCount && viewCount == artwork.viewCount && grading == artwork.grading && artworkTitle.equals(artwork.artworkTitle) && Objects.equals(description, artwork.description) && illustUrlSmall.equals(artwork.illustUrlSmall) && illustUrlOriginal.equals(artwork.illustUrlOriginal) && illustUrlMini.equals(artwork.illustUrlMini) && illustUrlThumb.equals(artwork.illustUrlThumb) && illustUrlRegular.equals(artwork.illustUrlRegular) && tags.equals(artwork.tags) && createTime.equals(artwork.createTime) && updateTime.equals(artwork.updateTime) && patchTime.equals(artwork.patchTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artworkId, artworkTitle, authorId, description, illustUrlSmall, illustUrlOriginal, illustUrlMini, illustUrlThumb, illustUrlRegular, pageCount, bookmarkCount, likeCount, viewCount, grading, tags, createTime, updateTime, patchTime);
    }
}


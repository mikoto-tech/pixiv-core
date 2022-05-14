package net.mikoto.pixiv.api.pojo;

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
@Table(name = "artwork")
public class Artwork {
    @Id
    @Column(name = "pk_artwork_id", nullable = false, unique = true)
    private int artworkId;
    private String artworkTitle;
    private int authorId;
    private int authorName;
    private boolean hasSeries;
    private String description;
    private String illustUrlSmall;
    private String illustUrlOriginal;
    private String illustUrlMini;
    private String illustUrlThumb;
    private String illustUrlRegular;
    private int pageCount;
    private int bookmarkCount;
    private int likeCount;
    private int viewCount;
    private int grading;
    private String tags;
    private Date createTime;
    private Date updateTime;
    private Date patchTime;
    private int seriesId;
    private int seriesOrder;
    private int nextArtworkId;
    private String nextArtworkTitle;
    private int previousArtworkId;
    private String previousArtworkTitle;

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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public boolean isHasSeries() {
        return hasSeries;
    }

    public void setHasSeries(boolean hasSeries) {
        this.hasSeries = hasSeries;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIllustUrlSmall() {
        return illustUrlSmall;
    }

    public void setIllustUrlSmall(String illustUrlSmall) {
        this.illustUrlSmall = illustUrlSmall;
    }

    public String getIllustUrlOriginal() {
        return illustUrlOriginal;
    }

    public void setIllustUrlOriginal(String illustUrlOriginal) {
        this.illustUrlOriginal = illustUrlOriginal;
    }

    public String getIllustUrlMini() {
        return illustUrlMini;
    }

    public void setIllustUrlMini(String illustUrlMini) {
        this.illustUrlMini = illustUrlMini;
    }

    public String getIllustUrlThumb() {
        return illustUrlThumb;
    }

    public void setIllustUrlThumb(String illustUrlThumb) {
        this.illustUrlThumb = illustUrlThumb;
    }

    public String getIllustUrlRegular() {
        return illustUrlRegular;
    }

    public void setIllustUrlRegular(String illustUrlRegular) {
        this.illustUrlRegular = illustUrlRegular;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getBookmarkCount() {
        return bookmarkCount;
    }

    public void setBookmarkCount(int bookmarkCount) {
        this.bookmarkCount = bookmarkCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getGrading() {
        return grading;
    }

    public void setGrading(int grading) {
        this.grading = grading;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPatchTime() {
        return patchTime;
    }

    public void setPatchTime(Date patchTime) {
        this.patchTime = patchTime;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public int getSeriesOrder() {
        return seriesOrder;
    }

    public void setSeriesOrder(int order) {
        this.seriesOrder = order;
    }

    public int getNextArtworkId() {
        return nextArtworkId;
    }

    public void setNextArtworkId(int nextArtworkId) {
        this.nextArtworkId = nextArtworkId;
    }

    public String getNextArtworkTitle() {
        return nextArtworkTitle;
    }

    public void setNextArtworkTitle(String nextArtworkTitle) {
        this.nextArtworkTitle = nextArtworkTitle;
    }

    public int getPreviousArtworkId() {
        return previousArtworkId;
    }

    public void setPreviousArtworkId(int previousArtworkId) {
        this.previousArtworkId = previousArtworkId;
    }

    public String getPreviousArtworkTitle() {
        return previousArtworkTitle;
    }

    public void setPreviousArtworkTitle(String previousArtworkTitle) {
        this.previousArtworkTitle = previousArtworkTitle;
    }

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
                ", order=" + seriesOrder +
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


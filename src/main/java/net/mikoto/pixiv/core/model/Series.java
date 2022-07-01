package net.mikoto.pixiv.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/4/22 12:38
 */
@Entity
@Table(name = "series")
public class Series {
    @Id
    @Column(name = "pk_series_id", nullable = false, unique = true)
    private int seriesId;
    private int authorId;
    private String seriesTitle;
    private String frontImageUrl;
    private String description;
    private Date createTime;
    private Date updateTime;
    private Date patchTime;

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public String getFrontImageUrl() {
        return frontImageUrl;
    }

    public void setFrontImageUrl(String frontImageUrl) {
        this.frontImageUrl = frontImageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nSeries{" +
                "seriesId=" + seriesId +
                ", authorId=" + authorId +
                ", seriesTitle='" + seriesTitle + '\'' +
                ", description='" + description + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", patchTime=" + patchTime +
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
        Series series = (Series) o;
        return seriesId == series.seriesId && authorId == series.authorId && seriesTitle.equals(series.seriesTitle) && Objects.equals(frontImageUrl, series.frontImageUrl) && Objects.equals(description, series.description) && createTime.equals(series.createTime) && updateTime.equals(series.updateTime) && patchTime.equals(series.patchTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seriesId, authorId, seriesTitle, frontImageUrl, description, createTime, updateTime, patchTime);
    }
}

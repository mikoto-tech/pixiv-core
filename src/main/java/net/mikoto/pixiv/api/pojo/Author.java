package net.mikoto.pixiv.api.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/4/21 9:02
 */
@Entity
@Table(name = "author")
public class Author {
    @Id
    @Column(name = "pk_author_id", nullable = false, unique = true)
    private int authorId;
    private String authorName;
    private String authorUrl;
    private String authorUrlBig;
    private boolean premium;
    private String background;
    private Date patchTime;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public void setAuthorUrl(String authorUrl) {
        this.authorUrl = authorUrl;
    }

    public String getAuthorUrlBig() {
        return authorUrlBig;
    }

    public void setAuthorUrlBig(String authorUrlBig) {
        this.authorUrlBig = authorUrlBig;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Date getPatchTime() {
        return patchTime;
    }

    public void setPatchTime(Date patchTime) {
        this.patchTime = patchTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return authorId == author.authorId && premium == author.premium && authorName.equals(author.authorName) && authorUrl.equals(author.authorUrl) && authorUrlBig.equals(author.authorUrlBig) && Objects.equals(background, author.background) && patchTime.equals(author.patchTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, authorName, authorUrl, authorUrlBig, premium, background, patchTime);
    }

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nAuthor{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                ", authorUrl='" + authorUrl + '\'' +
                ", authorUrlBig='" + authorUrlBig + '\'' +
                ", premium=" + premium +
                ", background='" + background + '\'' +
                ", patchTime=" + patchTime +
                '}';
    }
}

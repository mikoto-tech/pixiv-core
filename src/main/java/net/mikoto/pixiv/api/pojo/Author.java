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
 * @date 2022/4/21 9:02
 */
@Entity
@Getter
@Setter
@Table(name = "author")
public class Author {
    @Id
    @Column(name = "pk_author_id", nullable = false, unique = true)
    private int authorId;
    @Column(name = "author_name", nullable = false)
    private String authorName;
    @Column(name = "author_url", nullable = false)
    private String authorUrl;
    @Column(name = "author_url_big", nullable = false)
    private String authorUrlBig;
    @Column(name = "premium", nullable = false)
    private boolean premium;
    @Column(name = "background")
    private String background;
    @Column(name = "patch_time", nullable = false)
    private Date patchTime;

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

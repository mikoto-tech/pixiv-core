package net.mikoto.pixiv.core.model;

import net.mikoto.pixiv.core.annotation.ForbiddenField;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

/**
 * @author mikoto
 * @date 2022/2/1 19:22
 * <p>
 * sql:
 * <p>
 * create table pixiv.user
 * (
 *     pk_user_id    bigint unsigned auto_increment
 *         primary key,
 *     user_name     varchar(25) not null,
 *     user_password varchar(64) not null,
 *     user_salt     varchar(10) not null,
 *     create_time   datetime    not null,
 *     update_time   datetime    not null,
 *     constraint user_pk_user_id_uindex
 *         unique (pk_user_id),
 *     constraint user_user_name_uindex
 *         unique (user_name)
 * );
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "pk_user_id", nullable = false, unique = true)
    private int userId;
    private String userName;
    @ForbiddenField
    private String userPassword;
    @ForbiddenField
    private String userSalt;
    private Date createTime;
    private Date updateTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
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

    @Override
    public String toString() {
        return "Mikoto-Pixiv-Generic-Data-Type[" + this.getClass().getPackage().getName() + this.getClass().getName() + "]:\nUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSalt='" + userSalt + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
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
        User user = (User) o;
        return userId == user.userId && userName.equals(user.userName) && userPassword.equals(user.userPassword) && userSalt.equals(user.userSalt) && createTime.equals(user.createTime) && updateTime.equals(user.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPassword, userSalt, createTime, updateTime);
    }
}

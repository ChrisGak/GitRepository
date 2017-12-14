package com.ssau.typingTutor.server.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "users", schema = "typingTutor", catalog = "postgres")
public class EntitySourceUsersEntity {
    private String password;
    private boolean isAdmin;
    private String login;
    private Date lastActivityDate;

    @Basic
    @Column(name = "password", nullable = false, length = -1)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "isAdmin", nullable = false)
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Id
    @Column(name = "login", nullable = false, length = -1)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "lastActivityDate", nullable = true)
    public Date getLastActivityDate() {
        return lastActivityDate;
    }

    public void setLastActivityDate(Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntitySourceUsersEntity that = (EntitySourceUsersEntity) o;

        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (lastActivityDate != null ? !lastActivityDate.equals(that.lastActivityDate) : that.lastActivityDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = password != null ? password.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (lastActivityDate != null ? lastActivityDate.hashCode() : 0);
        return result;
    }
}

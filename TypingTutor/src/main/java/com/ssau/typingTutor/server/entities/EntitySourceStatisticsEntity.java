package com.ssau.typingTutor.server.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "statistics", schema = "typingTutor", catalog = "postgres")
public class EntitySourceStatisticsEntity {
    private int id;
    private Date date;
    private Double errorsPercent;
    private Double elapsedTime;
    private Boolean isSuccess;
    private Double averageSpeed;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = true)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "errorsPercent", nullable = true, precision = 0)
    public Double getErrorsPercent() {
        return errorsPercent;
    }

    public void setErrorsPercent(Double errorsPercent) {
        this.errorsPercent = errorsPercent;
    }

    @Basic
    @Column(name = "elapsedTime", nullable = true, precision = 0)
    public Double getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Double elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @Basic
    @Column(name = "IsSuccess", nullable = true)
    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    @Basic
    @Column(name = "averageSpeed", nullable = true, precision = 0)
    public Double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntitySourceStatisticsEntity that = (EntitySourceStatisticsEntity) o;

        if (id != that.id) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (errorsPercent != null ? !errorsPercent.equals(that.errorsPercent) : that.errorsPercent != null)
            return false;
        if (elapsedTime != null ? !elapsedTime.equals(that.elapsedTime) : that.elapsedTime != null) return false;
        if (averageSpeed != null ? !averageSpeed.equals(that.averageSpeed) : that.averageSpeed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (errorsPercent != null ? errorsPercent.hashCode() : 0);
        result = 31 * result + (elapsedTime != null ? elapsedTime.hashCode() : 0);
        result = 31 * result + (averageSpeed != null ? averageSpeed.hashCode() : 0);
        return result;
    }
}

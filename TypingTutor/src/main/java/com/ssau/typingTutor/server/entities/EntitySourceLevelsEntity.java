package com.ssau.typingTutor.server.entities;

import javax.persistence.*;

@Entity
@Table(name = "levels", schema = "typingTutor", catalog = "postgres")
public class EntitySourceLevelsEntity {
    private int id;
    private Double minimumSpeed;
    private Double allowableErrorsPercent;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "minimumSpeed", nullable = true, precision = 0)
    public Double getMinimumSpeed() {
        return minimumSpeed;
    }

    public void setMinimumSpeed(Double minimumSpeed) {
        this.minimumSpeed = minimumSpeed;
    }

    @Basic
    @Column(name = "allowableErrorsPercent", nullable = true, precision = 0)
    public Double getAllowableErrorsPercent() {
        return allowableErrorsPercent;
    }

    public void setAllowableErrorsPercent(Double allowableErrorsPercent) {
        this.allowableErrorsPercent = allowableErrorsPercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntitySourceLevelsEntity that = (EntitySourceLevelsEntity) o;

        if (id != that.id) return false;
        if (minimumSpeed != null ? !minimumSpeed.equals(that.minimumSpeed) : that.minimumSpeed != null) return false;
        if (allowableErrorsPercent != null ? !allowableErrorsPercent.equals(that.allowableErrorsPercent) : that.allowableErrorsPercent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (minimumSpeed != null ? minimumSpeed.hashCode() : 0);
        result = 31 * result + (allowableErrorsPercent != null ? allowableErrorsPercent.hashCode() : 0);
        return result;
    }
}

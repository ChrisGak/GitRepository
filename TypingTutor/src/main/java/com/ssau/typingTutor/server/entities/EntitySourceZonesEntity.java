package com.ssau.typingTutor.server.entities;

import javax.persistence.*;

@Entity
@Table(name = "zones", schema = "typingTutor", catalog = "postgres")
public class EntitySourceZonesEntity {
    private int id;
    private String symbols;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "symbols", nullable = true, length = -1)
    public String getSymbols() {
        return symbols;
    }

    public void setSymbols(String symbols) {
        this.symbols = symbols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntitySourceZonesEntity that = (EntitySourceZonesEntity) o;

        if (id != that.id) return false;
        if (symbols != null ? !symbols.equals(that.symbols) : that.symbols != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (symbols != null ? symbols.hashCode() : 0);
        return result;
    }
}

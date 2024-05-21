package cn2oeh.futoverseny.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Verseny {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long versenyId;
    private String versenyName;
    private Integer versenyLength;

    public Long getVersenyId() {
        return versenyId;
    }

    public void setVersenyId(Long versenyId) {
        this.versenyId = versenyId;
    }

    public String getVersenyName() {
        return versenyName;
    }

    public void setVersenyName(String versenyName) {
        this.versenyName = versenyName;
    }

    public Integer getVersenyLength() {
        return versenyLength;
    }

    public void setVersenyLength(Integer versenyLength) {
        this.versenyLength = versenyLength;
    }
}

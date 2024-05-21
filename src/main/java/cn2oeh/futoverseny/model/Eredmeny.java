package cn2oeh.futoverseny.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Eredmeny {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long futoId;
    private String eredmenyFutoName;
    private Integer eredmenyVersenyName;
    private long eredmenyTime;

    public Long getFutoId() {
        return futoId;
    }

    public void setFutoId(Long futoId) {
        this.futoId = futoId;
    }

    public String getEredmenyFutoName() {
        return eredmenyFutoName;
    }

    public void setEredmenyFutoName(String eredmenyFutoName) {
        this.eredmenyFutoName = eredmenyFutoName;
    }

    public Integer getEredmenyVersenyName() {
        return eredmenyVersenyName;
    }

    public void setEredmenyVersenyName(Integer eredmenyVersenyName) {
        this.eredmenyVersenyName = eredmenyVersenyName;
    }

    public long getEredmenyTime() {
        return eredmenyTime;
    }

    public void setEredmenyTime(long eredmenyTime) {
        this.eredmenyTime = eredmenyTime;
    }
}

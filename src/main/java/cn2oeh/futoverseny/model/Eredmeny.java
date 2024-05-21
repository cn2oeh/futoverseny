package cn2oeh.futoverseny.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Eredmeny {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long eredmenyId;
    private String eredmenyFutoName;
    private String eredmenyVersenyName;
    private Long eredmenyTime;

    public Long getEredmenyId() {
        return eredmenyId;
    }

    public void setEredmenyId(Long eredmenyId) {
        this.eredmenyId = eredmenyId;
    }

    public String getEredmenyFutoName() {
        return eredmenyFutoName;
    }

    public void setEredmenyFutoName(String eredmenyFutoName) {
        this.eredmenyFutoName = eredmenyFutoName;
    }

    public String getEredmenyVersenyName() {
        return eredmenyVersenyName;
    }

    public void setEredmenyVersenyName(String eredmenyVersenyName) {
        this.eredmenyVersenyName = eredmenyVersenyName;
    }

    public Long getEredmenyTime() {
        return eredmenyTime;
    }

    public void setEredmenyTime(Long eredmenyTime) {
        this.eredmenyTime = eredmenyTime;
    }
}
package cn2oeh.futoverseny.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Futo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long futoId;
    private String futoName;
    private Integer futoAge;
    private String futoSex;

    public Long getFutoId() {
        return futoId;
    }

    public void setFutoId(Long futoId) {
        this.futoId = futoId;
    }

    public String getFutoName() {
        return futoName;
    }

    public void setFutoName(String futoName) {
        this.futoName = futoName;
    }

    public Integer getFutoAge() {
        return futoAge;
    }

    public void setFutoAge(Integer futoAge) {
        this.futoAge = futoAge;
    }

    public String getFutoSex() {
        return futoSex;
    }

    public void setFutoSex(String futoSex) {
        this.futoSex = futoSex;
    }
}

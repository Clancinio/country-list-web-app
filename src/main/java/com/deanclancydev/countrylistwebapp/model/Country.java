package com.deanclancydev.countrylistwebapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "description")
    private String description;

    @Column(name = "with_who")
    private String withWho;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWithWho() {
        return withWho;
    }

    public void setWithWho(String withWho) {
        this.withWho = withWho;
    }



}

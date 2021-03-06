package com.example.demo.po;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "theater")
@IdClass(TheaterId.class)
public class Theater implements Serializable {
    @Id
    private String companyname;
    @Id
    private String theatername;
    private String zipcode;
    private String street;
    private String city;
    private String state;
    private Integer capacity;
    private String manager;

    @ManyToOne(targetEntity = Company.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "companyname", referencedColumnName = "name", insertable = false, updatable = false)
    private Company company;

    @OneToOne(targetEntity = Manager.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "manager", referencedColumnName = "username", insertable = false, updatable = false)
    private Manager managerClass;

    public Theater() {
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getTheatername() {
        return theatername;
    }

    public void setTheatername(String theatername) {
        this.theatername = theatername;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}

package com.softwareArchitecture.assignment2.oshana.findYourPhone.model;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Entity
@Table(name="phones")
public class Phones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "details")
    private String details;

    @Column(name = "price")
    private String price;

    @Column(name = "searchTags")
    private String searchTags;

    @Column(name = "store")
    private String StoreName;

    @Column(name = "offer")
    private String offer;

    @Column(name="buyingUrl")
    private String buyingUrl;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "phone_offer", joinColumns = @JoinColumn(name = "phone_id"), inverseJoinColumns = @JoinColumn(name = "offer_id"))
//    private Set<Offers> offers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_phone")
    private Users user;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDetails() {
        return details;
    }

    public String getPrice() {
        return price;
    }

    public String getSearchTags() {
        return searchTags;
    }

    public String getOffer() {
        return offer;
    }

    public String getBuyingUrl() {
        return buyingUrl;
    }

    public Users getUser() {
        return user;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setSearchTags(String searchTags) {
        this.searchTags = searchTags;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public void setBuyingUrl(String buyingUrl) {
        this.buyingUrl = buyingUrl;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }
}

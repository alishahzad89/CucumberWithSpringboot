package com.cucumber.springboot.response.waarkoop;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "provider",
        "title",
        "url",
        "brand",
        "price",
        "unit",
        "isPromo",
        "promoDetails",
        "image"
})

public class ProductDetailsResponse {

    @JsonProperty("provider")
    private String provider;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("brand")
    private Object brand;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("isPromo")
    private Boolean isPromo;
    @JsonProperty("promoDetails")
    private String promoDetails;
    @JsonProperty("image")
    private String image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("provider")
    public String getProvider() {
        return provider;
    }

    @JsonProperty("provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("brand")
    public Object getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(Object brand) {
        this.brand = brand;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @JsonProperty("isPromo")
    public Boolean getIsPromo() {
        return isPromo;
    }

    @JsonProperty("isPromo")
    public void setIsPromo(Boolean isPromo) {
        this.isPromo = isPromo;
    }

    @JsonProperty("promoDetails")
    public String getPromoDetails() {
        return promoDetails;
    }

    @JsonProperty("promoDetails")
    public void setPromoDetails(String promoDetails) {
        this.promoDetails = promoDetails;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
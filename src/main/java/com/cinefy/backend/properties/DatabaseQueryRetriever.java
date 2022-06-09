package com.cinefy.backend.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "sqlqueries")
@Configuration("sqlqueries")
public class DatabaseQueryRetriever {

    private String homepagedata;
    private String bookinginsertion;
    private String pricecalculation;

    public String getHomepagedata() {
        return homepagedata;
    }

    public void setHomepagedata(String homepagedata) {
        this.homepagedata = homepagedata;
    }

    public String getBookinginsertion() {
        return bookinginsertion;
    }

    public void setBookinginsertion(String bookinginsertion) {
        this.bookinginsertion = bookinginsertion;
    }

    public String getPricecalculation() {
        return pricecalculation;
    }

    public void setPricecalculation(String pricecalculation) {
        this.pricecalculation = pricecalculation;
    }
}

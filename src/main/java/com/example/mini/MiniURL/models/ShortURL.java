package com.example.mini.MiniURL.models;


import java.time.Instant;

public class ShortURL {
    private String shortURL;
    private String longURL;
    private Instant expireTime;
    private String ownerKey;


    @Override
    public String toString() {
        return "ShortURL{" +
                "shortURL='" + shortURL + '\'' +
                ", longURL='" + longURL + '\'' +
                ", expireTime=" + expireTime +
                ", ownerKey='" + ownerKey + '\'' +
                '}';
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    public String getLongURL() {
        return longURL;
    }

    public void setLongURL(String longURL) {
        this.longURL = longURL;
    }

    public Instant getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Instant expireTime) {
        this.expireTime = expireTime;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public void setOwnerKey(String ownerKey) {
        this.ownerKey = ownerKey;
    }

}

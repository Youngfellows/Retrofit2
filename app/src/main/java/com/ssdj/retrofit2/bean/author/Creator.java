
package com.ssdj.retrofit2.bean.author;

import java.util.HashMap;
import java.util.Map;

public class Creator {

    private String profileUrl;
    private String bio;
    private String hash;
    private Long uid;
    private Boolean isOrg;
    private String description;
    private Boolean isOrgWhiteList;
    private String slug;
    private Avatar avatar;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Boolean getIsOrg() {
        return isOrg;
    }

    public void setIsOrg(Boolean isOrg) {
        this.isOrg = isOrg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsOrgWhiteList() {
        return isOrgWhiteList;
    }

    public void setIsOrgWhiteList(Boolean isOrgWhiteList) {
        this.isOrgWhiteList = isOrgWhiteList;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

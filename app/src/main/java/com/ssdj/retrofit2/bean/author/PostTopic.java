
package com.ssdj.retrofit2.bean.author;

import java.util.HashMap;
import java.util.Map;

public class PostTopic {

    private Long postsCount;
    private Long id;
    private String name;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(Long postsCount) {
        this.postsCount = postsCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

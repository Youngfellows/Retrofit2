
package com.ssdj.retrofit2.bean.author;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Author {

    private Long followersCount;
    private Creator creator;
    private List<Topic> topics = null;
    private String activateState;
    private String href;
    private Boolean acceptSubmission;
    private Boolean firstTime;
    private List<PostTopic> postTopics = null;
    private String pendingName;
    private Avatar_ avatar;
    private Boolean canManage;
    private String description;
    private List<Object> pendingTopics = null;
    private Long nameCanEditUntil;
    private String reason;
    private Long banUntil;
    private String slug;
    private String name;
    private String url;
    private String intro;
    private Long topicsCanEditUntil;
    private String activateAuthorRequested;
    private String commentPermission;
    private Boolean following;
    private Long postsCount;
    private Boolean canPost;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public String getActivateState() {
        return activateState;
    }

    public void setActivateState(String activateState) {
        this.activateState = activateState;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Boolean getAcceptSubmission() {
        return acceptSubmission;
    }

    public void setAcceptSubmission(Boolean acceptSubmission) {
        this.acceptSubmission = acceptSubmission;
    }

    public Boolean getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Boolean firstTime) {
        this.firstTime = firstTime;
    }

    public List<PostTopic> getPostTopics() {
        return postTopics;
    }

    public void setPostTopics(List<PostTopic> postTopics) {
        this.postTopics = postTopics;
    }

    public String getPendingName() {
        return pendingName;
    }

    public void setPendingName(String pendingName) {
        this.pendingName = pendingName;
    }

    public Avatar_ getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar_ avatar) {
        this.avatar = avatar;
    }

    public Boolean getCanManage() {
        return canManage;
    }

    public void setCanManage(Boolean canManage) {
        this.canManage = canManage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getPendingTopics() {
        return pendingTopics;
    }

    public void setPendingTopics(List<Object> pendingTopics) {
        this.pendingTopics = pendingTopics;
    }

    public Long getNameCanEditUntil() {
        return nameCanEditUntil;
    }

    public void setNameCanEditUntil(Long nameCanEditUntil) {
        this.nameCanEditUntil = nameCanEditUntil;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Long getBanUntil() {
        return banUntil;
    }

    public void setBanUntil(Long banUntil) {
        this.banUntil = banUntil;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Long getTopicsCanEditUntil() {
        return topicsCanEditUntil;
    }

    public void setTopicsCanEditUntil(Long topicsCanEditUntil) {
        this.topicsCanEditUntil = topicsCanEditUntil;
    }

    public String getActivateAuthorRequested() {
        return activateAuthorRequested;
    }

    public void setActivateAuthorRequested(String activateAuthorRequested) {
        this.activateAuthorRequested = activateAuthorRequested;
    }

    public String getCommentPermission() {
        return commentPermission;
    }

    public void setCommentPermission(String commentPermission) {
        this.commentPermission = commentPermission;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
    }

    public Long getPostsCount() {
        return postsCount;
    }

    public void setPostsCount(Long postsCount) {
        this.postsCount = postsCount;
    }

    public Boolean getCanPost() {
        return canPost;
    }

    public void setCanPost(Boolean canPost) {
        this.canPost = canPost;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

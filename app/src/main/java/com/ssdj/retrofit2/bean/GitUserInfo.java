package com.ssdj.retrofit2.bean;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/22 1:07
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public class GitUserInfo
{

    /**
     * gists_url : https://api.github.com/users/lenve/gists{/gist_id}
     * repos_url : https://api.github.com/users/lenve/repos
     * following_url : https://api.github.com/users/lenve/following{/other_user}
     * created_at : 2013-11-24T13:16:33Z
     * blog : blog.csdn.net/u012702547
     * login : lenve
     * type : User
     * subscriptions_url : https://api.github.com/users/lenve/subscriptions
     * updated_at : 2017-02-13T12:23:19Z
     * site_admin : false
     * id : 6023444
     * public_repos : 32
     * gravatar_id :
     * email : wangsong0210@gmail.com
     * organizations_url : https://api.github.com/users/lenve/orgs
     * starred_url : https://api.github.com/users/lenve/starred{/owner}{/repo}
     * followers_url : https://api.github.com/users/lenve/followers
     * public_gists : 0
     * url : https://api.github.com/users/lenve
     * received_events_url : https://api.github.com/users/lenve/received_events
     * followers : 62
     * avatar_url : https://avatars.githubusercontent.com/u/6023444?v=3
     * events_url : https://api.github.com/users/lenve/events{/privacy}
     * following : 89
     * html_url : https://github.com/lenve
     * name : 江南一点雨
     * location : China GuangZhou
     */
    private String gists_url;
    private String repos_url;
    private String following_url;
    private String created_at;
    private String blog;
    private String login;
    private String type;
    private String subscriptions_url;
    private String updated_at;
    private boolean site_admin;
    private int id;
    private int public_repos;
    private String gravatar_id;
    private String email;
    private String organizations_url;
    private String starred_url;
    private String followers_url;
    private int public_gists;
    private String url;
    private String received_events_url;
    private int followers;
    private String avatar_url;
    private String events_url;
    private int following;
    private String html_url;
    private String name;
    private String location;

    public void setGists_url(String gists_url)
    {
        this.gists_url = gists_url;
    }

    public void setRepos_url(String repos_url)
    {
        this.repos_url = repos_url;
    }

    public void setFollowing_url(String following_url)
    {
        this.following_url = following_url;
    }

    public void setCreated_at(String created_at)
    {
        this.created_at = created_at;
    }

    public void setBlog(String blog)
    {
        this.blog = blog;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setSubscriptions_url(String subscriptions_url)
    {
        this.subscriptions_url = subscriptions_url;
    }

    public void setUpdated_at(String updated_at)
    {
        this.updated_at = updated_at;
    }

    public void setSite_admin(boolean site_admin)
    {
        this.site_admin = site_admin;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setPublic_repos(int public_repos)
    {
        this.public_repos = public_repos;
    }

    public void setGravatar_id(String gravatar_id)
    {
        this.gravatar_id = gravatar_id;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setOrganizations_url(String organizations_url)
    {
        this.organizations_url = organizations_url;
    }

    public void setStarred_url(String starred_url)
    {
        this.starred_url = starred_url;
    }

    public void setFollowers_url(String followers_url)
    {
        this.followers_url = followers_url;
    }

    public void setPublic_gists(int public_gists)
    {
        this.public_gists = public_gists;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public void setReceived_events_url(String received_events_url)
    {
        this.received_events_url = received_events_url;
    }

    public void setFollowers(int followers)
    {
        this.followers = followers;
    }

    public void setAvatar_url(String avatar_url)
    {
        this.avatar_url = avatar_url;
    }

    public void setEvents_url(String events_url)
    {
        this.events_url = events_url;
    }

    public void setFollowing(int following)
    {
        this.following = following;
    }

    public void setHtml_url(String html_url)
    {
        this.html_url = html_url;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getGists_url()
    {
        return gists_url;
    }

    public String getRepos_url()
    {
        return repos_url;
    }

    public String getFollowing_url()
    {
        return following_url;
    }

    public String getCreated_at()
    {
        return created_at;
    }

    public String getBlog()
    {
        return blog;
    }

    public String getLogin()
    {
        return login;
    }

    public String getType()
    {
        return type;
    }

    public String getSubscriptions_url()
    {
        return subscriptions_url;
    }

    public String getUpdated_at()
    {
        return updated_at;
    }

    public boolean isSite_admin()
    {
        return site_admin;
    }

    public int getId()
    {
        return id;
    }

    public int getPublic_repos()
    {
        return public_repos;
    }

    public String getGravatar_id()
    {
        return gravatar_id;
    }

    public String getEmail()
    {
        return email;
    }

    public String getOrganizations_url()
    {
        return organizations_url;
    }

    public String getStarred_url()
    {
        return starred_url;
    }

    public String getFollowers_url()
    {
        return followers_url;
    }

    public int getPublic_gists()
    {
        return public_gists;
    }

    public String getUrl()
    {
        return url;
    }

    public String getReceived_events_url()
    {
        return received_events_url;
    }

    public int getFollowers()
    {
        return followers;
    }

    public String getAvatar_url()
    {
        return avatar_url;
    }

    public String getEvents_url()
    {
        return events_url;
    }

    public int getFollowing()
    {
        return following;
    }

    public String getHtml_url()
    {
        return html_url;
    }

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }
}

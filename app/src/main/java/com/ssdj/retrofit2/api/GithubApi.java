package com.ssdj.retrofit2.api;

import com.ssdj.retrofit2.bean.Contributor;
import com.ssdj.retrofit2.bean.GitUserInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/22 1:00
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */

public interface GithubApi
{
    /***
     * https://api.github.com/users/lenve/repos
     * request.addHeader("Accept", "text/json");
     * <p>
     * https://api.github.com/users/lenve
     * request.addHeader("Accept", "text/json");
     * <p>
     * https://api.github.com/repos/lenve/contextMenu/commits
     * https://api.github.com/repos/lenve/contextMenu/commits
     * request.addHeader("Accept", "text/json");
     */
    @Headers({"Accept:text/json"})
    @GET("users/{user}")
    Call<GitUserInfo> getGitUserInfo(@Path("user") String user);

    /**
     * 比如你要请求这么一个api：
     * https://api.github.com/repos/{owner}/{repo}/contributo
     * https://api.github.com/repos/square/retrofit/contributors
     */
    //使用Gson解析返回的json数据
    @GET("repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> getContributors(@Path("owner") String owner, @Path("repo") String repo);

    //自定义转换器
    //    @GET("repos/{owner}/{repo}/contributors")
    //    Call<String> getContributors(@Path("owner") String owner, @Path("repo") String repo);


}

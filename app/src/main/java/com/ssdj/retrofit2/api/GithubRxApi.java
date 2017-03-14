package com.ssdj.retrofit2.api;

import com.ssdj.retrofit2.bean.GitUserInfo;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/22 1:32
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */
public interface GithubRxApi
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
    Observable<GitUserInfo> getUser(@Path("user") String user);
}

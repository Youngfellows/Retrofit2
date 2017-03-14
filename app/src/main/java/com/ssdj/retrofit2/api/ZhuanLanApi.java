package com.ssdj.retrofit2.api;

import com.ssdj.retrofit2.bean.author.Author;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author 陈  杰
 * @version $Rev$
 * @time 2017/2/22 21:03
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes ${TODO}
 */

public interface ZhuanLanApi
{
    /**
     * 查看知乎专栏的某个作者信息
     * https://zhuanlan.zhihu.com/api/columns/qinchao
     */
    @GET("/api/columns/{author}")
    Call<Author> getZhuanLanAuthor(@Path("author") String author);
}

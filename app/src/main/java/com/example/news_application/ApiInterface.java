package com.example.news_application;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
   String Base_Url="https://newsapi.org/v2/";

   @GET("Top Headlines")
    Call<MainNews>getNews(
     @Query("Country") String country,
     @Query("PageSize") int pagesize,
     @Query("apikey") String apikey
   );
    @GET("Top Headlines")
    Call<MainNews>getCategory(
            @Query("Country") String country,
            @Query("category")String category,
            @Query("PageSize") int pagesize,
            @Query("ApiKey") String apikey
    );

}

package com.example.news_application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {
public static Retrofit retrofit=null;
public static ApiInterface getApiInterface(){
if (retrofit==null){
retrofit=new Retrofit.Builder(ApiInterface.Base_Url)
        .addConverterFactory(GsonConverterFactory.create()).build();


}
return retrofit.create(ApiInterface.class);
}
}

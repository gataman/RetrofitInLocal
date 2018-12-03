package com.gurcanataman.retrofitinlocal.RestApi;

import com.gurcanataman.retrofitinlocal.Model.ResponseCRUD;
import com.gurcanataman.retrofitinlocal.classes.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface RestApi {

    @POST("users/usercreate.php")
    Call<ResponseCRUD> postUserCreate(@Body User user);



}

package com.gurcanataman.retrofitinlocal.RestApi;

import com.gurcanataman.retrofitinlocal.Model.ResponseCRUD;
import com.gurcanataman.retrofitinlocal.classes.User;

import retrofit2.Call;

public class ManagerAll extends BaseManager {

    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance(){
        return ourInstance;
    }


    public Call<ResponseCRUD> kullaniciEkle(User user){

        Call<ResponseCRUD> mod = getRestApi(BaseUrl.URL).postUserCreate(user);

        return mod;
    }
}

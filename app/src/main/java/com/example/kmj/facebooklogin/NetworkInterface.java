package com.example.kmj.facebooklogin;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface NetworkInterface {
    @GET("/token")
    Call<FacebookLoginModel> GETData(@Query("access_token") String token);
}

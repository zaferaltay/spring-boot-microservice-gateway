package com.sa.com.sho.springbootmicroservicegateway.util;

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class RetrofitUtils<T> {


    public static<T> T executeInUtil(Call<T> request){

        try {
            Response<T> response= request.execute();

            if (!response.isSuccessful()){

            }
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

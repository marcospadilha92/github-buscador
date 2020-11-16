package com.marcos.githubbuscador.retrofit;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;

public class RetrofitFactory {
    private RetrofitFactory() {
    }

    private static Retrofit getRetrofit(String url) {
        final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.MINUTES)
                .writeTimeout(10, TimeUnit.MINUTES)
                .readTimeout(10, TimeUnit.MINUTES)
                .build();

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        gsonBuilder.setLenient();

        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gsonBuilder.create()))
                .client(okHttpClient)
                .build();
    }

    public static Requests getRequests(String endpoint) {
        return getRetrofit(endpoint).create(Requests.class);
    }
}

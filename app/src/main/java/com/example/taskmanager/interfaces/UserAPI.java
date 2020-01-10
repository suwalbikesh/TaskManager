package com.example.taskmanager.interfaces;

import com.example.taskmanager.models.UserModel;
import com.example.taskmanager.server_response.ImageResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UserAPI {
    //register users
    @POST("users/signup")
    Call<Void> userRegister(@Body UserModel userModel);

    //upload image
    @Multipart
    @POST("upload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);
}

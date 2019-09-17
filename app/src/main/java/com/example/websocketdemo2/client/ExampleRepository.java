package com.example.websocketdemo2.client;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Naik on 24.02.17.
 */
public interface ExampleRepository {

    @POST("tunnel/patrolwebsocket")
    Completable sendRestEcho(@Query("msg") String message);
}

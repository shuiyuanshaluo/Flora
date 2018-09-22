package com.jascal.flora.net.service;

import com.jascal.flora.net.bean.Response;

import retrofit2.http.GET;
import rx.Observable;

public interface FeedService {

    @GET("feed-app")
    Observable<Response> getFeedList();

}
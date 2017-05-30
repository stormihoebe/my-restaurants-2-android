package com.epicodus.myrestaurants;

import okhttp3.Callback;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;

public class YelpServices {
    public static void findRestaurants(String location, Callback callback) {
        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(Constants.YELP_CONSUMER_KEY, Constants.YELP_CONSUMER_SECRET);
        consumer.setTokenWithSecret(Constants.YELP_TOKEN, Constants.YELP_TOKEN_SECRET);
    }
}


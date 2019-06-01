package com.xjtu.maxuefeng.colaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 85377 on 2018/1/6.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}

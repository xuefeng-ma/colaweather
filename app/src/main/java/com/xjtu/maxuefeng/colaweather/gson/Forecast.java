package com.xjtu.maxuefeng.colaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 85377 on 2018/1/6.
 */

public class Forecast {
    public String date;

    @SerializedName("temp")
    public Temperature temperature;

    @SerializedName("cond")
    public Now.More more;

    public class Temperature{

        public String max;
        public String min;

    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}

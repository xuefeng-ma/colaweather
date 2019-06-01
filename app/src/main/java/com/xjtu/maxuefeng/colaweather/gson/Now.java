package com.xjtu.maxuefeng.colaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 85377 on 2018/1/6.
 */

public class Now {
    @SerializedName("tep")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}

package com.xjtu.maxuefeng.colaweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 85377 on 2018/1/6.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public Carwash carwash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class Carwash{
        @SerializedName("txt")
        public String info;

    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}

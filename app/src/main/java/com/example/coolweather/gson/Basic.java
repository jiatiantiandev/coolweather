package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 贾添添 on 2018/4/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Updata update;
    public class Updata{
        @SerializedName("loc")
        public String updateTime;
    }
}

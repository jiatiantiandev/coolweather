package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 贾添添 on 2018/4/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")public MORE more;
    public class MORE{
        @SerializedName("txt")public String info;
    }
}

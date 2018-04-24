package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 贾添添 on 2018/4/13.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    public class Comfort{
        @SerializedName("txt")
        public String info;
           };
    @SerializedName("cw")
    public Carwash carwash;
    public class Carwash{
        @SerializedName("txt")
        public String info;
    }
    public Sport sport;
    public class Sport{
        @SerializedName("txt")
        public String info;
    }


}

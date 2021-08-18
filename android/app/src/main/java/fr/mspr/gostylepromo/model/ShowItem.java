package fr.mspr.gostylepromo.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ShowItem implements Serializable {

    @SerializedName("Name")
    public String name;
    @SerializedName("TextPromotion")
    public String textProm;
    @SerializedName("Image")
    public String imageUrl;

    public ShowItem(String name, String textProm, String imageUrl) {
        this.name = name;
        this.textProm = textProm;
        this.imageUrl = imageUrl;
    }
}

package fr.mspr.gostylepromo.model;

import java.io.Serializable;
import java.util.Date;
import com.google.gson.annotations.SerializedName;

public class PromoItem implements Serializable {

    @SerializedName("Name")
    public String name;
    @SerializedName("Reduction")
    public double reduction;
    @SerializedName("TextPromotion")
    public String textProm;
    @SerializedName("Image")
    public String imageUrl;
    @SerializedName("DateDeb")
    public Date dateDeb;
    @SerializedName("DateFin")
    public Date dateFin;

    public PromoItem(String name, double reduction, String textProm, String imageURL, Date dateDeb, Date dateFin) {
        this.name = name;
        this.reduction = reduction;
        this.textProm = textProm;
        this.imageUrl = imageURL;
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

    public String getTextProm() {
        return textProm;
    }

    public void setTextProm(String textProm) {
        this.textProm = textProm;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Date dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}

package fr.mspr.gostylepromo.model;

public class Feature {

    private String type;
    private PromoItem promoItem;
    private ShowItem showItem;

    public Feature(String type, PromoItem properties, ShowItem geometry) {
        this.type = type;
        this.promoItem = properties;
        this.showItem = geometry;
    }

    public PromoItem getPromoItems() {
        return this.promoItem;
    }
}

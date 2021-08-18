package fr.mspr.gostylepromo;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import fr.mspr.gostylepromo.model.Feature;
import fr.mspr.gostylepromo.model.PromoItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PromoActivity extends AppCompatActivity {

    public static final int KEY_PROMO = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView promoRecyclerView = findViewById(R.id.promo_recycler_view);
        promoRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        PromoAdapter promoAdapter = null;
        try {
            promoAdapter = new PromoAdapter(getPromoList());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        promoRecyclerView.setAdapter(promoAdapter);
    }

    //@Override
    public void onItemClick(Feature feature) {
        Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
        intent.putExtra(String.valueOf(KEY_PROMO), feature.getPromoItems());
        startActivity(intent);
    }

    private ArrayList<PromoItem> getPromoList() throws ParseException {
        ArrayList<PromoItem> promos = new ArrayList<>();

        PromoItem promo1 = new PromoItem("Chaussette Gauche",
                0.5,
                "Pour avoir des reductions sur les chaussettes gauches uniquement",
                "data:image/jpeg;base64,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",
                new SimpleDateFormat("yyyy-MM-dd").parse("2020-08-15"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-08-15")
        );
        promos.add(promo1);

        PromoItem promo2 = new PromoItem("Chaussette Droite",
                0.45,
                "Pour avoir des reductions sur les chaussettes droites uniquement",
                "https://ih1.redbubble.net/image.1225036502.3776/ur,socks_flatlay_medium,square,1000x1000-bg,f8f8f8.1.jpg",
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-15"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-10-11")
        );
        promos.add(promo2);

        PromoItem promo3 = new PromoItem("Fait froid",
                0.8,
                "Pour avoir des reductions sur les pulls",
                "https://www.cdiscount.com/pdt2/2/4/9/1/300x300/mp47589249/rw/sweat-a-capuche-homme-cosplay-sonspee-goldorak-swe.jpg",
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-02-20"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-01")
        );
        promos.add(promo3);

        PromoItem promo4 = new PromoItem("Chaussez vous bien",
                0.1,
                "Pour avoir des reductions sur les TN uniquement",
                "https://photos6.spartoo.com/photos/456/4564838/4564838_500_A.jpg",
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-06-09"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-08-15")
        );
        promos.add(promo4);

        PromoItem promo5 = new PromoItem("La promo du radin",
                0.01,
                "Pour avoir des reductions sur tout mais a 1%",
                "https://www.jock.life/wp-content/uploads/2019/10/mon-mec-est-radin.jpg",
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-07-15"),
                new SimpleDateFormat("yyyy-MM-dd").parse("2021-08-15")
        );
        promos.add(promo5);


        return promos;
    }
}
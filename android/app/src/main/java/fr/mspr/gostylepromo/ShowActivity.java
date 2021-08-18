package fr.mspr.gostylepromo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import fr.mspr.gostylepromo.model.PromoItem;
import fr.mspr.gostylepromo.model.ShowItem;

import static fr.mspr.gostylepromo.PromoActivity.KEY_PROMO;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show);

        TextView name = findViewById(R.id.feature_name);
        TextView reduction = findViewById(R.id.feature_street);
        TextView textProm = findViewById(R.id.feature_address);
        TextView imageUrl = findViewById(R.id.feature_type);
        TextView dateDeb = findViewById(R.id.monday_opening_value);
        TextView dateFin = findViewById(R.id.tuesday_opening_value);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null && bundle.containsKey(String.valueOf(KEY_PROMO))) {
            PromoItem promo = (PromoItem) bundle.getSerializable(String.valueOf(KEY_PROMO));
            name.setText(promo.getName());
            reduction.setText((int) promo.getReduction());
            textProm.setText(promo.getTextProm());
            imageUrl.setText(promo.getImageUrl());
            dateDeb.setText((CharSequence) promo.getDateDeb());
            dateFin.setText((CharSequence) promo.getDateFin());
        }
    }
}

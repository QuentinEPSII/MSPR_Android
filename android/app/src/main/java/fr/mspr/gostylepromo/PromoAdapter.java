package fr.mspr.gostylepromo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.bumptech.glide.Glide;
import com.bumptech.glide.Glide;

import fr.mspr.gostylepromo.model.PromoItem;

import java.util.ArrayList;

public class PromoAdapter extends RecyclerView.Adapter<PromoAdapter.ViewHolder> {

    private ArrayList<PromoItem> promos = new ArrayList<>();

    public PromoAdapter(ArrayList<PromoItem> promoList) {
        promos = promoList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View promoView = LayoutInflater.from(parent.getContext()).inflate(R.layout.promo_item, parent, false);
        return new ViewHolder(promoView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PromoItem promoItem = promos.get(position);
        if (promoItem != null) {
            holder.setData(promoItem);
        }
    }

    @Override
    public int getItemCount() {
        return promos.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView promoThumbnailView;
        private TextView titleView;
        private TextView descriptionView;
        private PromoItem promoItem;

        public ViewHolder(View itemView) {
            super(itemView);
            promoThumbnailView = itemView.findViewById(R.id.promo_thumbnail_id);
            titleView = itemView.findViewById(R.id.promo_title_id);
            descriptionView = itemView.findViewById(R.id.promo_description_id);
        }

        public void setData(PromoItem data) {
            this.promoItem = data;
            titleView.setText(promoItem.name);
            descriptionView.setText(promoItem.textProm);

            Glide.with(itemView.getContext())
                    .load(promoItem.imageUrl)
                    .into(promoThumbnailView);
        }
    }
}
package com.example.silsilahkeluarga;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder>{
    private ArrayList<Keluarga> listKeluarga;

    public KeluargaAdapter(ArrayList<Keluarga> listKeluarga) {
        this.listKeluarga = listKeluarga;
    }

    @NonNull
    @Override
    public KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new KeluargaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KeluargaViewHolder holder, int position) {
        Keluarga keluarga = listKeluarga.get(position);
        Glide.with(holder.itemView.getContext())
                .load(keluarga.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgFoto);
        holder.tvNama.setText(keluarga.getNama());
        holder.tvKeterangan.setText(keluarga.getKeterangan());

    }

    @Override
    public int getItemCount() {
        return listKeluarga.size();
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama, tvKeterangan;
        public KeluargaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvKeterangan = itemView.findViewById(R.id.tv_keterangan);
        }
    }
}

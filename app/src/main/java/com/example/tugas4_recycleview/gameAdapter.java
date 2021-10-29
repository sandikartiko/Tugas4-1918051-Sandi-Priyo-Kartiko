package com.example.tugas4_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class gameAdapter extends
        RecyclerView.Adapter<gameAdapter.gameViewHolder>{
    private ArrayList<game> dataList;
    public gameAdapter(ArrayList<game> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public gameAdapter.gameViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view =
                layoutInflater.inflate(R.layout.item_game, parent, false);
        return new gameViewHolder(view);
    }
    public void onBindViewHolder(gameViewHolder holder, int position) {
        holder.logo.setImageResource(dataList.get(position).getLogo());
        holder.txtnamagame.setText(dataList.get(position).getNamagame());
        holder.txtidgame.setText(dataList.get(position).getIdgame());
        holder.txtnamaid.setText(dataList.get(position).getNamaid());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class gameViewHolder extends
            RecyclerView.ViewHolder{
        private TextView txtnamagame, txtidgame, txtnamaid;
        private ImageView logo;
        public gameViewHolder(View itemView) {
            super(itemView);
            logo =  (ImageView) itemView.findViewById(R.id.img_logo);
            txtnamagame = (TextView) itemView.findViewById(R.id.txt_namagame);
            txtidgame = (TextView) itemView.findViewById(R.id.txt_idgame);
            txtnamaid = (TextView) itemView.findViewById(R.id.txt_namaid);
        }
    }
}
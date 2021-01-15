package com.example.a1092recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {
    String[] LogoDescription, Logo;
    Context context;
    int[] Images;

    // MyAdapter 這個類別的建構子
    MyAdapter(Context context, String[] Logo, String[] LogoDescription, int[] Images) {
        this.context = context;
        this.Logo = Logo;
        this.LogoDescription = LogoDescription;
        this.Images = Images;
    }
    // 這裡是使這個 Adapter 要連接哪個畫面
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewHolder view = new viewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_item, viewGroup, false));
        return view;
    }
    // 這裡是把要做的事件寫在這裡
    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.myTitle.setText(Logo[position]);
        holder.myDescription.setText(LogoDescription[position]);
        holder.myImageView.setImageResource(Images[position]);
    }
    // 這裡是讓 ViewHolder 知道幾個 item
    @Override
    public int getItemCount() {
        return Logo.length;
    }
    // 這裡是使 viewHolder 和畫面元件連接
    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView myImageView;
        TextView myTitle, myDescription;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            myImageView = itemView.findViewById(R.id.myImageView);
            myDescription = itemView.findViewById(R.id.myDescription);
            myTitle = itemView.findViewById(R.id.myTitle);
        }
    }

}

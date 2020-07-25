package com.example.myapplication;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
public class adapterhomestay extends RecyclerView.Adapter<adapterhomestay.ViewHolder> {
    private datahomestay[] listData;
    public adapterhomestay(datahomestay[] listData) {
        this.listData = listData;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.homestay_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder; }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final datahomestay dataList = listData[position];
        final int image = dataList.getImageId();
        final String title = dataList.getTitle();
        final String detail = dataList.getDetail();
        final String detail2 = dataList.getDetail2();
        holder.imageView.setImageResource(image);
        holder.textTitle.setText(title);
        holder.textDetail.setText(detail);
        holder.textDetail2.setText(detail2);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), detail + " " + title , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), DetailHomestay.class);
                intent.putExtra("image", image);
                intent.putExtra("title", title);
                intent.putExtra("detail", detail);
                intent.putExtra("detail2", detail2);
                view.getContext().startActivity(intent);
            }
        }); }
    @Override
    public int getItemCount() {
        return listData.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textTitle, textDetail, textDetail2;
        public CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cardView = itemView.findViewById(R.id.cardView);
            this.imageView = itemView.findViewById(R.id.list_img);
            this.textTitle = itemView.findViewById(R.id.list_title);
            this.textDetail = itemView.findViewById(R.id.list_detail);
            this.textDetail2 = itemView.findViewById(R.id.list_detail2); }}}

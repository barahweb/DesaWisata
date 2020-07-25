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
public class AdapterTempatWisata extends RecyclerView.Adapter<AdapterTempatWisata.ViewHolder> {
    private DataList_Tempatwisata[] listData;
    public AdapterTempatWisata(DataList_Tempatwisata[] listData) {
        this.listData = listData;
    }
    @NonNull
    @Override
    public AdapterTempatWisata.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.tempatwisata_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder; }
    @Override
    public void onBindViewHolder(@NonNull AdapterTempatWisata.ViewHolder holder, int position) {
            final DataList_Tempatwisata  dataList= listData[position];
            final  int image = dataList.getImageId();
            final String tittle = dataList.getTittle();
            final String detail1 = dataList.getDetail1();
            final  String detail2 = dataList.getDetail2();
            holder.imageView.setImageResource(image);
            holder.textTittle.setText(tittle);
            holder.textDetail.setText(detail1);
            holder.textDetail2.setText(detail2);
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
              Toast.makeText(v.getContext(), detail1 + " " + tittle , Toast.LENGTH_SHORT).show();
             Intent intent = new Intent(v.getContext(), DetailTempatWisata.class);
             intent.putExtra("image", image);
             intent.putExtra("tittle", tittle);
             intent.putExtra("detail", detail1);
             intent.putExtra("detail2", detail2);
             v.getContext().startActivity(intent); }
            }); }
    @Override
    public int getItemCount() {
        return listData.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
       public ImageView imageView;
       public TextView textTittle, textDetail, textDetail2;
       public CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.cardView = itemView.findViewById(R.id.cardView);
            this.imageView = itemView.findViewById(R.id.list_img);
            this.textTittle = itemView.findViewById(R.id.list_tittle);
            this.textDetail = itemView.findViewById(R.id.list_detail);
            this.textDetail2 = itemView.findViewById(R.id.list_detail2); }}}

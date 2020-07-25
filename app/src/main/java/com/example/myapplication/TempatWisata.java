package com.example.myapplication;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class TempatWisata extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempatwisata);
        getSupportActionBar().setTitle("Tempat Wisata");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        AdapterTempatWisata adapter = new AdapterTempatWisata(setdataList());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter); }
    public DataList_Tempatwisata[] setdataList(){
        DataList_Tempatwisata[] myListData = new DataList_Tempatwisata[]{
                new DataList_Tempatwisata(R.drawable.tw_boko, "Candi Ratu Boko","Explore", "Situs Ratu Baka atau Candi Boko adalah situs" +
                        " purbakala yang merupakan kompleks sejumlah sisa bangunan yang berada kira-kira 3 km di sebelah selatan dari kompleks Candi Prambanan, "+
                        "18 km sebelah timur Kota Yogyakarta atau 50 km barat daya Kota Surakarta, Jawa Tengah, Indonesia. Situs Ratu Boko terletak di sebuah "+
                        "bukit pada ketinggian 196 meter dari permukaan laut. Luas keseluruhan kompleks adalah sekitar 25 ha, Untuk tiket masuk kompleks Istana "+
                        "Ratu Boko, pengunjung dewasa dikenakan tarif Rp 40.000."),
                new DataList_Tempatwisata(R.drawable.tw_breksi, "Tebing Breksi", "Explore", "Tebing Breksi merupakan tempat wisata yang berada"+
                        "di wilayah Kabupaten Sleman. Lokasinya berada di sebelah kidul Candi Prambanan dan berdekatan dengan Candi Ijo serta Kompleks Keraton Boko."+
                        "Lokasi Wisata Tebing Breksi tepatnya berada di Desa Sambirejo, Prambanan, Kabupaten Sleman, Daerah Istimewa Yogyakarta.Taman Tebing Breksi"+
                        "Harga Tiket: Rp5.000 Jam Buka: 05.00 - 18.00 WIB "),
                new DataList_Tempatwisata(R.drawable.tw_ijo, "Candi ijo", "Explore", "Candi Ijo adalah sebuah kompleks percandian bercorak Hindu, "+
                        "berada 4 kilometer arah tenggara dari Candi Ratu Boko atau kira-kira 18 kilometer di sebelah timur kota Yogyakarta. Candi ini diperkirakan "+
                        "dibangun antara kurun abad ke-10 sampai dengan ke-11 Masehi pada saat zaman Kerajaan Medang periode Mataram.Seblum bisa memasuki kawasan candi"+
                        "ijo serta menikmati keindahan yang ada, wisatawan diwajibkan untuk membeli tiket masuk sebesar Rp 5.000 per orang. Sedangkan untuk harga parkir"+
                        "kendaraan di Candi Ijo, Anda hanya perlu mengeluarkan uang sebesar Rp. 2.000 untuk sepeda motor dan Rp. 5.000 untuk mobil."),
                new DataList_Tempatwisata(R.drawable.tw_malioboro, "Malioboro", "Explore", "Jalan Malioboro adalah nama salah satu kawasan jalan dari"+
                        "tiga jalan di Kota Yogyakarta yang membentang dari Tugu Yogyakarta hingga ke perempatan Kantor Pos Yogyakarta. Secara keseluruhan terdiri dari "+
                        "Jalan Margo Utomo, Jalan Malioboro, dan Jalan Margo Mulyo. Jalan ini merupakan poros Garis Imajiner Kraton Yogyakarta"),
                new DataList_Tempatwisata(R.drawable.tw_pram, "Candi Prambanan", "Explore", "Jalan Malioboro adalah nama salah satu kawasan jalan dari "+
                        "tiga jalan di Kota Yogyakarta yang membentang dari Tugu Yogyakarta hingga ke perempatan Kantor Pos Yogyakarta. Secara keseluruhan terdiri dari Jalan"+
                        "Margo Utomo, Jalan Malioboro, dan Jalan Margo Mulyo. Jalan ini merupakan poros Garis Imajiner Kraton Yogyaka. Harga tiket untuk wisatawan lokal dewasa"+
                        "Rp40.000. Harga tiket untuk wisatawan lokat anak-anak Rp10.000. Harga tiket untuk wisatawan asing ewasa $18."),
                new DataList_Tempatwisata(R.drawable.tw_tugu, "Tugu Yogyakarta", "Explore", "Tugu Yogyakarta adalah sebuah tugu atau monumen yang sering"+
                        "dipakai sebagai simbol atau lambang dari kota Yogyakarta. Tugu ini dibangun oleh pemerintah Belanda setelah tugu sebelumnya runtuh akibat gempa yang "+
                        "terjadi waktu itu. Tugu sebelumnya yang bernama Tugu Golong-Gilig dibangun oleh Hamengkubuwana I, pendiri kraton Yogyakarta. Tugu yang terletak di perempatan "+
                        "Jalan Jenderal Sudirman dan Jalan Margo Utomo ini, mempunyai nilai simbolis dan merupakan garis yang bersifat magis menghubungkan laut selatan, kraton Jogja dan gunung Merapi"),
        };
        return myListData; }}

package id.ceolabs.superizqi.submission;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListDataAdapter extends RecyclerView.Adapter<ListDataAdapter.CategoryViewHolder>{

    private Context context;
    private ArrayList<ClassObjek>listData;


    public ArrayList<ClassObjek> getListData(){
        return listData;
    }
    public ListDataAdapter(Context context){
        this.context = context;
    }
    public void setListData(ArrayList<ClassObjek> listData){
        this.listData = listData;
    }







    class CategoryViewHolder extends RecyclerView.ViewHolder {
//        per unit
        TextView tvNamaDepan, tvNamaBelakang;
        ImageView imgGambar;

        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvNamaDepan = (TextView) itemView.findViewById(R.id.tv_namadepan);
            tvNamaBelakang = (TextView) itemView.findViewById(R.id.tv_namabelakang);
            imgGambar = (ImageView) itemView.findViewById(R.id.gambar_di_row);
        }
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        membuat view baru
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_per_row, parent, false);
//        mengatur view
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
//        mengambil data array
//        mengatur isi viewnya
        holder.tvNamaDepan.setText(getListData().get(position).getNamaDepan());
        holder.tvNamaBelakang.setText(getListData().get(position).getNamaBelakang());
        Glide.with(context)
                .load(getListData().get(position).getGambar())
                .override(55,55)
                .crossFade()
                .into(holder.imgGambar);
    }

    public int getItemCount(){
//        menghitung ukurannya
        return getListData().size();
    }



}



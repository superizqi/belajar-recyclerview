package id.ceolabs.superizqi.submission;

import android.content.Intent;
import android.service.autofill.Dataset;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<ClassObjek>list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvCategory = (RecyclerView)findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(DataSet.getListData());
        showRecycleList();
    }


    private void showRecycleList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListDataAdapter listDataAdapter = new ListDataAdapter(this);
        listDataAdapter.setListData(list);
        rvCategory.setAdapter(listDataAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedPresident(list.get(position));
                Intent i = new Intent(MainActivity.this,Detail_Objek.class);
                i.putExtra("gambar", list.get(position).getGambarWisata());
                i.putExtra("nama", list.get(position).getNamaWisata());
                i.putExtra("tarif", list.get(position).getTarifWisata());
                i.putExtra("detail", list.get(position).getDetailWisata());
                startActivity(i);
            }
        });
    }

    private void showSelectedPresident(ClassObjek objek){
        Toast.makeText(this, "Kamu memilih "+objek.getNamaWisata(), Toast.LENGTH_SHORT).show();
    }


}

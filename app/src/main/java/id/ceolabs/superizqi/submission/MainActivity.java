package id.ceolabs.superizqi.submission;

import android.service.autofill.Dataset;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
    }


}

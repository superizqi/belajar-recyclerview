package id.ceolabs.superizqi.submission;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class Detail_Objek extends AppCompatActivity {

//    private Context context;
    ImageView gambarDetail;
    TextView tv_namaWisataDetail,tv_tarifWisataDetail,tv_detailWisata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__objek);
        String alamatGambar,namaW,tarifW,detailW;
        gambarDetail = (ImageView)findViewById(R.id.iv_gambar);
        tv_namaWisataDetail= (TextView)findViewById(R.id.tv_namaWisataDetail);
        tv_tarifWisataDetail= (TextView)findViewById(R.id.tv_tarifWisataDetail);
        tv_detailWisata= (TextView)findViewById(R.id.tv_detailWisata);


        if (savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if (extras == null){
                alamatGambar = null;
            }else {
                alamatGambar = extras.getString("gambar");
                namaW = extras.getString("nama");
                tarifW = extras.getString("tarif");
                detailW = extras.getString("detail");
                tv_detailWisata.setText(detailW);
                tv_namaWisataDetail.setText(namaW);
                tv_tarifWisataDetail.setText(tarifW);
//                gambarDetail.setImageResource(alamatGambar);
                Glide.with(this)
                        .load(alamatGambar)
                        .into(gambarDetail);

//                Glide.with(context)
//                        .load(alamatGambar)
//                        .override(55,55)
//                        .crossFade()
//                        .into(gambarDetail);
            }
        }else{
            alamatGambar = (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }


    }
}

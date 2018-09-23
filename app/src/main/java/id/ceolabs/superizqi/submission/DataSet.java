package id.ceolabs.superizqi.submission;


import java.util.ArrayList;

public class DataSet {
    public static String[][] data = new String[][]{
            {"Sendang Geulis Kahuripan","Tarif: Rp10.000,000","https://cdns.klimg.com/merdeka.com/i/w/news/2018/05/15/976224/content_images/670x335/20180515093657-1-sendang-geulis-bandung-001-tantri-setyorini.jpg","Sendang Geulis Kahuripan terletak di Kampung Cilangkop, Desa Ganjarsari Cikalong Wetan. Kawasan wisata beroperasi mulai jam 07.00 sampai 17.00 WIB."}
            ,{"Sanghyang Heuluet","Tarif: Rp10.000,00","https://cdns.klimg.com/merdeka.com/i/w/news/2018/05/15/976224/content_images/670x335/20180515093658-2-sanghyang-heuleut-001-tantri-setyorini.jpg","Terletak di Rajamandala Kulon, Cipatat, Kabupaten Bandung Barat, Sanghyang Heuluet merupakan danau hijau memesona dikelilingi batu-batu kali yang eksotis. Saking cantiknya, tempat ini sampai disebut kolam bidadari."}
            ,{"Upside Down World","Tarif: Rp50.000,00 (anak-anak), Rp100.000,00 (dewasa)","https://cdns.klimg.com/merdeka.com/i/w/news/2018/05/15/976224/content_images/670x335/20180515093658-3-upside-down-world-bandung-001-tantri-setyorini.jpg","Wisata unik ini berada di Jalan H. Wasid No.31 (Dipatiukur), Desa Lebakgede, Kecamatan Coblong. Jam operasionalnya adalah pukul 10.00-20.00 WIB."}
    };

//    getListData bisa diganti
    public static ArrayList<ClassObjek> getListData(){
        ClassObjek kelas_objek = null;
        ArrayList<ClassObjek> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            kelas_objek = new ClassObjek();
            kelas_objek.setNamaWisata(data[i][0]);
            kelas_objek.setTarifWisata(data[i][1]);
            kelas_objek.setGambarWisata(data[i][2]);
            kelas_objek.setDetailWisata(data[i][3]);
            list.add(kelas_objek);
        }

        return list;
    }

}

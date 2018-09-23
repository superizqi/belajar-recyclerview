package id.ceolabs.superizqi.submission;


import java.util.ArrayList;

public class DataSet {
    public static String[][] data = new String[][]{
            {"Rizqi","Prima","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Prima","Hariadhy","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Rizqi","Prima","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Prima","Hariadhy","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Rizqi","Prima","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Prima","Hariadhy","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Rizqi","Prima","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Prima","Hariadhy","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Rizqi","Prima","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
            ,{"Prima","Hariadhy","https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Presiden_Sukarno.jpg/418px-Presiden_Sukarno.jpg"}
    };

//    getListData bisa diganti
    public static ArrayList<ClassObjek> getListData(){
        ClassObjek kelas_objek = null;
        ArrayList<ClassObjek> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            kelas_objek = new ClassObjek();
            kelas_objek.setNamaDepan(data[i][0]);
            kelas_objek.setNamaBelakang(data[i][1]);
            kelas_objek.setGambar(data[i][2]);
            list.add(kelas_objek);
        }

        return list;
    }

}

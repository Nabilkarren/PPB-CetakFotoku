package com.example.cetakfotoku;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {

    private static int[] ridArray = {
            R.drawable.pablo1,
            R.drawable.pablo2,
    };

    private static String[] filenameArray = {
            "pablo1",
            "pablo2"
    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();

        int nArray = ridArray.length;
        for(int i=0; i < nArray; i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i], filenameArray[i]));
        }
    }

    public static List<KatalogFoto> getKatalogFotoList(){
        return katalogFotoList;
    }

    public static KatalogFoto getKatalogFotoAt(int i){
        return katalogFotoList.get(i);
    }
}

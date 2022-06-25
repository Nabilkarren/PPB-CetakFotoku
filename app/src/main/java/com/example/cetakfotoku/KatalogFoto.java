package com.example.cetakfotoku;

public class KatalogFoto {

    private int resId;
    private String filename;

    public KatalogFoto(int _resId, String _filename){
        resId = _resId;
        filename = _filename;
    }
    public int getResID() {
        return resId;
    }

    public void setResID(int resId) {
        this.resId = resId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}

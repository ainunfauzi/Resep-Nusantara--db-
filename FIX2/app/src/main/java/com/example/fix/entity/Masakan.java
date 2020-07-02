package com.example.fix.entity;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class Masakan implements Parcelable {
    String id;
    String Nama;
    String Resep;
    String Foto;
    String pendahuluan;

    public String getCara() {
        return Cara;
    }

    public void setCara(String cara) {
        Cara = cara;
    }

    String Cara;


    public String getPendahuluan() {
        return pendahuluan;
    }

    public void setPendahuluan(String pendahuluan) {
        this.pendahuluan = pendahuluan;
    }



    public Masakan(JSONObject obj) {
        try {
            this.id = obj.getString("id");
            Nama = obj.getString("Nama");
            pendahuluan = obj.getString("pendahuluan");
            Resep = obj.getString("Resep");
            Cara = obj.getString("Cara");
            Foto = obj.getString("foto");
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getResep() {
        return Resep;
    }

    public void setResep(String resep) {
        Resep = resep;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.Nama);
        dest.writeString(this.pendahuluan);
        dest.writeString(this.Cara);
        dest.writeString(this.Resep);
        dest.writeString(this.Foto);
    }

    public Masakan() {
    }

    protected Masakan(Parcel in) {
        this.id = in.readString();
        this.Nama = in.readString();
        this.pendahuluan = in.readString();
        this.Resep = in.readString();
        this.Cara = in.readString();
        this.Foto = in.readString();
    }

    public static final Creator<Masakan> CREATOR = new Creator<Masakan>() {
        @Override
        public Masakan createFromParcel(Parcel source) {
            return new Masakan(source);
        }

        @Override
        public Masakan[] newArray(int size) {
            return new Masakan[size];
        }
    };
}

package com.example.recyclerview;
import android.os.Parcel;
import android.os.Parcelable;

public class nila implements Parcelable {
    //variabel untuk menampung daata item
    private String nim;
    private String nama;
    private String gol;
    private String angkatan;
    private String ttl;
    private String kelamin;
    private String email;
    private int jpeg;

    public nila(String nim, String nama, String gol, String angkatan, String ttl, String kelamin, String email,int jpeg) {
        this.nim = nim;
        this.nama = nama;
        this.gol = gol;
        this.angkatan = angkatan;
        this.jpeg = jpeg;
        this.ttl = ttl;
        this.kelamin = kelamin;
        this.email = email;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGol() {
        return gol;
    }

    public void setGol(String gol ) {this.gol = gol; }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan ) {this.angkatan = angkatan; }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl ) {this.ttl = ttl; }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamain ) {this.kelamin = kelamin; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email ) {this.email = email; }

    public int getJpeg() {
        return jpeg;
    }

    public void setJpeg(int jpeg) {
        this.jpeg = jpeg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nim);
        dest.writeString(this.nama);
        dest.writeString(this.gol);
        dest.writeString(this.angkatan);
        dest.writeString(this.ttl);
        dest.writeString(this.kelamin);
        dest.writeString(this.email);
        dest.writeInt(this.jpeg);
    }

    public void readFromParcel(Parcel source) {
        this.nim = source.readString();
        this.nama = source.readString();
        this.gol = source.readString();
        this.angkatan = source.readString();
        this.ttl = source.readString();
        this.kelamin = source.readString();
        this.email = source.readString();
        this.jpeg = source.readInt();
    }

    protected nila(Parcel in) {
        this.nim = in.readString();
        this.nama = in.readString();
        this.gol = in.readString();
        this.angkatan = in.readString();
        this.ttl = in.readString();
        this.kelamin = in.readString();
        this.email = in.readString();
        this.jpeg = in.readInt();
    }

    public static final Creator<nila> CREATOR = new Creator<nila>() {
        @Override
        public nila createFromParcel(Parcel source) {
            return new nila(source);
        }

        @Override
        public nila[] newArray(int size) {
            return new nila[size];
        }
    };
}

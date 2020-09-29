package com.example.passingvalue.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Mahasiswa implements Parcelable {
    private String name;
    private String nim;
    private String tanggalLahir;
    private String jenisKelamin;
    private String jurusan;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.nim);
        dest.writeString(this.tanggalLahir);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.jurusan);
    }

    public Mahasiswa() {
    }

    public Mahasiswa(String name, String nim, String tanggalLahir, String jenisKelamin, String jurusan) {
        this.name = name;
        this.nim = nim;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.jurusan = jurusan;
    }

    protected Mahasiswa(Parcel in) {
        this.name = in.readString();
        this.nim = in.readString();
        this.tanggalLahir = in.readString();
        this.jenisKelamin = in.readString();
        this.jurusan = in.readString();
    }

    public static final Parcelable.Creator<Mahasiswa> CREATOR = new Parcelable.Creator<Mahasiswa>() {
        @Override
        public Mahasiswa createFromParcel(Parcel source) {
            return new Mahasiswa(source);
        }

        @Override
        public Mahasiswa[] newArray(int size) {
            return new Mahasiswa[size];
        }
    };
}

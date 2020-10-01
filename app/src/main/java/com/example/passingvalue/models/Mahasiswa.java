package com.example.passingvalue.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Mahasiswa implements Parcelable {
    private String nama, nim, tanggal, gender, jurusan;

    public Mahasiswa(String nama, String nim, String tanggal, String gender, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.tanggal = tanggal;
        this.gender = gender;
        this.jurusan = jurusan;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.nim);
        dest.writeString(this.tanggal);
        dest.writeString(this.gender);
        dest.writeString(this.jurusan);
    }

    protected Mahasiswa(Parcel in) {
        this.nama = in.readString();
        this.nim = in.readString();
        this.tanggal = in.readString();
        this.gender = in.readString();
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

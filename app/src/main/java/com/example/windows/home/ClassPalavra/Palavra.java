package com.example.windows.home.ClassPalavra;

import android.os.Parcel;
import android.os.Parcelable;

public class Palavra implements Parcelable {
    private String original;
    private String tradu;

    public Palavra(String original, String tradu) {
        this.original = original;
        this.tradu = tradu;
    }

    protected Palavra(Parcel in) {
        original = in.readString();
        tradu = in.readString();
    }

    public static final Creator<Palavra> CREATOR
            = new Creator<Palavra>() {
        @Override
        public Palavra createFromParcel(Parcel in) {
            return new Palavra(in);
        }

        @Override
        public Palavra[] newArray(int size) {
            return new Palavra[size];
        }
    };

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getTradu() {
        return tradu;
    }

    public void setDescricao(String descricao) {
        this.tradu = descricao;
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(original);
        parcel.writeString(tradu);
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "original='" + original + '\'' +
                ", tradu='" + tradu + '\'' +
                '}';
    }
}

package com.example.windows.home.ClassCard;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import com.example.windows.home.ClassPalavra.Palavra;

import java.util.ArrayList;

public class Card implements Parcelable {

    private int id;
    private String nome;
    private ArrayList<Palavra> palavras;

    public Card(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.palavras = new ArrayList<>();
    }


    public ArrayList<Palavra> getPalavras() {
        return palavras;
    }

    protected Card(Parcel in) {
        id = in.readInt();
        nome = in.readString()+"P";
        Log.d("card palavras new1",toString());
        palavras = in.createTypedArrayList(Palavra.CREATOR);
        Log.d("card palavras new2",toString());

    }

    public static final Creator<Card> CREATOR
            = new Creator<Card>() {
        @Override
        public Card createFromParcel(Parcel in) {
            return new Card(in);
        }

        @Override
        public Card[] newArray(int size) {
            return new Card[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addPalavra(String original, String tradu){
        this.palavras.add(new Palavra(original,tradu));

        Log.d("card nome add palavra",toString());
    }

    public ArrayList<Palavra> getListPalavra(){
        return this.palavras;
    }


    @Override
    public int describeContents() {
        return this.hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(nome);

        Log.d("card palavras wtp",toString() );
        parcel.writeTypedList(palavras);
        Log.d("card palavras wtp2",toString() );

    }

    public void setPalavras(ArrayList<Palavra> palavras) {
        this.palavras = palavras;
    }

    //    @Override
//    public String toString() {
//        return "Card{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", palavras=" + palavras +
//                '}';
//    }
}

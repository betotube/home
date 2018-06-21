package com.example.windows.home.ClassCard;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class ListaDeCards implements Parcelable{
    private ArrayList<Card> listCards;

    public ListaDeCards() {
        this.listCards = new ArrayList<Card>();
    }

    public void addPalavra(int id, String o, String tradu){
        this.listCards.get(id).addPalavra(o,tradu);
    }

    // no meu não passa id, pede a opção de adc algo no public void add , mas é um int me refiro a parte (nome, id ...

    protected ListaDeCards(Parcel in) {
        listCards = in.readParcelable(ListaDeCards.class.getClassLoader());
    }

    public static final Creator<ListaDeCards> CREATOR =
            new Creator<ListaDeCards>() {
        @Override
        public ListaDeCards createFromParcel(Parcel in) {
            return new ListaDeCards(in);
        }

        @Override
        public ListaDeCards[] newArray(int size) {
            return new ListaDeCards[size];
        }
    };

    public void addCard(String nome){
        this.listCards.add(new Card(nome, listCards.size()+1));
    }

    public Card getCard(int id){
        return this.listCards.get(id);
    }

    public void setListCards(ArrayList<Card> listCards) {
        this.listCards = listCards;
    }

    public ArrayList<Card> getListCards() {
        return listCards;
    }

    @Override
    public int describeContents(){return this.hashCode();}

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeTypedList(listCards);
    }

    public int ReturnSize(){
        return this.listCards.size();
    }


}
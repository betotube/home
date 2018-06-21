package com.example.windows.home.Teste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CardsList implements Serializable {
    private List<Cartao> cardList;

    public CardsList() {
        this.cardList = new ArrayList<>();
    }

    public void addCartao(String nome){
        this.cardList.add(new Cartao(nome));
    }

    public void addWord(int id, String ori, String tradu){
        this.cardList.get(id).addWord(ori, tradu);
    }

    public List<Cartao> getCardList() {
        return cardList;
    }
}

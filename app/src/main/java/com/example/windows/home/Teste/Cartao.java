package com.example.windows.home.Teste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cartao implements Serializable{
    private String nome;
    private List<Word> words = new ArrayList<>();

    public Cartao(String nome) {
        this.nome = nome;
    }

    public void addWord(String ori, String tradu){
        words.add(new Word(ori, tradu));
    }

    public String getNome() {
        return nome;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }
}

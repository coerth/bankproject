package com.example.bankprojekt;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


public class Konto {
    private String navn;
    private String kode;
    private int saldo;

    public Konto(String navn, String kode, int saldo) {
        this.navn = navn;
        this.kode = kode;
        this.saldo = saldo;
    }

    public String getNavn() {
        return this.navn;
    }

    public String getKode() {
        return this.kode;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int indsæt(int i) {
        if (i < 0) {
            i = 0;
        }

        this.saldo += i;
        return this.saldo;
    }

    public int hæv(int i) {
        if (i < 0) {
            i = 0;
        }

        this.saldo -= i;
        return this.saldo;
    }
}

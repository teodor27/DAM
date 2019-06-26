package com.example.pregatirerestanta1.clase;

public class Autobuz {
    String nrInmatriculare;
    int linie;
    String sofer;
    int nrLocuri;

    public Autobuz(String nrInmatriculare, int linie, String sofer, int nrLocuri) {
        this.nrInmatriculare = nrInmatriculare;
        this.linie = linie;
        this.sofer = sofer;
        this.nrLocuri = nrLocuri;
    }

    public Autobuz() {

    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public int getLinie() {
        return linie;
    }

    public void setLinie(int linie) {
        this.linie = linie;
    }

    public String getSofer() {
        return sofer;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }
}

package com.company;

public class Motor {
    int hestekræfter;
    int liter;
    boolean elbil;
    int omdrejninger;



    public Motor(int hestekræfter, int liter, boolean elbil, int omdrejninger) {
        this.hestekræfter = hestekræfter;
        this.liter = liter;
        this.elbil = elbil;
        this.omdrejninger = omdrejninger;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hestekræfter=" + hestekræfter +
                ", liter=" + liter +
                ", elbil=" + elbil +
                '}';
    }
    public int getOmdrejninger() {return omdrejninger;}

    public void setOmdrejninger(int omdrejninger) {this.omdrejninger = omdrejninger;}

    public int getHestekræfter() {
        return hestekræfter;
    }

    public void setHestekræfter(int hestekræfter) {
        this.hestekræfter = hestekræfter;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public boolean isElbil() {
        return elbil;
    }

    public void setElbil(boolean elbil) {
        this.elbil = elbil;
    }
}

package com.company;

public class Bremse {
    int procent_nedtrykket;
    boolean ABS;

    public Bremse(int procent_nedtrykket, boolean ABS) {
        this.procent_nedtrykket = procent_nedtrykket;
        this.ABS = ABS;
    }

    @Override
    public String toString() {
        return "Bremse{" +
                "procent_nedtrykket=" + procent_nedtrykket +
                ", ABS=" + ABS +
                '}';
    }

/*    public void bremseTryk() {
        this.procent_nedtrykket++;

    }
    public void bremseSlip() {
        this.procent_nedtrykket--;
    }*/
    public int getProcent_nedtrykket() {
        return procent_nedtrykket;
    }

    public void setProcent_nedtrykket(int procent_nedtrykket) {
        this.procent_nedtrykket = procent_nedtrykket;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }
}

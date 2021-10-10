package com.company;

public class Bil {
    private String biltype;
    private String model;
    private int stelnummer;
    private int antal_døre;
    private String softwareversion;
    private String gps_koordinater;
    private int hastighed;
    private Bremse bremse;
    private Hjul hjul;
    private Motor motor;
    private Rat rat;
    public boolean motorStatus = false;
    boolean cruiseControlOn = false;

    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(int stelnummer) {
        this.stelnummer = stelnummer;
    }

    public int getAntal_døre() {
        return antal_døre;
    }

    public void setAntal_døre(int antal_døre) {
        this.antal_døre = antal_døre;
    }

    public String getSoftwareversion() {
        return softwareversion;
    }

    public void setSoftwareversion(String softwareversion) {
        this.softwareversion = softwareversion;
    }

    public String getGps_koordinater() {
        return gps_koordinater;
    }

    public void setGps_koordinater(String gps_koordinater) {
        this.gps_koordinater = gps_koordinater;
    }

    public int getHastighed() {
        return hastighed;
    }

    public void setHastighed(int hastighed) {
        this.hastighed = hastighed;
    }

    public Bremse getBremse() {
        return bremse;
    }

    public void setBremse(Bremse bremse) {
        this.bremse = bremse;
    }

    public Hjul getHjul() {
        return hjul;
    }

    public void setHjul(Hjul hjul) {
        this.hjul = hjul;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rat getRat() {
        return rat;
    }

    public void setRat(Rat rat) {
        this.rat = rat;
    }

    public Bil(String biltype, String model, int stelnummer, int antal_døre, String softwareversion, String gps_koordinater, int hastighed, Bremse bremse, Hjul hjul, Motor motor, Rat rat) {
        this.biltype = biltype;
        this.model = model;
        this.stelnummer = stelnummer;
        this.antal_døre = antal_døre;
        this.softwareversion = softwareversion;
        this.gps_koordinater = gps_koordinater;
        this.hastighed = hastighed;
        this.motor = motor;
        this.rat = rat;
        this.hjul = hjul;
        this.bremse = bremse;
    }

    public void StartMotor(){
        // System.out.println("Din bil er nu startet!");
        motorStatus = true;
        this.setHastighed(0);
    }
    public void SlukMotor(){
        // System.out.println("Din bil er nu slukket");
        motorStatus = false;
        this.setHastighed(0);
    }

    public void forøgHastighed(){
        if (!cruiseControlOn) {
            if (this.getHastighed()+1 > 100) {
                this.setHastighed(100);
            } else {
                this.setHastighed(this.getHastighed()+1);
            }
        } else {
            System.out.println("Du kan ikke forøge hastigheden, når cruise control er slået til!");
        }
        this.motor.setOmdrejninger(this.getHastighed() * 50);
        // return this.hastighed;
    }
    public void formindskHastighed() {
        if (!cruiseControlOn) {
            if (this.getHastighed()-1 < 0) {
                this.setHastighed(0);
            } else {
                this.setHastighed(this.getHastighed()-1);
                // return this.hastighed;
            }
        } else {
            System.out.println("Du kan ikke formindske hastigheden, når cruise control er slået til!");
        }
        this.motor.setOmdrejninger(this.getHastighed() * 50);
        // return this.hastighed;
    }
    public void bremseTryk() {
        this.bremse.procent_nedtrykket++;
        formindskHastighed();
    }
    public void bremseSlip() {
        this.bremse.procent_nedtrykket--;
    }
    public void cruiseControlOn(int hastighed) {
        this.hastighed = hastighed;
        cruiseControlOn = true;
    }
    public void cruiseControlOff() {
        cruiseControlOn = false;
    }



    @Override
    public String toString() {
        return "Bil{" +
                "biltype='" + biltype + '\'' +
                ", model='" + model + '\'' +
                ", stelnummer=" + stelnummer +
                ", antal_døre=" + antal_døre +
                ", softwareversion='" + softwareversion + '\'' +
                ", gps_koordinater='" + gps_koordinater + '\'' +
                ", hastighed=" + hastighed +
                ", bremse=" + bremse.toString() +
                ", hjul=" + hjul.toString() +
                ", motor=" + motor.toString() +
                ", rat=" + rat.toString() +
                '}';
    }
}

// biltype, model, stelnummer, antal døre, softwareversion, GPS koordinater, hastighed

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
    Rat mitRat = new Rat(0,40,false,true);
    Motor minMotor = new Motor(100,2,false,0);
    Hjul mitHjul = new Hjul(16, "Hurricane","Helårsdæk",0);
    Bremse minBremse = new Bremse(0,true);
    Bil minBil = new Bil("cabriolet", "Porche", 12345, 5,"1.1",
            "1234,4321", 0,minBremse,mitHjul,minMotor,mitRat);
        System.out.println(minBil.toString());

 /*
        System.out.println("Oprettelse af ny bil. Indtast først detaljer til dit rat:");
        System.out.println("Indtast rattets diameter som heltal i cm:");

        Scanner s_ratdiameter = new Scanner(System.in);
        int ratDiameter;
        ratDiameter = s_ratdiameter.nextInt();

        System.out.println("Har rattet plys (ja/nej):");
        boolean ratharplys;
        ratharplys = false;
        Scanner s_ratharplys = new Scanner(System.in);
        if (s_ratharplys.nextLine().equalsIgnoreCase("ja")) {
            ratharplys = true;
        }

        // System.out.println(s_ratharplys.nextLine().toLowerCase());

        System.out.println("Har rattet et båthorn?");
        boolean ratharbåthorn;
        ratharbåthorn = false;
        Scanner s_ratharbåthorn = new Scanner(System.in);
        if (s_ratharbåthorn.nextLine().equalsIgnoreCase("ja")) {
            ratharbåthorn = true;
        }

        Rat mitRat = new Rat(0, ratDiameter, ratharplys, ratharbåthorn);
        System.out.println(mitRat.toString());

        System.out.println("Indtast nu informationer om din motor:");
        System.out.println("Hvormange hestekræfter har din motor?");
        int hestekræfter;
        Scanner s_hesterkræfter = new Scanner(System.in);
        hestekræfter = s_hesterkræfter.nextInt();

        System.out.println("Hvor mange liter er din motor på?");
        int liter;
        Scanner s_liter = new Scanner(System.in);
        liter = s_liter.nextInt();

        System.out.println("Er din bil en elbil? (ja/nej)");
        boolean elbil = false;
        Scanner s_elbil = new Scanner(System.in);
        if (s_elbil.nextLine().equalsIgnoreCase("ja")) {
            elbil = true;
        }

        Motor minMotor = new Motor(hestekræfter, liter, elbil);
        System.out.println(minMotor.toString());

        System.out.println("Indtast nu oplysninger om din bremse:");
        System.out.println("Har din bremse ABS teknologi? (ja/nej");
        boolean ABS = false;
        Scanner s_ABS = new Scanner(System.in);
        if (s_ABS.nextLine().equalsIgnoreCase("ja")) {
            ABS = true;
        }

        Bremse minbremse = new Bremse(0, ABS);
        System.out.println(minbremse.toString());

        System.out.println("Indtast nu oplysninger om din bil:");
        System.out.println("Hvilken biltype (stationcar, cabriolet, etc.) er din bil?");
        String biltype;
        Scanner s_biltype = new Scanner(System.in);
        biltype = s_biltype.nextLine();

        System.out.println("Hvilken model er din bil?");
        String model;
        Scanner s_model = new Scanner(System.in);
        model = s_model.nextLine();

        System.out.println("Indtast stelnummeret på din bil:");
        int stelnummer;
        Scanner s_stelnummer = new Scanner(System.in);
        stelnummer = s_stelnummer.nextInt();

        System.out.println("Indtast antal døre:");
        int døre;
        Scanner s_døre = new Scanner(System.in);
        døre = s_døre.nextInt();

        System.out.println("Indtast softwareversion:");
        String softwareversion;
        Scanner s_softwareversion = new Scanner(System.in);
        softwareversion = s_softwareversion.nextLine();

        System.out.println("Indtast nu oplysninger om dine hjul:");
        System.out.println("Hvor mange tommer er dine hjul på?");
        int tommer;
        Scanner s_tommer = new Scanner(System.in);
        tommer = s_tommer.nextInt();

        System.out.println("Hvad er navnet på dine dæk?");
        String navn;
        Scanner s_navn = new Scanner(System.in);
        navn = s_navn.nextLine();

        System.out.println("Hvilken dæktype (helårsdæk, vinterdæk, sommerdæk)?");
        String dæktype;
        Scanner s_dæktype = new Scanner(System.in);
        dæktype = s_dæktype.nextLine();

        Hjul mitHjul = new Hjul(tommer, navn, dæktype);
        Bil minBil = new Bil(biltype, model, stelnummer, døre, softwareversion, "", 0, minbremse, mitHjul, minMotor, mitRat);
*/
        System.out.println("Se detaljer om din bil herunder:");
        System.out.println(minBil.toString());

        System.out.println("1. Start motor");
        System.out.println("2. Speeder");
        System.out.println("3. Slip speeder");
        System.out.println("4. Tryk på bremse");
        System.out.println("5. Slip bremse");
        System.out.println("6. Cruise control on");
        System.out.println("7. Cruise control off");
        System.out.println("8. Drej venstre");
        System.out.println("9. Drej højre");
        System.out.println("10. Sluk motor");
        System.out.println("11. Exit");

        boolean exit = false;
        while (!exit) {
            int valg;
            Scanner s_valg = new Scanner(System.in);
            int svar = s_valg.nextInt();

            if (svar == 1) {
                minBil.StartMotor();
                System.out.println("Motoren er tændt");
                continue;
            } else if (svar == 2) {
                if (minBil.motorStatus && !minBil.cruiseControlOn) {
                    minBil.forøgHastighed();
                    System.out.println("Din hastighed er forøget med 1% og er nu: " + minBil.getHastighed() + "%");
                    System.out.println("Bilen kører med: " + minBil.getMotor().omdrejninger + " omdrejninger.");
                    continue;
                } else {
                    if (!minBil.motorStatus) {
                        System.out.println("Motoren er ikke tændt!");
                    }
                    if (minBil.cruiseControlOn) {
                        System.out.println("Cruise control er på!");
                    }
                }
            } else if (svar == 3) {
                if (minBil.motorStatus && !minBil.cruiseControlOn) {
                    minBil.formindskHastighed();
                    System.out.println("Din hastighed er formindsket med 1% og er nu: " + minBil.getHastighed() + "%");
                    System.out.println("Bilen kører med: " + minBil.getMotor().omdrejninger + " omdrejninger.");
                    continue;
                } else {
                    if (!minBil.motorStatus) {
                        System.out.println("Motoren er ikke tændt!");
                    }
                    if (minBil.cruiseControlOn) {
                        System.out.println("Cruise control er på!");
                    }
                }
            } else if (svar == 4) {
                minBil.bremseTryk();
                System.out.println("Bremse er " + minBil.getBremse().procent_nedtrykket + "% nedtrykket. Bilen har en hastighed på: " + minBil.getHastighed() + "%");
                System.out.println("Bilen kører med: " + minBil.getMotor().omdrejninger + " omdrejninger.");
                continue;
            } else if (svar == 5) {
                minBil.bremseSlip();
                System.out.println("Bremse er " + minBil.getBremse().procent_nedtrykket + "% nedtrykket. Bilen har en hastighed på: " + minBil.getHastighed() + "%");
                System.out.println("Bilen kører med: " + minBil.getMotor().omdrejninger + " omdrejninger.");
                continue;
            } else if (svar == 6) {
                System.out.println("Indtast cruise hastighed:");
                Scanner scanner = new Scanner(System.in);
                int cruiseHastighed = scanner.nextInt();
                minBil.cruiseControlOn(cruiseHastighed);
                System.out.println("cruise on");
                continue;
            } else if (svar == 7) {
                minBil.cruiseControlOff();
                System.out.println("cruise off");
                continue;
            } else if (svar == 8) {
                minBil.getRat().DrejRatVenstre();
                minBil.getHjul().retningGrader = mitRat.retning_grader;
                System.out.println("Retning i grader: " + minBil.getRat().retning_grader);
                continue;
            } else if (svar == 9) {
                minBil.getRat().DrejRatHøjre();
                minBil.getHjul().retningGrader = mitRat.retning_grader;
                System.out.println("Retning i grader: " + minBil.getRat().retning_grader);
                continue;
            } else if (svar == 10) {
                minBil.SlukMotor();
                System.out.println("Bilens motor er nu slukket.");
                continue;
            } else if (svar == 11) {
                exit = true;
                break;
            }
        }
    }
}
/*
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

    int retning_grader;
    int diameter;
    boolean har_plys;
    boolean har_båthorn;*/

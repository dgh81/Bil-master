package com.company;

public class Rat {
    int retning_grader = 0;
    int diameter;
    boolean har_plys;
    boolean har_båthorn;


    public Rat(int retning_grader, int diameter, boolean har_plys, boolean har_båthorn) {
        this.retning_grader = retning_grader;
        this.diameter = diameter;
        this.har_plys = har_plys;
        this.har_båthorn = har_båthorn;
    }

    public void DrejRatVenstre() {
        if (retning_grader + 15 > 75) {
            retning_grader = 75;

        } else {
            retning_grader = retning_grader + 15;
        }
    }
    public void DrejRatHøjre() {
        if (retning_grader - 15 < -75) {
            retning_grader = -75;
        } else {
            retning_grader = retning_grader - 15;
        }
    }
    @Override
    public String toString() {
        return "Rat{" +
                "retning_grader=" + retning_grader +
                ", diameter=" + diameter +
                ", har_plys=" + har_plys +
                ", har_båthorn=" + har_båthorn +
                '}';
    }
}

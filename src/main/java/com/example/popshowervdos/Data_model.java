package com.example.popshowervdos;

public class Data_model {
    private String stateName;
    private double malePop;
    private double femalePop;
    private double totalPop;

    public Data_model() {
    }

    public Data_model(String stateName, double malePop, double femalePop, double totalPop) {
        this.stateName = stateName;
        this.malePop = malePop;
        this.femalePop = femalePop;
        this.totalPop = totalPop;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public double getMalePop() {
        return malePop;
    }

    public void setMalePop(double malePop) {
        this.malePop = malePop;
    }

    public double getFemalePop() {
        return femalePop;
    }

    public void setFemalePop(double femalePop) {
        this.femalePop = femalePop;
    }

    public double getTotalPop() {
        return totalPop;
    }

    public void setTotalPop(double totalPop) {
        this.totalPop = totalPop;
    }
}

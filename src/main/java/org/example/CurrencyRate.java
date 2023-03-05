package org.example;

public class CurrencyRate {
    private int currencyCodeA;
    private int currencyCodeB;
    private int date;
    private float rateSell;
    private float rateBuy;
    private float rateCross;

    public int getCurrencyCodeA() {
        return currencyCodeA;
    }

    public void setCurrencyCodeA(int currencyCodeA) {
        this.currencyCodeA = currencyCodeA;
    }

    public int getCurrencyCodeB() {
        return currencyCodeB;
    }

    public void setCurrencyCodeB(int currencyCodeB) {
        this.currencyCodeB = currencyCodeB;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getRateSell() {
        return rateSell;
    }

    public void setRateSell(float rateSell) {
        this.rateSell = rateSell;
    }

    public float getRateBuy() {
        return rateBuy;
    }

    public void setRateBuy(float rateBuy) {
        this.rateBuy = rateBuy;
    }

    public float getRateCross() {
        return rateCross;
    }

    public void setRateCross(float rateCross) {
        this.rateCross = rateCross;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "currencyCodeA=" + currencyCodeA +
                ", currencyCodeB=" + currencyCodeB +
                ", date=" + date +
                ", rateSell=" + rateSell +
                ", rateBuy=" + rateBuy +
                ", rateCross=" + rateCross +
                '}';
    }
}

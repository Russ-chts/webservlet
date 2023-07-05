package Obj;

public class Currency {
    double jpn = 4.65;
    double usd = 0.03;
    double cny = 0.23;
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public double getJpn() {
        return this.amount * jpn;
    }

    public double getUsd() {
        return this.amount * usd;
    }

    public double getCny() {
        return this.amount * cny;
    }
}

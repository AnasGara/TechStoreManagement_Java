package Details;

import Enumerations.MicroprocesseurBrand;

public class Microprocesseur {
    double speed;
    int corps;
    private MicroprocesseurBrand brand;

    public Microprocesseur(MicroprocesseurBrand brand, double speed, int corps) {
        this.brand = brand;
        this.speed = speed;
        this.corps = corps;
    }

    public Microprocesseur() {
    }

    public MicroprocesseurBrand getBrand() {
        return brand;
    }

    public void setBrand(MicroprocesseurBrand brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCorps() {
        return corps;
    }

    public void setCorps(int corps) {
        this.corps = corps;
    }
}

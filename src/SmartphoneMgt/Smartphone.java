package SmartphoneMgt;

import Details.Microprocesseur;
import Details.Screen;
import Enumerations.ProductState;
import Provider.Provider;

public class Smartphone {

    long id;
    Microprocesseur mic;
    Screen ecran;
    String battery;
    Provider manifacturer;
    long capacityStockage;
    long capacityCentrale;
    double prix;
    ProductState etat;

    public Smartphone(long id, Microprocesseur mic, Screen ecran, String battery, Provider manifacturer, long capacityStockage, long capacityCentrale, double prix, ProductState etat) {
        this.id = id;
        this.mic = mic;
        this.ecran = ecran;
        this.battery = battery;
        this.manifacturer = manifacturer;
        this.capacityStockage = capacityStockage;
        this.capacityCentrale = capacityCentrale;
        this.prix = prix;
        this.etat = etat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Microprocesseur getMic() {
        return mic;
    }

    public void setMic(Microprocesseur mic) {
        this.mic = mic;
    }

    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public Provider getManifacturer() {
        return manifacturer;
    }

    public void setManifacturer(Provider manifacturer) {
        this.manifacturer = manifacturer;
    }

    public long getCapacityStockage() {
        return capacityStockage;
    }

    public void setCapacityStockage(long capacityStockage) {
        this.capacityStockage = capacityStockage;
    }

    public long getCapacityCentrale() {
        return capacityCentrale;
    }

    public void setCapacityCentrale(long capacityCentrale) {
        this.capacityCentrale = capacityCentrale;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public ProductState getEtat() {
        return etat;
    }

    public void setEtat(ProductState etat) {
        this.etat = etat;
    }
}

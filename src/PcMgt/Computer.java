package PcMgt;

import Details.Microprocesseur;
import Details.Screen;
import Enumerations.ProductState;

import java.security.Provider;

public class Computer {

    private long id;
    //Composition
    private Microprocesseur microprocesseur;
    private Screen screen;
    private Provider provider;
    private ProductState state;
    private String battery;
    private double price;
    private  int RAM;
    private int harddisck;

    public void afficher(){
        System.out.print("Computer[:" +"id: "+this.id+
                "Microprocecesseur de type: "+this.microprocesseur.getBrand()+
                " Screen de type: "+this.screen.getType()+
                " Provider de type: "+this.provider.getName()+
                " Etat de type: "+this.state+
                " Battery de type: "+this.battery+
                " Price: "+this.price+
                " RAM: "+this.RAM+
                "Harddisc de type: "+this.getHarddisck()+
                " ]");
    }

    public double calculerScore(){

        double mico=0,scree=0,brand_perform=0;
        switch (this.microprocesseur.getBrand()){
            case DRAGON :brand_perform=50; break;
            case AMD : brand_perform=30;  break;
            case INTEL: brand_perform=40; break;
            case CELERON: brand_perform=20; break;
            case OTHER: brand_perform=10; break;
        }
        double memory_capacity=0.6*RAM+0.4*harddisck;
        return 40*mico+30*scree;
    }

    public int comparer(Computer c ){
        int p= (int)(this.calculerScore()-c.calculerScore());
        if (p>0&&p<1){
            return 1;
        }
        if (p<0&&p>-1){
            return -1;
        }
        return p;
    }
    public Computer(long id, Microprocesseur microprocesseur, Screen screen, Provider provider, ProductState state, String battery, double price, int RAM, int harddisck) {
        this.id = id;
        this.microprocesseur = microprocesseur;
        this.screen = screen;
        this.provider = provider;
        this.state = state;
        this.battery = battery;
        this.price = price;
        this.RAM = RAM;
        this.harddisck = harddisck;
    }

    public Computer(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Microprocesseur getMicroprocesseur() {
        return microprocesseur;
    }

    public void setMicroprocesseur(Microprocesseur microprocesseur) {
        this.microprocesseur = microprocesseur;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHarddisck() {
        return harddisck;
    }

    public void setHarddisck(int harddisck) {
        this.harddisck = harddisck;
    }
}

package PrinterMgt;

import Enumerations.PrinterType;
import Enumerations.ProductState;
import Provider.Provider;

public class Printer {
    long id;
    Provider x;
    long speed;
    int nbPapier;
    PrinterType type;
    ProductState etat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Provider getX() {
        return x;
    }

    public void setX(Provider x) {
        this.x = x;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public int getNbPapier() {
        return nbPapier;
    }

    public void setNbPapier(int nbPapier) {
        this.nbPapier = nbPapier;
    }

    public PrinterType getType() {
        return type;
    }

    public void setType(PrinterType type) {
        this.type = type;
    }

    public ProductState getEtat() {
        return etat;
    }

    public void setEtat(ProductState etat) {
        this.etat = etat;
    }

    public void afficher(){

      /* public void afficher(){
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
        }*/
    }
}

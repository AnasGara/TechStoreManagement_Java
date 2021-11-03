package Details;

import Enumerations.SceenType;
import Provider.Provider;

public class Screen {
    double size;
    SceenType type;
    Provider manifacturer;

    public Screen(double size, SceenType type, Provider manifacturer) {
        this.size = size;
        this.type = type;
        this.manifacturer = manifacturer;
    }
    public Screen() {}



    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public SceenType getType() {
        return type;
    }

    public void setType(SceenType type) {
        this.type = type;
    }

    public Provider getManifacturer() {
        return manifacturer;
    }

    public void setManifacturer(Provider manifacturer) {
        this.manifacturer = manifacturer;
    }
}

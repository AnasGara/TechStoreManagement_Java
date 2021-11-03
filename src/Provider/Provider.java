package Provider;

public class Provider {
    int id;
    String name;
    String nat;

    public Provider(int id, String name, String nat) {
        this.id = id;
        this.name = name;
        this.nat = nat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }
}

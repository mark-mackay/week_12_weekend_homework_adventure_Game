package soldiers;

public class Armour {
    String type;
    int protection;

    public Armour(String type, int protection) {
        this.type = type;
        this.protection = protection;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }
}

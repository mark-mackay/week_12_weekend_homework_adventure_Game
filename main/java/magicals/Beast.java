package magicals;

public class Beast {
    String name;
    int protection;

    public Beast(String name, int protection) {
        this.name = name;
        this.protection = protection;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }
}

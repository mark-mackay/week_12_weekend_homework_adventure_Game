package rooms;

public abstract class Room {
    String name;
    String type;
    int amount;
    Boolean completed;

    public Room(String name, String type, int amount) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.completed = false;
    }

    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}

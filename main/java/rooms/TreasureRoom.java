package rooms;

import interfaces.IDamagable;

public class TreasureRoom extends Room implements IDamagable {

    public TreasureRoom(String name, String type, int amount) {
        super(name, type, amount);
    }

    @Override
    public void damage(int points) {
        this.amount -= points;
        if (this.amount <= 0 ){
            this.completed = true;
        }
    }
}

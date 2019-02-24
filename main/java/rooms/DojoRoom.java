package rooms;

import interfaces.IDamagable;

public class DojoRoom extends Room implements IDamagable {

    public DojoRoom(String name, String type, int amount) {
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

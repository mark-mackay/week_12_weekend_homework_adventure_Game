import interfaces.IDamagable;
import rooms.Room;

import java.util.ArrayList;

public class Game {
    String name;
    ArrayList<Room> rooms;
    ArrayList<IDamagable> characters;


    public Game(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.characters = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<IDamagable> getCharacters() {
        return characters;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }
    public void addCharacter(IDamagable character){
        this.characters.add(character);
    }
    public void removeCharacter(IDamagable character){
        this.characters.remove(character);
    }

    public void battle(Room room){
        int amount = room.getAmount();
        int damage = (amount/this.getCharacters());
        while (!room.getCompleted || (this.getCharacters() > 0)){
        for (IDamageable character : characters){
            character.damage(damage);
            amount -= damage;
            if (character.getHealth() < 0){
                this.removeCharacter(character);
            }
        }


    }
//    public ArrayList enterRoom(ArrayList<IDamageable> group){
//
//    }

}



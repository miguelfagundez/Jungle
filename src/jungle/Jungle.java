package jungle;

import animal.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Jungle class is the main class that
 * contains some list of animals.
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.1
 */
public class Jungle {

    /*
     * States
     * */
    private String jungleName;
    private List<Animal> tigers;
    private List<Animal> monkeys;
    private List<Animal> snakes;

    /*
     * Constructors
     * */
    public Jungle(String name) {
        this.tigers = new ArrayList<>();
        this.monkeys = new ArrayList<>();
        this.snakes = new ArrayList<>();
        jungleName = name;
    }

    /*
    * Getters and Setters
    * */
    public String getJungleName(){
        return jungleName;
    }

    public List<Animal> getTigers(){
        return this.tigers;
    }

    public List<Animal> getMonkeys(){
        return this.monkeys;
    }

    public List<Animal> getSnakes(){
        return this.snakes;
    }

    public void addNewTiger(Animal tiger){
        tigers.add(tiger);
    }

    public void addNewMonkey(Animal monkey){
        monkeys.add(monkey);
    }

    public void addNewSnake(Animal snake){
        snakes.add(snake);
    }

    /*
    * Get the number of animals
    * */
    public int getNumberOfTigers(){
        return tigers.size();
    }

    public int getNumberOfMonkeys(){
        return monkeys.size();
    }

    public int getNumberOfSnakes(){
        return snakes.size();
    }

    public int getNumberOfAnimals(){
        return tigers.size() + monkeys.size() + snakes.size();
    }
}


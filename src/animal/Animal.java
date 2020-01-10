package animal;

/**
 * Animal class is an abstract class that
 * contains some behavior for different
 *       animals in the jungle.
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.0
 */
public abstract class Animal {
    /*
     * States
     * */
    private String name;
    private int levelEnergy;
    private int numberSpecies;

    /*
     * Constructors
     * */
    public Animal(String name){
        this.name = name;
        levelEnergy = 0;
        numberSpecies = 1;
    }

    public Animal(String name, int numberSpecies){
        this.name = name;
        this.levelEnergy = 0;
        this.numberSpecies = numberSpecies;
    }

    public Animal(String name, int levelEnergy, int numberSpecies){
        this.name = name;
        this.levelEnergy = levelEnergy;
        this.numberSpecies = numberSpecies;
    }

    /*
     * Getter and Setter: EnergyLevel
     * */
    public int getEnergyLevel(){
        return levelEnergy;
    }

    public void setEnergyLevel(int energy){
        levelEnergy += energy;
    }

    /*
     * Getter of Animal Name
     * */
    public String getName(){
        return name;
    }

    /*
     * Getter and Setter of Number of Species
     * */
    public int getNumberSpecies(){
        return numberSpecies;
    }

    public void setNumberSpecies(int numberSpecies){
        this.numberSpecies = numberSpecies;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", levelEnergy=" + levelEnergy +
                ", numberSpecies=" + numberSpecies +
                '}';
    }

    /*
     * Abstract methods to be implemented in
     *          each animal type.
     * */
    public abstract void makeSound();
    public abstract void eatFood(int eatFood);
    public abstract void goToSleep();


}


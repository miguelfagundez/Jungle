package animal;

/**
 * Monkey class implements the behavior
 *     of a monkey in the jungle.
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.0
 */
public class Monkey extends Animal {

    /*
     * Constructors
     * */
    public Monkey(){
        super("Monkey");
    }

    /*
     * Abstract methods implemented in the Monkey class
     * */
    @Override
    public void makeSound() {
        if (getEnergyLevel() > 4){
            setEnergyLevel(-4);
            System.out.println("Monkey makes a sound. -4");
        }else{
            System.out.println("Monkey does not have enough energy..");
        }
    }

    @Override
    public void eatFood(int eatFood) {

        switch (eatFood){
            case (Utils.FISH):
            case (Utils.MEAT):
            case (Utils.BUGS):
            case (Utils.GRAIN):
                setEnergyLevel(2);
                System.out.println("Monkey goes to eat. +2");
                break;
            default:
                System.out.println("This option is not a food");
                break;
        }


    }

    @Override
    public void goToSleep() {
        setEnergyLevel(10);
        System.out.println("Monkey goes to sleep. +10");
    }

    public void play(){
        if(getEnergyLevel() > 8){
            setEnergyLevel(-8);
            System.out.println("Oooo oooo oooo");
        }else{
            System.out.println("Monkey is too tired");
        }
    }
}


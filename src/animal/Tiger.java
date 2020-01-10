package animal;

/**
 * Tiger class implements the behavior
 *     of a tiger in the jungle.
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.0
 */
public class Tiger extends Animal {

    /*
     * Constructor
     * */
    public Tiger(){
        super("Tiger");

    }

    /*
     * Abstract methods implemented in the Tiger class
     * */
    @Override
    public void makeSound() {
        if (getEnergyLevel() > 3){
            setEnergyLevel(-3);
            System.out.println("Tiger makes a sound. -3");
        }else{
            System.out.println("Tiger does not have enough energy..");
        }
    }

    @Override
    public void eatFood(int eatFood) {

        switch (eatFood){
            case (Utils.FISH):
            case (Utils.MEAT):
            case (Utils.BUGS):
                setEnergyLevel(5);
                System.out.println("Tiger goes to eat. +5");
                break;
            case (Utils.GRAIN):
                System.out.println("Tiger cannot eat grains..");
                break;
            default:
                System.out.println("This option is not a food");
                break;
        }

    }

    @Override
    public void goToSleep() {
        setEnergyLevel(5);
        System.out.println("Tiger goes to sleep. +5");
    }
}


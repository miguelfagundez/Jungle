package animal;

/**
 * Snake class implements the behavior
 *     of a snake in the jungle.
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.0
 */
public class Snake extends Animal {

    /*
     * Constructors
     * */
    public Snake(){
        super("Snake");
    }

    /*
     * Abstract methods implemented in the Snake class
     * */
    @Override
    public void makeSound() {
        if (getEnergyLevel() > 3){
            setEnergyLevel(-3);
            System.out.println("Snake makes a sound. -3");
        }else{
            System.out.println("Snake does not have enough energy..");
        }
    }

    @Override
    public void eatFood(int eatFood) {
        switch (eatFood){
            case (Utils.FISH):
            case (Utils.MEAT):
            case (Utils.BUGS):
            case (Utils.GRAIN):
                setEnergyLevel(5);
                System.out.println("Snake goes to eat. +5");
                break;
            default:
                System.out.println("This option is not a food");
                break;
        }

    }

    @Override
    public void goToSleep() {
        setEnergyLevel(10);
        System.out.println("Snake goes to sleep. +10");
    }
}


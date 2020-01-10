package jungle;

import animal.Animal;
import animal.Monkey;
import animal.Snake;
import animal.Tiger;

/**
 * AustraliaJungleBuilder class.
 * It will construct a jungle (Australia).
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.2
 */
public class AustraliaJungleBuilder implements JungleBuilder {

    /*
     * Jungle Member
     * */
    private Jungle jungle;

    /*
     * Constructor
     * */
    public AustraliaJungleBuilder() {
        this.jungle = new Jungle("Australia");
    }

    @Override
    public void buildTigers() {

    }

    @Override
    public void buildMonkeys() {
        Animal monkey = new Monkey();
        jungle.addNewMonkey(monkey);
    }

    @Override
    public void buildSnakes() {
        Animal snake = new Snake();
        jungle.addNewSnake(snake);
    }

    @Override
    public Jungle getJungle() {
        return this.jungle;
    }
}

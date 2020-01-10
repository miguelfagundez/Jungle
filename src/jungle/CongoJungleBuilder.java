package jungle;

import animal.Animal;
import animal.Monkey;
import animal.Snake;
import animal.Tiger;

/**
 * CongoJungleBuilder class.
 * It will construct a jungle (Congo).
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.2
 */
public class CongoJungleBuilder implements JungleBuilder {

    /*
     * Jungle Member
     * */
    private Jungle jungle;

    /*
     * Constructor
     * */
    public CongoJungleBuilder() {
        this.jungle = new Jungle("Congo");
    }

    @Override
    public void buildTigers() {
        Animal tiger = new Tiger();
        jungle.addNewTiger(tiger);
    }

    @Override
    public void buildMonkeys() {
        Animal monkey = new Monkey();
        jungle.addNewMonkey(monkey);
        monkey = new Monkey();
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

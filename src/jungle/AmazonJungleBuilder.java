package jungle;

import animal.Animal;
import animal.Monkey;
import animal.Tiger;

/**
 * AmazonJungleBuilder class.
 * It will construct a jungle (Amazon).
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.2
 */
public class AmazonJungleBuilder implements JungleBuilder {

    /*
    * Jungle Member
    * */
    private Jungle jungle;

    /*
     * Constructor
     * */
    public AmazonJungleBuilder() {
        this.jungle = new Jungle("Amazon");
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
    }

    @Override
    public void buildSnakes() {

    }

    @Override
    public Jungle getJungle() {
        return this.jungle;
    }
}

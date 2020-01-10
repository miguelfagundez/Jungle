package jungle;

/**
 * JungleBuilder interface.
 * It is responsible for methods needed to
 * construct the jungle object.
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.2
 */
public interface JungleBuilder {

    void buildTigers();
    void buildMonkeys();
    void buildSnakes();

    Jungle getJungle();

}

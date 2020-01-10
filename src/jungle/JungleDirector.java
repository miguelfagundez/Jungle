package jungle;

/**
 * JungleDirector class.
 * It will be responsible for constructor a jungle,
 * depending on constructor's parameter.
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.2
 */
public class JungleDirector {

    /*
     * JungleBuilder Member
     * */
    private JungleBuilder jungleBuilder;

    /*
     * Constructor
     * */
    public JungleDirector(JungleBuilder jungleBuilder){
        this.jungleBuilder = jungleBuilder;
    }

    public void constructJungle(){
        jungleBuilder.buildMonkeys();
        jungleBuilder.buildSnakes();
        jungleBuilder.buildTigers();
    }

    public Jungle getJungle(){
        return jungleBuilder.getJungle();
    }
}

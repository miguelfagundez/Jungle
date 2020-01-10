import jungle.*;

/**
 * Demo class is where execute some
 * jungles types - examples
 * @author Miguel Fagundez
 * @since 01/09/2020
 * @version 1.2
 */

public class Demo {
    public static void main(String[] args){

        // Amazon jungle
        JungleBuilder jungleBuilder = new AmazonJungleBuilder();
        JungleDirector jungleDirector = new JungleDirector(jungleBuilder);
        jungleDirector.constructJungle();
        Jungle jungle = jungleDirector.getJungle();
        System.out.println(jungle.getJungleName() + ", Number of animals: " + jungle.getNumberOfAnimals());

        // Congo jungle
        jungleBuilder = new CongoJungleBuilder();
        jungleDirector = new JungleDirector(jungleBuilder);
        jungleDirector.constructJungle();
        jungle = jungleDirector.getJungle();
        System.out.println(jungle.getJungleName() + ", Number of monkeys: " + jungle.getNumberOfMonkeys());

        // Australia jungle
        jungleBuilder = new AustraliaJungleBuilder();
        jungleDirector = new JungleDirector(jungleBuilder);
        jungleDirector.constructJungle();
        jungle = jungleDirector.getJungle();
        System.out.println(jungle.getJungleName() + ", Number of Tigers: " + jungle.getNumberOfTigers());
    }
}

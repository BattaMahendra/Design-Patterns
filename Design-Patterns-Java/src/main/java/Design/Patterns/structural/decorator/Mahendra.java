package Design.Patterns.structural.decorator;

public class Mahendra {
    public static void main(String[] args) {
        System.out.println(" I am looking at ");
        /**
        * we can create a traditional Hema with beautiful jumkis
        */
        Hema traditonalHemaWithJumkis = new Jumki(new TraditionalHema(new CasualHema()));
        System.out.println( traditonalHemaWithJumkis.decoratingHems() );

        /**
        * we created a modern Hema with Adidas shoes
         */
        Hema modernHemaWithShoes = new Shoes(new ModernHema(new CasualHema()));
        System.out.println( modernHemaWithShoes.decoratingHems() );

        /*
        * we can create a casual Hema
        */
        Hema CasualHema = new CasualHema();
        System.out.println( CasualHema.decoratingHems() );


        /*
        * we can create Traditional Hema without Junkis*/

        Hema traditionalHema = new TraditionalHema(new CasualHema());
        System.out.println( traditionalHema.decoratingHems());
    }


}

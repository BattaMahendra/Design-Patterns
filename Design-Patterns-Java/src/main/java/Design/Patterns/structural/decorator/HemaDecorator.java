package Design.Patterns.structural.decorator;


/*
* This the abstract decorator class using which various decorations are implemented on base product*/
public abstract class HemaDecorator implements Hema {

    protected Hema specialHema;

    public HemaDecorator(Hema  specialHema){
        this.specialHema=specialHema;
    }

    public String decoratingHems(){
       return specialHema.decoratingHems();
    }
}

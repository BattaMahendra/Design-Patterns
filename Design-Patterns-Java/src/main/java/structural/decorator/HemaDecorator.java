package structural.decorator;

public abstract class HemaDecorator implements Hema {

    protected Hema specialHema;

    public HemaDecorator(Hema  specialHema){
        this.specialHema=specialHema;
    }

    public String decoratingHems(){
       return specialHema.decoratingHems();
    }
}

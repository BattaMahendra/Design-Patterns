package Design.Patterns.creational.prototype;

public class Laptop extends ComputerFactory {


    public Laptop(){}
    public Laptop(String company, String model, double cost){
        this.company=company;
        this.cost=cost;
        this.model=model;
    }
    @Override
    public  ComputerFactory copy() {

        return new Laptop(this.company,this.model, this.cost);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }


//    @Override
//
//    public boolean equals(Object obj) {
//
//        if (this == obj)
//
//            return true;
//
//        if (obj == null)
//
//            return false;
//
//        if (getClass() != obj.getClass())
//
//            return false;
//
//        PhoneBuilder other = (PhoneBuilder) obj;
//
//        return Objects.equals(battery, other.battery) && Objects.equals(os, other.os)
//
//                && Objects.equals(processor, other.processor) && Objects.equals(ram, other.ram)
//
//                && Double.doubleToLongBits(screensize) == Double.doubleToLongBits(other.screensize);
//
//    }
}

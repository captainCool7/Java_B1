package oops;

public class Car extends Vehicle{
    private int noOfGears;
    private boolean isConvertible;

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public void print(){
        System.out.println("Car ");
    }

    Car(String color,int maxSpeed,String brand,int noOfGears,boolean isConvertible){
        super(4,color,maxSpeed,brand);
        this.isConvertible = isConvertible;
        this.noOfGears = noOfGears;
    }
}

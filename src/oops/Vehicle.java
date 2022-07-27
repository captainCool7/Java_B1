package oops;

public class Vehicle {
    private int noWheel;
    protected String color;
    private int maxSpeed;
    private String brand;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private void print(){
        System.out.println("Vehicle with "+noWheel+" color: "+color);
    }

    Vehicle(int noWheel,String color,int maxSpeed,String brand){
        this.noWheel = noWheel;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }
}

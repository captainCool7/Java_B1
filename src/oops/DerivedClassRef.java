package oops;

public class DerivedClassRef {
    public static void main(String[] args) {
        Vehicle v = new Car("red",140,"honda",4,true);
        // v.setConvertible(); // Car only Function
        v.setMaxSpeed(150); //vehicle based speed
    }
}

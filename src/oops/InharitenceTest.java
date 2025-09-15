package oops;

public class InharitenceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        TwoWheeler two = new TwoWheeler();

        vehicle.commute();
        two.commute();
        two.balance();

        MotorCycle motor = new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}

package co.com.fredymosquera.command;

public class LightSilvana implements Light {

    public void on() {
        System.out.println("Turning on Silvana light...");
    }

    @Override
    public void off() {
        System.out.println("Turning Off Silvana light...");
    }
}

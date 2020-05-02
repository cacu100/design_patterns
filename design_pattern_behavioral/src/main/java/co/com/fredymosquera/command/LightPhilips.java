package co.com.fredymosquera.command;

public class LightPhilips implements Light{

    public void on() {
        System.out.println("Turning on Philips light...");
    }

    @Override
    public void off() {
        System.out.println("Turning Off Philips light...");
    }
}

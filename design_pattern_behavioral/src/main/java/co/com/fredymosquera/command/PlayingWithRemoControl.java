package co.com.fredymosquera.command;

public class PlayingWithRemoControl {

    public static void main(String[] args) {
        //Te remote is out invoker
        //It will passed a command object that can be passed to make request
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        //LightPlihilp will be our receiver of the request
        LightPhilips lightPhilips = new LightPhilips();
        LightSilvana lightSilvana = new LightSilvana();
        //Here were create a command and pass de Receiver to it
        LightCommand lightCommand = new LightCommand(lightPhilips);
        //Here whe pass the command to the invoker
        remoteControl.setSlot(lightCommand);
        //Finally we sumulate the press button
        remoteControl.pressButton();

        lightCommand = new LightCommand(lightSilvana);
        //Here whe pass the command to the invoker
        remoteControl.setSlot(lightCommand);
        //Finally we sumulate the press button
        remoteControl.pressButton();

    }
}

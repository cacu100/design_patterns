package command1;

public class RemoteControlTest {
	
	
	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = SimpleRemoteControl.getInstance();
		
		Light light = new PhilipsLight("Philips");
		
		remoteControl.PressButton(new LightOnCommand(light));
		
		remoteControl.PressButton(new LightOffCommand(light));
		
		
	}
	

}

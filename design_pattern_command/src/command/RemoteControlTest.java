package command;

public class RemoteControlTest {
	
	
	public static void main(String[] args) {
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light();
		remoteControl.PressButton(new LightOnCommand(light));
		
		remoteControl.PressButton(new LightOffCommand(light));
		
		
		
	}
	

}

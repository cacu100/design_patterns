package command1;

public class SimpleRemoteControl {
	
	static private SimpleRemoteControl object;

	public SimpleRemoteControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static SimpleRemoteControl getInstance() {

		object = new SimpleRemoteControl();
		return object;
	}

	public void PressButton(Command command) {
		if (command != null) {
			command.execute();
		}
	}

}

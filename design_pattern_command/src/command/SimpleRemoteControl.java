package command;

public class SimpleRemoteControl {

	public SimpleRemoteControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void PressButton(Command command) {
		if (command != null) {
			command.execute();
		}
	}

}

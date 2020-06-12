package command1;

public class LightOnCommand implements Command {

	Light light;
	
	
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.on();
		
	}

	

}

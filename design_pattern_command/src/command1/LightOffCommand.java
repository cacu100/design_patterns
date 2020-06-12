package command1;

public class LightOffCommand implements Command {
	
	Light light;
	

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub		
		this.light.off();
		
	}

}

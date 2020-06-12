package command1;

public abstract class Light {
	
	private String brandName;
	
	public Light(String brandName) {
		super();
		this.brandName = brandName;
	}

	public void on() {
		System.out.println("Light on "+this.brandName + " light");
	}
	
	public void off() {
		System.out.println("Light off "+this.brandName + " light");
	}

}

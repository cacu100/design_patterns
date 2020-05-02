package co.com.fredymosquera.command;

public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl(){}
    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void pressButton(){
        slot.execute();
    }


}

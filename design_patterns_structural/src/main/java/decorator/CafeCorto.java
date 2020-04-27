package decorator;

public class CafeCorto extends BebidaDecorator {
    @Override
    public void hacerBebida() {
        System.out.println("Hacer cafe corto..");
    }
}

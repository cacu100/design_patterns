package decorator;

public class CafeLecheDecorator extends  BebidaDecorator{
    private Bebida bebida;

    public CafeLecheDecorator(Bebida bebida) {
        this.bebida = bebida;
    }
    public void hacerBebida(){
        this.bebida.hacerBebida();
        System.out.println("Agregando leche la bebida");
    }
}

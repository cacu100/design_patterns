package decorator;

public class Main {
    public static void main(String[] args) {

        Bebida cafe =  new CafeLecheDecorator(new CafeCorto());
        cafe.hacerBebida();
    }
}

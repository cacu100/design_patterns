package co.com.fredymosquera.memento;

public class PlayingWithMemento {

    public static void main(String[] args) {
        Customer customer = new Customer("Pedro pica piedra", "calle roca", "333444");
        System.out.println(customer);
        CareTaker careTaker = new CareTaker();
        careTaker.save(customer);

        customer.setName("Pablo Marmol");
        customer.setAddres("Calle granito");

        careTaker.save(customer);
        System.out.println(customer);

        customer.setPhoneNumber("888-99999");
        careTaker.save(customer);

        careTaker.rollBack(customer);
        System.out.println(customer);

        careTaker.rollBack(customer);
        System.out.println(customer);

        careTaker.rollBack(customer);
        System.out.println(customer);


    }

}

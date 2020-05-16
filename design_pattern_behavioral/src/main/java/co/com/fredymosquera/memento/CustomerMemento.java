package co.com.fredymosquera.memento;

public class CustomerMemento {

    private String name;
    private String addres;
    private String phoneNumber;

    public CustomerMemento(String name, String addres, String phoneNumber) {
        this.name = name;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return addres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

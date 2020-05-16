package co.com.fredymosquera.memento;

import java.io.Serializable;

//Originator
public class Customer implements Serializable {

    private String name;
    private String addres;
    private String phoneNumber;

    public Customer(String name, String addres, String phoneNumber) {
        this.name = name;
        this.addres = addres;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    public CustomerMemento save(){
        return new CustomerMemento(name, addres, phoneNumber);
    }
    public void rollBack(CustomerMemento customerMemento){
        this.name = customerMemento.getName();
        this.addres = customerMemento.getAddres();
        this.phoneNumber = customerMemento.getPhoneNumber();
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", addres='" + addres + '\'' + ", phoneNumber='" + phoneNumber
                + '\'' + '}';
    }
}

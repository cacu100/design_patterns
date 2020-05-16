package co.com.fredymosquera.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class CareTaker {

    private Deque<CustomerMemento> customerHistory = new ArrayDeque<>();

    public void save(Customer customer){
        customerHistory.push(customer.save());
    }

    public void rollBack(Customer customer){
        customer.rollBack(customerHistory.pop());
    }
}

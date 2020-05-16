package co.com.fredymosquera.memento;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

public class SerializeObect {

    public static void main(String[] args) {

        Customer customer = new Customer("pepito perez", "Calle 12343", "32325555");

        serialize(customer);
        Optional<Customer>  customernew = deserialize();
        if(customernew.isPresent()){
            System.out.println(customernew.get());
        }else {
            System.out.println("Can't deserialized Object");
        }
    }

    private static void serialize(Customer customer) {
        Path path = Paths.get("src/main/resources/Customer.ser");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(customer);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Optional<Customer> deserialize() {
        Path path = Paths.get("src/main/resources/Customer.ser");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Customer customer = (Customer) objectInputStream.readObject();
            return Optional.of(customer);
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}

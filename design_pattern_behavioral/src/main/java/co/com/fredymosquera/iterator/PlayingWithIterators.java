package co.com.fredymosquera.iterator;

public class PlayingWithIterators {

    public static void main(String[] args) {
        ListObjects<String> listCanciones = new ListObjects<>(5);
        listCanciones.addCar("Billie Jean");
        listCanciones.addCar("Moonligh serenate");
        listCanciones.addCar("My hero");
        listCanciones.addCar("Everlong");
        listCanciones.addCar("Everlong acoustic ");
        listCanciones.addCar("Everlong");
        for (String song: listCanciones) {
            System.out.println(song);
        }
    }
}

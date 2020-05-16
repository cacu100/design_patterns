package co.com.fredymosquera.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class ListObjects<T> implements Iterable<T> {

    private T[] cars;
    private int index;

    public ListObjects(){
        cars = (T[]) new Object[16];
        index = 0;
    }

    public ListObjects(int size){
        if (size <=0){
            throw new IllegalArgumentException("size can't be <= 0, size: "+size);
        }
        cars =(T[]) new Object[size];
        index = 0;
    }

    public void addCar(T car){
        if(index == cars.length){
            T[] largeCars = (T[]) new Object[cars.length*2];
            System.arraycopy(cars, 0, largeCars,0, cars.length);
            cars = largeCars;
            largeCars = null;
        }

        cars[index++] = car;
    }

    @Override
    public Iterator<T> iterator() {
        return  new Iterator<T>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < cars.length && cars[index] != null;
            }

            @Override
            public T next() {
                return cars[index++];
            }
        };
    }
}

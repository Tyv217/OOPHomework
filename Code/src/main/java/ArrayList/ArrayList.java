package ArrayList;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class ArrayList<T> extends AbstractList<T> implements Iterable<T>, Collection<T> {
    private T[] storedArray;
    private int numberOfElements    ;
    @Override
    public T get(int index) {
        return storedArray[index];
    }

    @Override
    public T set(int index, T element){
        T oldValue = storedArray[index];
        storedArray[index] = element;
        return oldValue;
    }

    @Override
    public boolean add(T element){
        if(numberOfElements == 0){
            Object[] newArray = new Object[1];
            newArray[0] = element;
            storedArray = (T[]) newArray;
            numberOfElements = 1;
        }
        else if(numberOfElements == storedArray.length){
            Object[] newArray = new Object[numberOfElements*2];
            for(int x = 0; x < numberOfElements; x++){
                newArray[x] = storedArray[x];
            }
            newArray[numberOfElements] = element;
            storedArray = (T[])newArray;
            numberOfElements ++;
        }
        else{
            storedArray[numberOfElements] = element;
            numberOfElements ++;
        }
        return true;
    }

    @Override
    public void clear(){
        Object[] newArray = new Object[0];
        storedArray = (T[]) newArray;
        numberOfElements = 0;
    }

    @Override
    public T remove(int index){
        Object[] newArray = new Object[numberOfElements-1];
        int x = 0;
        T element = null;
        for(int y = 0; y < numberOfElements; y++){
            if(y == index){
                element = storedArray[y];
                continue;
            }
            else{
                newArray[x] = storedArray[y];
                x++;
            }
        }
        numberOfElements--;
        return element;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return Arrays.spliterator(storedArray);
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public <T1> T1[] toArray(IntFunction<T1[]> generator) {
        return (T1[]) storedArray.clone();
    }
}

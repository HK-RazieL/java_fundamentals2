package p02_generic_box_of_integer;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    List<T> list = new ArrayList<>();

    void add(T item){
        this.list.add(item);
    }

    @Override
    public String toString() {
        for(T item : this.list){
            System.out.printf("%s: %s%n", item.getClass().getName(), item);
        }
        return null;
    }
}

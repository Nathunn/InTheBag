package com.ItsInTheBag;

import java.util.*;
import java.util.function.Consumer;


//"T" Represents 'type' of thing Bag will hold
public class Bag<T> implements Container<T> {

    //Create List
    private List<T> con;

    public Bag()
    {
        this.con = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.con.isEmpty();
    }

    //Returns amount of items in bag
    public int size() {
        return this.con.size();
    }

    public void add(T item) {
        this.con.add(item);
    }

    public Iterator<T> iterator() {

        return this.con.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Container.super.spliterator();
    }
}

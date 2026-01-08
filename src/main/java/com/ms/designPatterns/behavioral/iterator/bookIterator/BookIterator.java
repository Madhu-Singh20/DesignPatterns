package com.ms.designPatterns.behavioral.iterator.bookIterator;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class BookIterator implements Iterator {

    private List<Book> books;
    private int index=0;

    public BookIterator(List<Book> books) {
        this.books = books;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index<books.size();
    }

    @Override
    public Object next() {
       if(hasNext()){
           return books.get(index++);
       }
       return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}

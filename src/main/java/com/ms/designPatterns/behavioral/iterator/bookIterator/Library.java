package com.ms.designPatterns.behavioral.iterator.bookIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {

    List<Book> books=new ArrayList<>();

    public Library(List<Book> books) {
        this.books = books;
    }

    public Iterator getIterator(){
        return new BookIterator(books);
    }
}

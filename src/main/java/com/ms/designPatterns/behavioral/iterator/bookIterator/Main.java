package com.ms.designPatterns.behavioral.iterator.bookIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Book> bookList=new ArrayList<>();
        bookList.add(new Book("Math"));
        bookList.add(new Book("Science"));
        bookList.add(new Book("Hindi"));
        bookList.add(new Book("English"));
        bookList.add(new Book("Art"));

        Library library=new Library(bookList);
        Iterator iterator=library.getIterator();

        while (iterator.hasNext()){
            System.out.println(((Book)iterator.next()).getName());
        }

    }
}

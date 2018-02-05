package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Library library = new Library("library1");
        Book book1 = new Book("One", "Phil", LocalDate.now());
        Book book2 = new Book("Two", "Bill", LocalDate.of(1992, 10, 23));
        Book book3 = new Book("Three", "Mill", LocalDate.of(2003, 2, 3));

        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            clonedLibrary.setName("libraryDeepCloned");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.books.remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.books.size());
        Assert.assertEquals(2, clonedLibrary.books.size());
        Assert.assertEquals(3, deepClonedLibrary.books.size());


    }
}

package com.kodilla.kodillapatterns2_2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2_2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        bookSet.add(new Book("author1", "title1", 2000, "1111"));
        bookSet.add(new Book("author2", "title2", 2001, "2222"));
        bookSet.add(new Book("author3", "title3", 2000, "3333"));
        bookSet.add(new Book("author4", "title4", 2002, "4444"));
        bookSet.add(new Book("author5", "title5", 2002, "5555"));
        //When
        int result = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println("Median is: " + result);
        Assert.assertEquals(2001, result);

    }
}

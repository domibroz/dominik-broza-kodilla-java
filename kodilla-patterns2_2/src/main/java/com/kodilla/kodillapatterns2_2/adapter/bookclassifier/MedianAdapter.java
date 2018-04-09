package com.kodilla.kodillapatterns2_2.adapter.bookclassifier;


import com.kodilla.kodillapatterns2_2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.kodillapatterns2_2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.kodillapatterns2_2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.kodillapatterns2_2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> booksMap = new HashMap<>();
        for (com.kodilla.kodillapatterns2_2.adapter.bookclassifier.librarya.Book book : bookSet) {
            booksMap.put(new BookSignature(book.getSignature()), new Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));

        }
        int result = medianPublicationYear(booksMap);
        return result;
    }
}

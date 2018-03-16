package com.kodilla.kodillapatterns2_2.adapter.bookclassifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}

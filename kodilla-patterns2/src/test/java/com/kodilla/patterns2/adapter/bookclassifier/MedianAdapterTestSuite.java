package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
    //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("A1", "T1", 2000, "123"));
        books.add(new Book("A2", "T2", 2002, "234"));
        books.add(new Book("A3", "T3", 2004, "345"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int result = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2002, result, 0);
        System.out.println("Publication year median: " + result);
    }
}

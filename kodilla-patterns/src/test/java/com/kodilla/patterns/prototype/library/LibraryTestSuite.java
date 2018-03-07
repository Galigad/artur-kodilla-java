package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Poczytaj mi mamo");
        library.getBooks().add(new Book("Kubus Puchatek", "Nice Guy", LocalDate.of(1990,12,12)));
        library.getBooks().add(new Book("Good book", "Unknown", LocalDate.of(2018,3,7)));
        library.getBooks().add(new Book("Another good book", "Better Writter", LocalDate.of(2017,6,2)));
        library.getBooks().add(new Book("Sad one", "Worst writter", LocalDate.of(2000,2,1)));

        Library shallowCopy = null;
        try {
            shallowCopy = library.shallowCopy();
            shallowCopy.setName("Poczytaj mi tato");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCopy = null;
        try {
            deepCopy = library.deepCopy();
            deepCopy.setName("Poczytajcie mi rodzice");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("The best book ever", "Some guy", LocalDate.of(2000,10,25)));

        //Then
        System.out.println(library);
        System.out.println(shallowCopy);
        System.out.println(deepCopy);
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, shallowCopy.getBooks().size());
        Assert.assertEquals(4, deepCopy.getBooks().size());
    }
}
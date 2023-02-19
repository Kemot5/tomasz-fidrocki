package com.kodilla.stream.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
     LibraryDatabase libraryDataBase;
     LibraryUser libraryUser;
    public BookLibrary(LibraryDatabase libraryDataBase) {
        this.libraryDataBase = libraryDataBase;
    }
    public List<Book>listBooksWithCondition(String titleFragment) {
        List<Book>bookList= new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDataBase.listBooksWithCondition(titleFragment);

        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
    public BookLibrary(LibraryUser libraryUser) {
        this.libraryUser= libraryUser;
    }


    public List<LibraryUser>listBookInHandOf(LibraryUser libraryUser) {
        List<LibraryUser> bookReturnList= new ArrayList<>();
        LibraryUser librarryUser= new LibraryUser("mr tomas","Fidro","121314");
        bookReturnList.add(librarryUser);

        return bookReturnList;
    }
}






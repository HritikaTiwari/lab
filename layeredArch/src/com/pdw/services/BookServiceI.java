package com.pdw.services;
import com.pdw.beans.BookBean;


@SuppressWarnings("unused")
public interface BookServiceI {
	 int addBook(int bookId , String title, float price);
}

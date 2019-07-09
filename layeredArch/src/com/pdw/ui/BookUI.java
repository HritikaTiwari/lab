package com.pdw.ui;
import java.util.Scanner;
import com.pdw.services.BookService;
public class BookUI {
@SuppressWarnings({ "resource", "unused" })
public static void main(String[] args)
{
	int bookId=0;
	String title="";
	float price=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Book BookId");
	bookId = s.nextInt();
	s.nextLine();
	System.out.println("Enter Book Title");
	title = s.next();
	s.nextLine();
	System.out.println("Enter Book price");
	price = s.nextInt();
	s.nextLine();
	BookService bs = new BookService();
	int result=bs.addBook(bookId, title, price);
	System.out.println("Result Inserted Successfully");
}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
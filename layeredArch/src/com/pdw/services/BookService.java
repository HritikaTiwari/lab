package com.pdw.services;
import java.util.ArrayList;
import com.pdw.beans.BookBean;
import com.pdw.dao.BookDAO;
@SuppressWarnings("unused")
public class BookService implements BookServiceI{
@Override
	public int addBook(int bookId, String title, float price) {
	String grade="";
	if(price<=300)
	{
		grade="C";
	}
	else if(price<=600)
	{
		grade="B";
	}
	else
	{
		grade="A";
	}
	BookDAO bookDAO = new BookDAO();
	BookBean bookBean = new BookBean();
	bookBean.setBookId(bookId);
	bookBean.setTitle(title);
	bookBean.setPrice(price);
	bookBean.setGrade(grade);
	int updateResult=0;
	try {
		updateResult= bookDAO.addBook(bookBean);
	    }
	catch(Exception e)
	    {
		System.out.println(e.toString());
	    }
		return 0;
	}
}

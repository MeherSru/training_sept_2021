package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service

public class BookService {
	@Autowired
	private Book book;
	public Book getBookById(int id) {
		book.setBookId(202);
		book.setBookName("java");
		book.equals("kathy");
		if(id==1) {
			book.setBookId(203);
			book.setBookName("javaa");
			book.equals("kathyy");
		}
		return this.book;
		
	}
	

}

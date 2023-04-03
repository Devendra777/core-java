package com.xworkz.someapp.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.someapp.book.Books;

import lombok.ToString;

@Component
@ToString
public class Library {

	public Library() {
		System.out.println(this.getClass().getSimpleName() + " Object is created");
	}

	@Autowired
	private List<Books> books;
}

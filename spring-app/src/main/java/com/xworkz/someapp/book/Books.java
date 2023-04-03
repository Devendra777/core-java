package com.xworkz.someapp.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Books {
	
	public Books() {
		System.out.println(this.getClass().getSimpleName()+ " Object is created");
	}

	@Value("1")
	private int id;
	@Value("Kiran")
	private String authorName;
	@Value("Blood Night")
	private String bookName;
	@Value("2023")
	private String yearOfPublication;
	@Value("200")
	private int price;
}

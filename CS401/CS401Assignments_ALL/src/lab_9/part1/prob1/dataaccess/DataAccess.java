package lab_9.part1.prob1.dataaccess;

import lab_9.part1.prob1.business.LibraryMember;

import java.awt.print.Book;
import java.util.HashMap;



public interface DataAccess { 
	public HashMap<String, Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}

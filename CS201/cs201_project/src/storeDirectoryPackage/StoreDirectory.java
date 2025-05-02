package storeDirectoryPackage;

import bookStorePackage.BookStore;
import marketPackage.Market;
import IDSPackage.Ids;

import java.util.Scanner;


public class StoreDirectory {


    public static int getNumberOfBooks() {
        return BookStore.getNumBooks();
    }

    public static int getNumberOfBookStoreEmployees() {
        return BookStore.getNumEmployees();
    }

    public static void addNewEmployee(String firstName, String lastName, double ID) {
        BookStore.addNewEmployee(firstName, lastName, ID);
    }

    public static boolean bookIsInStock(String title) {
        return BookStore.bookIsInStock(title);
    }

    public static void addNewBook(String title) {
        BookStore.addNewBook(title);
    }

    public static void addNewBook(String title, String authorFirstName, String authorLastName) {
        BookStore.addNewBook(title, authorFirstName, authorLastName);
    }

    public static boolean marketCarriesFoodItem(String foodItem) {
        String[] items = Market.getSTORE_ITEMS();
        for (String s : items) {
            if(s.matches(foodItem))
                return true;}

        return false;
    }
    public static boolean validateLogin(String id){
        return Ids.isGoodId(id);

    }

    public static String bookTitle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give the book's title:");
        return input.nextLine();

    }

    }


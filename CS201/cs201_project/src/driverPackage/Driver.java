package driverPackage;



import bookStorePackage.BookStore;
import storeDirectoryPackage.StoreDirectory;
import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String userID = "";                           //temp variable -- user ID validation



        System.out.println("Input 3 Digit user ID");

        String validateInput = input.next();
        if (!StoreDirectory.validateLogin(validateInput)) {
            wait(2000);
            System.out.println("invalid login");
        } else {
            userID = validateInput;
            wait(500);
            System.out.println("\n\nWELCOME [USER_" + userID + "]");
            wait(1000);
            bootProgram();
        }


        wait(500);
        System.out.println("\n------------SESSION TERMINATED------------");
    }

    public static void bootProgram() {
        String option;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("CHOOSE FROM THE FOLLOWING OPTIONS:\n");
            wait(1000);
            System.out.println("\tA ---- Create New Employee\n" +
                    "\tB ---- Display Number Of Books\n" +
                    "\tC ---- Display Number Of Employees\n" +
                    "\tD ---- Add Book to Inventory\n" +
                    "\tE ---- Find Book in Stock\n" +
                    "\tF ---- List All Books in Stock\n" +
                    "\tH ---- Check for Food Item in Stock\n" +
                    "\tN **** Exit Session\n");
            option = input.next().toUpperCase();


            switch (option) {

                case "A": {

                    System.out.println("\n------Create new Employee------\n");
                    System.out.println("Give First Name, last name and ID:");
                    StoreDirectory.addNewEmployee(input.next().trim(), input.next().trim(), input.nextDouble());
                    System.out.println("\n--------------------------------------\n");
                    break;
                }

                case "B": {

                    System.out.println("\n------Display Number of Books------\n");
                    wait(1000);
                    System.out.println("The BookStore currently has: " + StoreDirectory.getNumberOfBooks() + " book(s)");
                    System.out.println("\n--------------------------------------\n");
                    break;
                }

                case "C": {
                    System.out.println("\n------Display Number of Employees------\n");
                    System.out.println("The BookStore currently employs " + StoreDirectory.getNumberOfBookStoreEmployees() + " people");
                    System.out.println("\n--------------------------------------\n");
                    break;
                }


//
                case "D": {
                    System.out.println("\n------Add Book to Inventory------\n");

                    String title = StoreDirectory.bookTitle();

                    System.out.println("Authors First Name:");
                    String FirstName = input.next();
                    System.out.println("Authors Last Name");
                    String LastName = input.next();

                    StoreDirectory.addNewBook(title, FirstName, LastName);
                    System.out.println("\n--------------------------------------\n");
                    break;
                }
//
                case "E": {
                    System.out.println("\n------Find Book in Stock------\n");
                    System.out.println("Input the title of Book you're Looking for");

                    if (StoreDirectory.bookIsInStock(input.next())) {
                        System.out.println("yes, we have this title in-stock");
                    } else {
                        System.out.println("sorry, we do not have this title in-stock");
                    }
                    System.out.println("\n--------------------------------------\n");
                    break;

                }
                case "F": {
                    System.out.println("\n------Inventory of Books In-Stock------\n");
                    BookStore.getBook();
                    System.out.println("\n--------------------------------------\n");
                    break;
                }
//
                case "H": {
                    System.out.println("\n------Check for Food item in Stock------\n");
                    System.out.println("Which Food item are you checking?");
                    String foodOrDrink = input.next();
                    if (StoreDirectory.marketCarriesFoodItem(foodOrDrink))
                        System.out.println("yes, we have " + foodOrDrink + " in-Stock");
                    else
                        System.out.println("Sorry, we do not have " + foodOrDrink + " in-Stock");
                    System.out.println("\n--------------------------------------\n");
                    break;
                }


                case "N": {
                    System.out.println("\nEnding Session...\n");
                    option = "N";
                    break;
                }


                default: {
                    System.out.println("Invalid Option\n");

                }

            }
            wait(1500);
            if (option.matches("N"))
                break;

             else {
                System.out.println("************CONTINUE SESSION? (Y/N)************");
                option = input.next().toUpperCase();
            }

        } while (!option.matches("N") && option.matches("Y"));


    }public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

}





import java.util.Arrays;
import java.util.ListIterator;
import java.util.ArrayList;

public class BookDetails {

	//CREATE A NEW BOOK WITH THIS INFORMATION
	public static String[] addBook(String ISBN, String author, String bookName, String bookDescrip, String price,
			                String genre, String publisher, String yearPublished, String copiesSold)
	{
		String[] newListTest = new String[9];
		newListTest[0] = ISBN;
		newListTest[1] = author;
		newListTest[2] = bookName;
		newListTest[3] = bookDescrip;
		newListTest[4] = price;
		newListTest[5] = genre;
		newListTest[6] = publisher;
		newListTest[7] = yearPublished;
		newListTest[8] = copiesSold;
	    return newListTest;
 	}
	
     //GET THE DETAILS OF THE BOOK WITH THIS ISBN
	 public static void getBookDetailsISBN(String ISBN, ArrayList<String[]> myList){
	 ListIterator<String[]> iterL1 = myList.listIterator();
	 ArrayList<String> temp2 = new ArrayList<>();
	 String[] itemL1 = null;
	 String temp = null;
	 String[] booksDetails = null;
	 boolean foundALL = false;
	 boolean authFound = false;
	 
	 if (iterL1.hasNext())
	 {
	 itemL1 = iterL1.next();
	 booksDetails = itemL1;
	 }
	 
	 while (foundALL == false) {
	 if((booksDetails[0].compareTo(ISBN)) == 0) 
	 {
		 temp = Arrays.toString(booksDetails);
		 temp2.add(temp);
		 foundALL = true;
		 authFound = true;
	 }
	 else if (iterL1.hasNext() == true)      
	 {
		 itemL1 = iterL1.next(); 
		 booksDetails = itemL1;
		 foundALL = false;
	 }
	 else
	 {
		 itemL1 = null;
		 foundALL = true;
	 }
	 }
	 if (authFound == false)
	 {  
		 System.out.println("Zero books with ISBN: " + ISBN);
	 }
	 else
	 {
		 System.out.println(temp2); 
	 }
	 }
	
	//Create new author given info
	public static String[] newAuthor(String firstName, String lastName, String biography, String publisher) {
		String[] author = new String[4];
		author[0] = firstName;
		author[1] = lastName;
		author[2] = biography;
		author[3] = publisher;
		System.out.println(Arrays.toString(author));
		return author;
	}
	
	 //GET LIST OF BOOKS WRITTEN BY THIS AUTHOR
	 public static void getAuthorsBookDetails(String authorsNAME, ArrayList<String[]> myList){
	 ListIterator<String[]> iterL1 = myList.listIterator();
	 ArrayList<String> temp2 = new ArrayList<>();
	 String[] itemL1 = null;
	 String temp = null;
	 String[] booksDetails = null;
	 boolean foundALL = false;
	 boolean authFound = false;
	 
	 if (iterL1.hasNext())
	 {
	 itemL1 = iterL1.next();
	 booksDetails = itemL1;
	 }
	 
	 while (foundALL == false) {
	 if((booksDetails[1].compareTo(authorsNAME)) == 0) 
	 {
		 temp = booksDetails[2];
		 temp2.add(temp);
		 authFound = true;
			 if (iterL1.hasNext() == true)
			 {
			 itemL1 = iterL1.next(); 
			 booksDetails = itemL1;
			 foundALL = false;
			 }
			 else
			 {
			 foundALL = true;
			 }
	 }
	 else if (iterL1.hasNext() == true)      
	 {
		 itemL1 = iterL1.next(); 
		 booksDetails = itemL1;
		 foundALL = false;
	 }
	 else
	 {
		 itemL1 = null;
		 foundALL = true;
	 }
	 }
	 if (authFound == false)
	 {  
		 System.out.println("Zero books written by: " + authorsNAME);
	 }
	 else
	 {
		 System.out.println(temp2); 
	 }
	 }
	
	//MAIN CLASS TO TEST METHODS
	public static void main(String[] args) {
		ArrayList<String[]> BOOK = new ArrayList<String[]>();
		newAuthor("Tanner", "Ellingson", "Loves Ashtyn!", "Rockys Publishing Group");
		//System.out.println();
		//ISBN, Author, Book Name, Book Description, Price, Genre, Publisher, Year Published, Copies Sold
		BOOK.add(addBook("741","Jerry Seinfield","On Love and Peace","A world without war.","$19.99","Fiction","Geralds Publishing","1906","25000"));
		BOOK.add(addBook("852","Tyler Lewis","Up Shits Creek","When life is a mess.","$25.99","Lifestyle","Daily W Publishing","2020","60000"));
		BOOK.add(addBook("963","MC Branch","Get Out of Dodge","Sometimes you gotta go.","$15.99","Non-Fiction","Daily W Publishing","2022","14000"));
		BOOK.add(addBook("159","Tyler Lewis","Brady The GOAT","Is the legend real?","$9.99","Documentary","Michelle P. Publishing","2022","36000"));
		//System.out.println(Arrays.deepToString(BOOK.toArray()));
	    getAuthorsBookDetails("Jerry Seinfield", BOOK);
	    getBookDetailsISBN("96", BOOK);
	}
}

package tareajava;

public class Books {
	
	
	private String title;
	private String author;
	private double price;
	private int year;
	private String genre;
	private int pages;
	
	public Books() {}
	public Books (String t, String a, double p, int y, String g, int pa) {
		this.title = t;
		this.author = a;
		this.price = p;
		this.year = y;
		this.genre = g;
		this.pages = pa;
		}
	
	public void myBook() {
		System.out.println("My book is "+title+" by "+author);
	}
	public void writter() {
		System.out.println("This book´s writter is "+author);
	}
	public String size() {
		if(pages>900) {
			return("Huge");
		}
		else if(pages>500) {
			return("big");
		}
		else if(pages>200) {
			return("big");
		}
		else {
			return("small");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Books book1 = new Books("Dante and Aristotle discover the secrets of the universe", "Benjamin Alire Saenz", 942,2012,"Coming of age", 392);
		Books book2 = new Books("The song of Achilles", "Madeline Miller", 370,2011,"Romance",416);
		Books book3 = new Books("La guerra del fin del mundo", "Mario Vargas Llosa", 900 ,1981,"Ficcion historica",531);
		Books book4 = new Books("Les recres du petit Nicolas", "Rene Goscinny", 175,1961,"Ficcion",99);
		
		book1.myBook();
		System.out.println("It´s size is "+book1.size());
		
		Author author1 = new Author("Benjamin Alire Saenz", "male", "american");
		Author author2 = new Author("Madeline Miller", "female", "american");
		Author author3 = new Author("Mario Vargas Llosa", "male", "chilean");
		Author author4 = new Author("Rene Goscinny", "female", "french");
		
		author1.presentation();
		author2.presentation();
		author3.presentation();
		author4.presentation();
		
		author3.setNationality("peruvian");
		author4.setGender("male");
		
		author1.presentation();
		author2.presentation();
		author3.presentation();
		author4.presentation();
		
		System.out.println("My favourite "+author3.getNationality()+" author is "+author3.getName());
	}
}

	

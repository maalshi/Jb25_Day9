
public abstract class Book {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	public Book(String name, String author, int yearPublished) {
		super();
		this.name = name;
		this.author = author;
		this.yearPublished = yearPublished;
	}
	
	public Book(){
		
	}
	
	String name;
	String author;
	int yearPublished;
	
	

}

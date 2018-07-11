
public class NovelBook extends Book{
	private String country;
	
	public String getCountry() {
		return country;
	}

	public NovelBook(String name, String author, int yearPublished, String country){
		setName(name);
		setAuthor(author);
		setYearPublished(yearPublished);
		this.country=country;
	}

}

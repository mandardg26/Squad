package collectionframework;

class Book{
	int Bookid;
	String name;
	int prize;
	String Author;
	int published;
	
	Book(int Bookid,String name,int prize,String Author,int published){
		this.Bookid=Bookid;
		this.name=name;
		this.prize=prize;
		this.Author=Author;
		this.published=published;
		
	}

	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getPublished() {
		return published;
	}

	public void setPublished(int published) {
		this.published = published;
	}
	
	
	
}

public class Set_bookex {
public static void main(String[] args) {
	
}
}

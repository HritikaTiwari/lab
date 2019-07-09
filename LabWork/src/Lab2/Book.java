package Lab2;

public class Book extends WrittenItem {

	public Book(int id, String title, int numOfcopies, String author) {
		super(id, title, numOfcopies, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getNumOfcopies()=" + getNumOfcopies()
				+ ", getClass()=" + getClass() + "]";
	}

	

}

package Lab2;

public abstract class WrittenItem extends Item {
private String author;

public WrittenItem(int id, String title, int numOfcopies, String author) {
	super(id, title, numOfcopies);
	this.author = author;
}

public String getAuthor() {
	return author;
}

@Override
public String toString() {
	return "WrittenItem [author=" + author + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	WrittenItem other = (WrittenItem) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	return true;
}

public void setAuthor(String author) {
	this.author = author;
}
}

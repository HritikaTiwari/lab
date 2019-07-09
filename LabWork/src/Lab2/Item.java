package Lab2;

public abstract class Item {
	private int id;
	private String title;
	private int numOfcopies;
	public Item(int id, String title, int numOfcopies) {
		super();
		this.id = id;
		this.title = title;
		this.numOfcopies = numOfcopies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumOfcopies() {
		return numOfcopies;
	}
	public void setNumOfcopies(int numOfcopies) {
		this.numOfcopies = numOfcopies;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + numOfcopies;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (numOfcopies != other.numOfcopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", numOfcopies=" + numOfcopies + "]";
	}
	public void print()
	{
		System.out.println(toString());
	}
	public void checkIn()
	{
		System.out.println("Checked In");
	}
	public void checkOut()
	{
		System.out.println("Checked Out");
	}
	public void addItem()
	{
		System.out.println("Item Added");
	}
	

}

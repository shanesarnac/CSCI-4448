public class Book extends Media implements Comparable<Media>
{
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    
    public Book() {
    	this("No Title", "No Author");
    }
    
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	}
    
	public int compareTo(Media media) {
		if (media instanceof Book) {
			String object_title = ((Book) media).getTitle();
			String object_author = ((Book) media).getAuthor();
			if (title.compareTo(object_title) < 0) {
				return -1;
			}
			else if (title.compareTo(object_title) == 0) {
				return author.compareTo(object_author);
			}
			else {
				return 1;
			}
		}
		else {
			return media.compareTo(this);
		}
		//return title.compareTo(media.getTitle());
	}
	
	public void printHello() {
		System.out.println("Hello from Book!");
	}
    
    
}


abstract class Media implements Comparable<Media>
{
    protected String title;
	public String getTitle()  { return title; }
	public int compareTo(Media arg0) {
		return title.compareTo(arg0.getTitle());
	}
	
	public void printHello() {
		System.out.println("Hello from Media!");
	}
}

class DVD extends Media implements Comparable<Media>
{
    private int year;
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
	public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}
    
	public int compareTo(Media arg0) {
		if (arg0 instanceof DVD) {
			int argYear =((DVD)arg0).getYear(); 
			String argTitle = arg0.getTitle();
			if (title.compareTo(argTitle) < 0) {
				return -1;
			}
			else if(title.compareTo(argTitle) == 0) {
				if (year < argYear) {
					return -1;
				}
				else if (year == argYear) {
					return 0;
				}
				else {
					return 1;
				}
			} 
			else {
				return 1;
			}
		}
		else if(arg0 instanceof Book) {
			return -1;
		}
		
		return title.compareTo(arg0.getTitle());
	}
}

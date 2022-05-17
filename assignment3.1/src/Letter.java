
public abstract class Letter
{
	protected String title;
	protected Object chapters;

	public Letter(String title, Object chapters)
	{
		this.title = title;
		this.chapters = chapters;
	}
	
	// title getter
	public String getTitle()
	{
		return title;
	}
	
	// title setter 
	public void setTitle(String title)
	{
		this.title = title;
	}

	// chapter getter
	public Object getChapters()
	{
		return chapters;
	}

	// chapter setter
	public void setChapters(Object chapters)
	{
		this.chapters = chapters;
	}

	// abstract method to display book category
	public abstract void display2();
}
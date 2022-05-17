
public class LocalChurches extends Letter
{
	private String category;  // add book category

	public LocalChurches(String category, String title, Object chapters)
	{
		super(title, chapters);
		this.category = category;
	}
	
	public void display2()
	{
		System.out.println(this.title +" (" + this.chapters + " chapters)" + " - Category: " + this.category);
	}
}

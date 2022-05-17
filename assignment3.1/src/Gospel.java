
public class Gospel extends AbstractMain
{
	private String category;  // add book category

	public Gospel(String category, String title, Object chapters)
	{
		super(title, chapters);
		this.category = category;
	}
	
	public void display()
	{
		System.out.println(this.title +" (" + this.chapters + " chapters)" + " - Category: " + this.category);
	}
}

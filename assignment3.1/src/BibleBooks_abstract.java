// Assignment 3.1 - CSC250
// BibleBooks Abstract Class (from file NT_books.dat)
// by Kristopher Smolarek

public abstract class BibleBooks_abstract
{
	private String title;
	private Object chapters;

	public abstract String display();

	// BibleBook constructor
	public BibleBooks_abstract(String title, Object chapters)
	{
		this.title = title;
		this.chapters = chapters;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public Object getChapters()
	{
		return chapters;
	}

public class Gospel extends BibleBooks_abstract
{
	private String category;  // add book category

	public Gospel(String title, Object chapters, String category)
	{
		super(title, chapters);
		findCategory(category);
	}
		public String display()
		{
			 System.out.println(category + ": " + title +" (" + chapters + " chapters)");
			 return category;
		}
	
		public void findCategory(String findCategory)
		{
			if(findCategory == "Gospel")
			{
				category = findCategory;
			}
	}
}
}
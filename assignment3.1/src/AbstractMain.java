// Assignment 3.1 - CSC250 by Kristopher Smolarek
// BibleBooks Abstract Class (from file NT_books.dat)

public abstract class AbstractMain
{
		protected String title;
		protected Object chapters;

		public AbstractMain(String title, Object chapters)
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
		public abstract void display();
	}
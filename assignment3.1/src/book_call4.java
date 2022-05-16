// BibleBooks abstract assignment by Kristopher Smolarek (CSC250)
// Read New Testament books from file "NT_books.dat"
// Display based on book category

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class book_call4
{
	public static void main(String[] args)
	{
		try
		{
			Scanner fileIn = new Scanner(new File(System.getProperty("user.dir") + "/src/NT_books.dat"))
			.useDelimiter("\n");
			List<String> book_list = new ArrayList<String>();
			while(fileIn.hasNext())
			{
				String items = fileIn.next();
				book_list.add(items);
			}
				fileIn.close();
				
			String[] NTbooks_array = new String[book_list.size()];
			book_list.toArray(NTbooks_array);
			
			// create string and new array to split NTbooks_array into category/title/chapters/summary
			String books = String.join(":", NTbooks_array);
			String[] NTbooks_array2 = books.split(":");
			
			// test printing for String sorted_title and String[] title_array
			// System.out.println(sorted_title);
			// System.out.println(Arrays.toString(title_array));
					
			for (int i = 0; i < NTbooks_array2.length; i = i+4)
			{
				String category = NTbooks_array2[i];
				String title = NTbooks_array2[i+1];
				Object chapters = NTbooks_array2[i+2];
				BibleBooks_abstract add_book = new BibleBooks_abstract(category, title, chapters);
				add_book.display();
			}	
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
	}
}
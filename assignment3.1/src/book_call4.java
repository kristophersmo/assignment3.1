// BibleBooks abstract assignment by Kristopher Smolarek (CSC250)
// Read New Testament books from file "NT_books.dat"
// Display based on book category

import java.io.File;
import java.util.ArrayList;
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
			
			String user_choice = getCategory();
			
			if (user_choice.compareTo("1") == 0)
			{
				for (int i = 0; i <= 19; i = i+4)
				{
					String category = NTbooks_array2[i];
					String title = NTbooks_array2[i+1];
					Object chapters = NTbooks_array2[i+2];
					Gospel show_gospel = new Gospel(category, title, chapters);
					show_gospel.display();
				}
			}
			if (user_choice.compareTo("2") == 0)
			{
				for (int i = 20; i <= 55; i = i+4)
				{
					String category = NTbooks_array2[i];
					String title = NTbooks_array2[i+1];
					Object chapters = NTbooks_array2[i+2];
					LocalChurches show_letter = new LocalChurches(category, title, chapters);
					show_letter.display2();
				}
			}
			if (user_choice.compareTo("3") == 0)
			{
				for (int i = 56; i <= 71; i = i+4)
				{
					String category = NTbooks_array2[i];
					String title = NTbooks_array2[i+1];
					Object chapters = NTbooks_array2[i+2];
					PastoralEpistles show_letter = new PastoralEpistles(category, title, chapters);
					show_letter.display2();
				}
			}
			if (user_choice.compareTo("4") == 0)
			{
				for (int i = 72; i < NTbooks_array2.length; i = i+4)
				{
					String category = NTbooks_array2[i];
					String title = NTbooks_array2[i+1];
					Object chapters = NTbooks_array2[i+2];
					GeneralEpistles show_letter = new GeneralEpistles(category, title, chapters);
					show_letter.display2();
				}
			}
		}
		catch(Exception e)
		{
			System.err.println(e.toString());
		}
	}

	static String getCategory()
	{
		Scanner book_type = new Scanner(System.in);
		System.out.println("Which book category would you like to see? Your choices are:");
		System.out.println("1. Gospel");
		System.out.println("2. Local Church Letters");
		System.out.println("3. Pastoral Epistles");
		System.out.println("4. General Epistles");
		System.out.println("Please type a number corresponding to your desired book category");
		String user_choice = book_type.nextLine();
		book_type.close();
		System.out.println("You chose book category: " + user_choice);
		System.out.println();
		return user_choice;
	}
}
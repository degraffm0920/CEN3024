import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 * @author Matt Degraffenreid
 * Program Name: Application.java
 * Date: 9/5/2018
 * Purpose: Write a program to compare two files.
 */
public class Application
{
	//Main method
	public static void main(String[] args) throws IOException
	{
		//Correct the user for bad use
		if(args.length != 2)
		{
			System.out.println("Correct usage java Application file1.fileToCheck file2.dictionary");
			return;
		}

		//Take in the files
		List<String> checkFile = Files.readAllLines(new File(args[0]).toPath(), Charset.defaultCharset());
		List<String> dictionary = Files.readAllLines(new File(args[1]).toPath(), Charset.defaultCharset());

		//See if the word in the file to check are in the dictionary
		for(String word : checkFile)
			if(!dictionary.contains(word))
				System.out.println(word + " is an unknown word");
	}
}

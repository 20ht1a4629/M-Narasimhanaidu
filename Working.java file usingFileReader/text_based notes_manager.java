package com.readerandwriter;

import java.io.FileWriter;
import java.util.*;
import java.io.*;

public class NotesApp 
{
	private static final String
	FILE_NAME ="NOTES.TEXT";
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n--- Notes Manager ---");
			System.out.println("\n1. Add\n2. view\n3. Exit");
			System.out.println("Choose an option: ");
		
		int choice = sc.nextInt();
		sc.nextLine(); 
		switch(choice) {
		case 1:
			addNote(sc);
			break;
		case 2:
			viewNotes();
			break;
		case 3:
			System.out.println("Existing ....");
			return;
			default:
				System.out.println("Invalid choice. Try again .");
		}
	}

}
	private static void addNote(Scanner sc)
	{
		System.out.println("Enter your note: ");
		String note = sc.nextLine();
		try(FileWriter writer = new FileWriter(FILE_NAME, true))
		{
			writer.write(note + System.lineSeparator());
			System.out.println("Note saved");
		}
			catch(IOException e)
			{
				System.out.println("Error Writing note: "+e.getMessage());
			}}
		private static void viewNotes()
		{
			try (BufferedReader reader  = new BufferedReader(new FileReader(FILE_NAME)))
			{
				String line;
				System.out.println("\n --- your notes ----");
				while((line =reader.readLine()) != null)
				{
					System.out.println("- "+ line);
				}
			}
			catch(IOException e) {
				System.out.println("ERROR Reading notes:"+ e.getMessage());
			}
		}
	}
		
	

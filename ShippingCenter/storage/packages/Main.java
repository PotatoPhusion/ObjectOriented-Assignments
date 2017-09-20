package storage.packages;

 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
// intro to program

	public static void main(String[] args) {

		PackageList parcels = new PackageList(1);
		boolean exit;
		boolean inMenu;
		int input = 0;
		Scanner userInput = new Scanner(System.in);


		FileReader fr;
		Scanner inFile = null;

		try {
			fr = new FileReader("packages.txt");
		    inFile = new Scanner(fr);
		}
		catch (FileNotFoundException ex) {
			System.out.println("you done goofed");
		}

		//FileReader fr = new FileReader("packages.txt");
	    //canner inFile = new Scanner(fr);

	        //Read one line
	        String line = inFile.nextLine();

	        //Split the line into words, using the space character as a separator
	       String[] words = line.split(" ");



	//while(Boolean.valueOf(line)) {
	        String tracking = words[0];
	        String type = words[1];
	        String specif = words[2];
	        String mailingClass = words[3];
	        Float weight =Float.parseFloat(words[4]);
	        int volume = Integer.parseInt(words[5]);

	        System.out.println("Tracking: "+tracking+"| Type : "+type+"| Spefic: "+specif);
	        System.out.print("Class: "+mailingClass+"| Weight: "+weight+"| Volume: " +volume);

	        inFile.close(); //Close file










		exit = false;

		while (!exit) {

			System.out.println("1. Show all existing package records.");
			System.out.println("2. Add new package record to the database.");
			System.out.println("3. Delete package record from database.");
			System.out.println("4. Search for a package (given its tracking number).");
			System.out.println("5. Show a list of packages within a given weight range.");
			System.out.println("6. Exit program.");

			inMenu = true;

			while (inMenu) {
				if (userInput.hasNextInt()) {
					input = userInput.nextInt();

					if (input >= 1 && input <= 6) {
						inMenu = false;
					}
					else {
						System.err.println(input + " is not a menu option");
					}
				}
				else {
					String badInput = userInput.nextLine();
					System.err.println(badInput + " is not a menu option");
				}
			}

			switch (input) {
			case (1):
				parcels.showAll();
				break;
			case (2):
				parcels.addPackage(new Package());
				break;
			case (3):
				deletePackage();
				break;
			case (4):
				searchPackages();
				break;
			case (5):
				showByWeightRange();
				break;
			default:
				exit();
				break;
			}
		}
	}

	// FIXME: These aren't staying here, they're getting their own PackageList class.

	private static void showAll() {
		System.out.println("1");
	}

	private static void addPackage() {
		System.out.println("2");
	}

	private static void deletePackage() {
		System.out.println("3");
	}

	private static void searchPackages() {
		System.out.println("4");
	}

	private static void showByWeightRange() {
		System.out.println("5");
	}

	private static void exit() {
		System.out.println("6");
	}
}

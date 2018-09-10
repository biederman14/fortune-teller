import java.util.Scanner;

public class FortuneTeller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String replyYorN = null;
		do {
			System.out.println("Greetings, commoner.  I am Magestico, the Oracle of Ohio.");
			System.out.println(
					"Would you like me to tell your future happenings?  Your answer must be \"yes\" or \"no\".");
			String fortuneYorN = input.nextLine();
			if (fortuneYorN.equalsIgnoreCase("yes")) {
				System.out.println("Wonderful. You shall not be sorry.");
			} else if (fortuneYorN.equals("no")) {
				System.out.println("Nobody likes a quitter. Goodbye!");
				System.exit(0);
			} else if (fortuneYorN.equals("quit")) {
				System.out.println("Nobody likes a quitter. Goodbye!");
				System.exit(0);
			} else {
				System.out.println("Clearly you cannot follow instructions. I am done with you!");
				System.exit(0);
			}
			System.out.println(" ");
//UserName
			System.out.println("Tell me your first name.");
			String firstName = input.nextLine();
			String lastName = null;
			if (firstName.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter. Goodbye!");
				System.exit(0);
			} else {
				System.out.println("Tell me your last name.");
				lastName = input.nextLine();
			}
			if (lastName.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter. Goodbye!");
				System.exit(0);
			} else {
				System.out.println("Welcome, " + firstName + " " + lastName + ".");
			}
			System.out.println(" ");
// userAgestring
			System.out.println("How many years have you lived in full?");
			System.out.println("Hint: Age must be whole numbers greater than zero.");
			String userAgestring = input.nextLine();
			boolean userAgequit = false;
			while (!userAgequit) {
				if (userAgestring.equalsIgnoreCase("quit")) {
					System.out.println("Nobody likes a quitter. Goodbye!");
					userAgestring = input.nextLine();
					System.exit(0);
				} else {
					userAgequit = true;
				}
			}
			int userAge = Integer.parseInt(userAgestring);
			int retirementAge = 0;
			if (userAge % 2 == 0) {
				// retirementAge = 35;
				System.out.println("You will retire in " + retirementAge + " years.");
			} else if (userAge % 2 != 0) {
				retirementAge = 25;
				System.out.println("You will retire in " + retirementAge + " years.");
			} else {
				System.out.println("Clearly you cannot follow instructions.  I am done with you! Goodbye!");
				System.exit(0);
			}

			System.out.println(" ");
//BirthMonthQuit
			System.out.println("What is the number, 1-12, of the month in which you were born?");
			String birthMonthstring = input.nextLine();
			boolean userBirthquit = false;
			while (!userBirthquit) {
				if (birthMonthstring.equalsIgnoreCase("quit")) {
					System.out.println("Nobody likes a quitter. Goodbye!");
					birthMonthstring = input.nextLine();
					System.exit(0);
				} else {
					userBirthquit = true;
				}
			}
//BirthMonth 		
			int birthMonth = Integer.parseInt(birthMonthstring);
			int bankBalance = 0;
			if (birthMonth > 0 && birthMonth < 4) {
				bankBalance = 500000;
				System.out.println("You will retire with $" + bankBalance + " in the bank.");
			} else if (birthMonth > 3 && birthMonth < 7) {
				bankBalance = 24500;
				System.out.println("You will retire with $" + bankBalance + " in the bank.");
			} else if (birthMonth > 6 && birthMonth < 10) {
				bankBalance = 50;
				System.out.println("You will retire with $" + bankBalance + " in the bank.");
			} else if (birthMonth > 9 && birthMonth < 13) {
				bankBalance = 100000000;
				System.out.println("You will retire with $" + bankBalance + " in the bank.");
			} else if (birthMonth < 1 || birthMonth > 12) {
				System.out.println("Clearly you cannot follow instructions. I am done with you!");
				System.exit(0);
			} else {
				System.out.println("Clearly you cannot follow instructions. I am done with you!");
				System.exit(0);
			}
			System.out.println(" ");
//Number of Siblings
			System.out.println("How many siblings do you have?");
			System.out.println("Hint: Must be a whole number.");
			String userSiblingstring = input.nextLine();
			boolean userSiblingquit = false;
			while (!userSiblingquit) {
				if (userSiblingstring.equalsIgnoreCase("quit")) {
					System.out.println("Nobody likes a quitter. Goodbye!");
					userSiblingstring = input.nextLine();
					System.exit(0);
				} else {
					userSiblingquit = true;
				}
			}

			int userSiblings = Integer.parseInt(userSiblingstring);
			String vacationHome = "";
			if (userSiblings > -1 && userSiblings < 0) {
				vacationHome = "Pensicola, Florida";
				System.out.println("You will have a vacation home in " + vacationHome + ".");
			} else if (userSiblings > 0 && userSiblings < 2) {
				vacationHome = "Dubai, United Arab Emirates";
				System.out.println("You will have a vacation home in " + vacationHome + ".");
			} else if (userSiblings > 1 && userSiblings < 3) {
				vacationHome = "Munich, Germany";
				System.out.println("You will have a vacation home in " + vacationHome + ".");
			} else if (userSiblings > 2 && userSiblings < 4) {
				vacationHome = "Dubrovnick, Croatia";
				System.out.println("You will have a vacation home in " + vacationHome + ".");
			} else if (userSiblings > 3) {
				vacationHome = "Cleveland, Ohio";
				System.out.println("You will have a vacation home in " + vacationHome + ".");
			} else {
				vacationHome = "the fiery pits of hell because you can't have negative siblings";
				System.out.println("You will have a vacation home in " + vacationHome + ".");
			}
			System.out.println(" ");
//FavoriteColor
			System.out.println("What is your favorite ROYGBIV color?" + "\n"
					+ "If you don't know what ROYGBIV is, go back to elementary school or type \"help\".");
			String userFavcolor = input.nextLine();
			while (userFavcolor.equalsIgnoreCase("help")) {
				System.out.println("ROYGBIV stands for the colors of the rainbow:");
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
				System.out.println("Now, type the name of your favorite ROYGBIV color.");
				userFavcolor = input.nextLine();
			}
			if (userFavcolor.equalsIgnoreCase("Red") || userFavcolor.equalsIgnoreCase("Orange")
					|| userFavcolor.equalsIgnoreCase("Yellow") || userFavcolor.equalsIgnoreCase("Green")
					|| userFavcolor.equalsIgnoreCase("Blue") || userFavcolor.equalsIgnoreCase("Indigo")
					|| userFavcolor.equalsIgnoreCase("Violet")) {
				System.out.println("Interesting choice.");
			} else if (userFavcolor.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...Goodbye!");
				System.exit(0);
			} else {
				System.out.println("Clearly you need a break. Get out of here!");
				System.exit(0);
			}
			System.out.println(" ");
//Color to Integer
			int colorNumber = 0;
			if (userFavcolor.equalsIgnoreCase("red")) {
				colorNumber = 1;
			} else if (userFavcolor.equalsIgnoreCase("orange")) {
				colorNumber = 2;
			} else if (userFavcolor.equalsIgnoreCase("yellow")) {
				colorNumber = 3;
			} else if (userFavcolor.equalsIgnoreCase("green")) {
				colorNumber = 4;
			} else if (userFavcolor.equalsIgnoreCase("blue")) {
				colorNumber = 5;
			} else if (userFavcolor.equalsIgnoreCase("indigo")) {
				colorNumber = 6;
			} else if (userFavcolor.equalsIgnoreCase("violet")) {
				colorNumber = 7;
			} else {
				System.out.println("Clearly you cannot follow instructions. I am done with you!");
				System.exit(0);
			}
			System.out.println(" ");
//Transportation Switch
			String userTransportation = null;
			switch (colorNumber) {
			case 1:
				userTransportation = "Ford Taurus";
				break;
			case 2:
				userTransportation = "Orion Rocket Ship";
				break;
			case 3:
				userTransportation = "Bugatti Divo";
				break;
			case 4:
				userTransportation = "Lockheed SR-71 Blackbird";
				break;
			case 5:
				userTransportation = "a steamboat";
				break;
			case 6:
				userTransportation = "a stagecoach";
				break;
			case 7:
				userTransportation = "Mazda CX 9";
				break;
			}
			System.out.println(" ");
//FortuneSummary
			System.out.println("Here is a summary of your fortune:");
			System.out.println(" ");
			System.out.println(
					firstName + " " + lastName + ", you will retire in " + retirementAge + " years and you will have $"
							+ bankBalance + " in the bank when you do." + "\n" + "You will inherit a vacation home in "
							+ vacationHome + "\n" + " and you will travel there by " + userTransportation + ".");
			System.out.println();

//QuitorRestart
			System.out.println("Would you like to have your fortune told again? Yes or no.");
			replyYorN = input.nextLine();
		}

		while (replyYorN.equalsIgnoreCase("yes"));
		new Scanner(System.in);

		if (replyYorN.equalsIgnoreCase("no")) {
			System.out.println("I hope you've had a fortunate experience.");
			System.out.println("Goodbye.");
			System.exit(0);
		} else {
			System.out.println("I hope you've had a fortunate experience.");
			System.out.println("Goodbye.");
			System.exit(0);
		}
		input.close();
	}
}

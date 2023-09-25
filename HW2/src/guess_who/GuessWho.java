package guess_who;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * @author Always type your name here!
 * @version 1
 */
public class GuessWho {
	/**
	 * our main method
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		// You may ignore the three lines of code below this one:
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			// Here you'll find some examples of how to do stuff. You can leave them in your
			// program:
			// Putting text in the console:
			System.out.println("Welcome to 'Guess Who'! Let me guess your guy. Type 'yes' or 'no', followed by ENTER.");
			// Reading text from the console (click in the console and type one character,
			// press enter):
			String s = br.readLine();
			// Putting text in the console, use '+' to concatenate Strings (stick them
			// together):
			System.out.println("OK great! You typed: " + s + ". Now we can start for real!");

			////////////////// YOUR CODE - START ///////////////////////
			ArrayList<Person> personList = new ArrayList<Person>(Arrays.asList(
					new Person("Jac", HairColor.BLONDE, EyeColor.BROWN, false, Gender.MALE, SkinColor.WHITE, true,
							false, false),
					new Person("Tupp", HairColor.BLACK, EyeColor.BROWN, false, Gender.MALE, SkinColor.BLACK, false,
							false, false),
					new Person("Art", HairColor.WHITE, EyeColor.BROWN, false, Gender.MALE, SkinColor.WHITE, false,
							true, false),
					new Person("Bob", HairColor.BLACK, EyeColor.BROWN, false, Gender.MALE, SkinColor.BLACK, false,
							false, true),
					new Person("Nick", HairColor.BLONDE, EyeColor.BLUE, true, Gender.MALE, SkinColor.WHITE, false,
							false, true),
					new Person("Jake", HairColor.BROWN, EyeColor.BLUE, false, Gender.MALE, SkinColor.WHITE, true,
							false, false),
					new Person("Josh", HairColor.ORANGE, EyeColor.BROWN, false, Gender.MALE, SkinColor.WHITE, false,
							true, true),
					new Person("Sam", HairColor.BLACK, EyeColor.BROWN, false, Gender.MALE, SkinColor.BLACK, false,
							true, false),
					new Person("Chris", HairColor.ORANGE, EyeColor.BLUE, false, Gender.MALE, SkinColor.WHITE, true,
							false, false),
					new Person("Mark", HairColor.WHITE, EyeColor.BROWN, true, Gender.MALE, SkinColor.BLACK, false,
							false, true),
					new Person("Will", HairColor.BLONDE, EyeColor.BROWN, false, Gender.MALE, SkinColor.WHITE, false,
							false, true),
					new Person("Joe", HairColor.BROWN, EyeColor.BROWN, true, Gender.MALE, SkinColor.BLACK, false,
							false, false),
					new Person("Harry", HairColor.BLACK, EyeColor.BLUE, false, Gender.MALE, SkinColor.WHITE, true,
							false, true),
					new Person("Kevin", HairColor.ORANGE, EyeColor.BROWN, false, Gender.MALE, SkinColor.WHITE, false,
							false, false),
					new Person("Larry", HairColor.BROWN, EyeColor.BLUE, true, Gender.MALE, SkinColor.WHITE, false,
							true, false)));

			Boolean correctlyAnswered = false;
			while (Boolean.FALSE.equals(correctlyAnswered)) {
				System.out.println("Is your characters hair black?");
				String input = br.readLine();
				if (input.equals("yes")) {
					personList.removeIf(x -> x.hairColor != HairColor.BLACK);
					correctlyAnswered = true;
				} else if (input.equals("no")) {
					personList.removeIf(x -> x.hairColor == HairColor.BLACK);
					correctlyAnswered = true;
				}
			}
			correctlyAnswered = false;
			while (Boolean.FALSE.equals(correctlyAnswered)) {
				System.out.println("Is your characters skin color black?");
				String input = br.readLine();
				if (input.equals("yes")) {
					personList.removeIf(x -> x.skinColor != SkinColor.BLACK);
					correctlyAnswered = true;
				} else if (input.equals("no")) {
					personList.removeIf(x -> x.skinColor == SkinColor.BLACK);
					correctlyAnswered = true;
				}
			}
			correctlyAnswered = false;
			while (Boolean.FALSE.equals(correctlyAnswered)) {
				System.out.println("Is your characters eye color blue?");
				String input = br.readLine();
				if (input.equals("yes")) {
					personList.removeIf(x -> x.eyeColor != EyeColor.BLUE);
					correctlyAnswered = true;
				} else if (input.equals("no")) {
					personList.removeIf(x -> x.eyeColor == EyeColor.BLUE);
					correctlyAnswered = true;
				}
			}
			correctlyAnswered = false;
			while (Boolean.FALSE.equals(correctlyAnswered)) {
				System.out.println("Does your character wear glasses?");
				String input = br.readLine();
				if (input.equals("yes")) {
					personList.removeIf(x -> Boolean.FALSE.equals(x.glasses));
					correctlyAnswered = true;
				} else if (input.equals("no")) {
					personList.removeIf(x -> Boolean.TRUE.equals(x.glasses));
					correctlyAnswered = true;
				}
			}
			correctlyAnswered = false;
			while (Boolean.FALSE.equals(correctlyAnswered)) {
				System.out.println("Is your character bald?");
				String input = br.readLine();
				if (input.equals("yes")) {
					personList.removeIf(x -> Boolean.FALSE.equals(x.bald));
					correctlyAnswered = true;
				} else if (input.equals("no")) {
					personList.removeIf(x -> Boolean.TRUE.equals(x.bald));
					correctlyAnswered = true;
				}
			}
			correctlyAnswered = false;
			while (Boolean.FALSE.equals(correctlyAnswered)) {
				System.out.println("Does your character have a beard?");
				String input = br.readLine();
				if (input.equals("yes")) {
					personList.removeIf(x -> Boolean.FALSE.equals(x.beard));
					correctlyAnswered = true;
				} else if (input.equals("no")) {
					personList.removeIf(x -> Boolean.TRUE.equals(x.beard));
					correctlyAnswered = true;
				}
			}
			// Etc. etc.
			if (personList.size() == 1) {
				System.out.println("Your character is " + personList.get(0).name + "!");
			} else {
				System.out.println("I don't know! It's one of the following: ");
				for (Person person : personList) {
					System.out.println(person.name);
				}
			}
			/////////////////// YOUR CODE - END ////////////////////////

			// You may ignore everything below this line
		} catch (Exception e) {
			System.out.println("AII - Something went wrong: " + e.getMessage());
		}

	}
}

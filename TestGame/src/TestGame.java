import java.util.Scanner;

public class TestGame {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String intro = "Welcome to the story Select 1 or 2";
		System.out.println(intro);
		String choice = in.next();
		while (!choice.equals("1") && !choice.equals("2")) {
			System.out.println("Choose your path");
			choice = in.next();
		}
		if (choice.equals("1")) {
			System.out.print("You are dead");
			System.exit(0);
		} else {
			System.out.print("You survive..... For now! Select 1 or 2");
		}
		choice = in.next();
		while (!choice.equals("1") && !choice.equals("2")) {
			System.out.println("Choose your path");
			choice = in.next();
		}
		if (choice.equals("2")) {
			System.out.print("You are dead");
			System.exit(0);
		} else {
			System.out.print(
					"You are the Winner of this game congrats on beating the odds. Did you know that 95% of statistics are made up right on the spot. Well now you do! Do what you wish with this new info");
		}

		System.exit(0);
	}
}

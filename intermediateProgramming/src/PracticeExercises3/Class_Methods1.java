package PracticeExercises3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Class_Methods1 {
	public static void main(String[] args) {
		
		favFruit fruit = new favFruit();
		
		fruit.name = "Apple Mango";
		fruit.color = "Red-Yellow";
		fruit.taste = "Sweet and Sour";
		fruit.shape = "Oval";
		fruit.nutrientContent = "Vitamin C";
		
		fruit.myFavFruit();
		fruit.isItYourFav();
	}
}

class favFruit {
	Scanner s = new Scanner(System.in);

	String name, color, taste, shape, nutrientContent;
	
	void myFavFruit() {
		System.out.println("\n\tFavorite Fruit: " + name);
		System.out.println("\tColor: " + color);
		System.out.println("\tTaste: " + taste);
		System.out.println("\tShape: " + shape);
		System.out.println("\tNutrient Content: " + nutrientContent);
	}
	
	void isItYourFav() {
		System.out.println("\n\tDo we have the same favorites?\n\t1 - YES\n\t2 - NO");
		
		do {
			try {
				System.out.print("\tYour answer: ");
				int answer = s.nextInt();
				System.out.println("\tYay! We have the same taste in fruits!");
				break;
			}
			catch (InputMismatchException error) {
				s.nextLine();
				System.out.println("\tPlease use 1 or 2 only for your response.\n");
			}
		} while (true);
	}
}

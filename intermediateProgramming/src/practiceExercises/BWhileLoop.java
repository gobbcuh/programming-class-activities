package practiceExercises;

import java.util.concurrent.CountDownLatch;

public class BWhileLoop {

	public static void main(String[] args) 
	{
		int i = 50;
		while (i >= 10) {
			System.out.println(i);
			i = i - 10;
		}

	}

}

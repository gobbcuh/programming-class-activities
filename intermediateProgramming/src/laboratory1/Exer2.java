package laboratory1;

public class Exer2 
{
	public static void main(String[] args) 
	{
		/* Create a code that will perform the multiplication & subtraction of the 5
		   given numbers: a = 3, b = 5, c = 10, d = 12, e = 7 */
		
		int a = 3, b = 5, c = 10, d = 12, e = 7;
		
		int productNum = a * b * c * d * e;
		int differenceNum = a - b - c - d - e;
		
		System.out.println("Product of the 5 numbers = " + productNum);
		System.out.println("Difference of the 5 numbers = " + differenceNum);
	}
}

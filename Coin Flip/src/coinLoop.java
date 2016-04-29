import java.util.Scanner;
public class coinLoop {

	public static void main(String[] args) {
	System.out.println("How many times do you want to make the coin flip?");
	Scanner userInput = new Scanner(System.in);
	int counter = 0;
	int count = 0;
	int flip = userInput.nextInt(); 
	for(int i = 0; i < flip; i++);
	{
		int random = (int)(Math.random()*2) + 1;
		if (random == 1)
		{
			counter++;
			
		 if (random == 2)
		{
			count++;
			
		}
				
	}
	System.out.println(" You flipped " + counter + " heads and " + count + " tails");
	}

}
}

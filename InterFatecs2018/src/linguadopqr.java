import java.util.Scanner;

public class linguadopqr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String frase = in.nextLine();
		
		String f1 = frase.replaceAll(" PQ", "");		
		String f2 = f1.replaceAll("PQ", "");		
		String f3 = f2.replaceAll(" R ", "");		
		String f4 = f3.replaceAll("R", "");
		
		System.out.println(f4);
	}

}

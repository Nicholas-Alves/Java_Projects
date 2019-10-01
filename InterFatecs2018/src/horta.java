import java.util.Scanner;

public class horta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		int sementesCova = 0;		
		for(int i=0; i<3; i++) sementesCova += in.nextInt() / in.nextInt();		
		System.out.println(sementesCova);
	}
}
import java.util.ArrayList;
import java.util.Scanner;

public class fila {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> senhas = new ArrayList<>();
		ArrayList<String> senhasFunc = new ArrayList<>();
				
		int n = in.nextInt();
		int almocos = 0, irregulares = 0, repetidas = 0;
		
		for(int i=0; i<n; i++) senhas.add(in.next());
		
		int f = in.nextInt();
		
		for(int i=0; i<f; i++) {
			String s = in.next();
			if(!senhasFunc.contains(s)) senhasFunc.add(s);
			else repetidas++;
		}
		
		for(int i=0; i<senhasFunc.size(); i++) {
			if(senhas.contains(senhasFunc.get(i))) almocos++;
			else irregulares++;
		}
		
		System.out.println(almocos+" A");
		System.out.println(irregulares+" I");
		System.out.println(repetidas+" R");
		
	}

}

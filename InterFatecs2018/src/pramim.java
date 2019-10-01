import java.util.Scanner;

public class pramim {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String comeca = in.next();
		int notas = in.nextInt();
		int contador = notas;
		int voce = 0, amigo = 0;
		boolean vez = true; //true: voce; false: amigo		
		
		if(comeca.equals("V")) vez = true;
		else if(comeca.equals("A")) vez = false;
		
		while(contador > 0) {			
			int valor = in.nextInt();
			
			if(vez) voce += valor; 
			else amigo += valor;					
			vez = !vez;
			contador--;
		}
		
		System.out.println("VOCE: "+voce+" AMIGO: "+amigo);		
	}

}

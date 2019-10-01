import java.util.ArrayList;
import java.util.Scanner;

public class faith {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numSort = new ArrayList<>();
		ArrayList<Integer> numLino = new ArrayList<>();
		ArrayList<Integer> numIgnorados = new ArrayList<>();
		ArrayList<Integer> numSaida = new ArrayList<>();
		ArrayList<Integer> qtdeSaida = new ArrayList<>();				

		int qtde = 0;
		int n = (in.nextInt()) * 6; 
		for(int i=0; i<n; i++) numSort.add(in.nextInt());		
		for(int i=0; i<6; i++) numLino.add(in.nextInt());

		for(int i=0; i<numSort.size(); i++) {
			for(int j=0; j<numSort.size(); j++) {
				if(!numIgnorados.contains(numSort.get(i))) {
					if(numSort.get(i) == numSort.get(j)) qtde++;
					if(j+1 == numSort.size()) {
						numSaida.add(numSort.get(i));
						numIgnorados.add(numSort.get(i));
						qtdeSaida.add(qtde);
					}
				}
			}
			qtde = 0;
		}

		for(int i=0; i<numSaida.size(); i++) {
			for(int j=0; j<qtdeSaida.size(); j++) {
				if(i!=j) {
					if(qtdeSaida.get(i) == qtdeSaida.get(j)) {
						if(numSaida.get(i) < numSaida.get(j)) { // SE O NUMERO QUE ESTA NA FRENTE FOR MAIOR DO QUE O NUMERO QUE ESTA ATRAS
							int aux = numSaida.get(i);							
							numSaida.set(i, numSaida.get(j));
							numSaida.set(j, aux);
						}
					}else if(qtdeSaida.get(j) < qtdeSaida.get(i)){
						int aux = numSaida.get(i);
						int aux2 = qtdeSaida.get(i);

						numSaida.set(i, numSaida.get(j));
						qtdeSaida.set(i, qtdeSaida.get(j));

						numSaida.set(j, aux);
						qtdeSaida.set(j, aux2);
					}

				}
			}
		}

		for(int i=0; i<numLino.size(); i++) {
			if(i+1 == numLino.size()) System.out.println(numSaida.get(numLino.get(i)-1));
			else System.out.print(numSaida.get(numLino.get(i)-1)+" ");
		}
	}
}



import java.util.ArrayList;
import java.util.Scanner;


//ENTRADA: O primeiro numero respresenta a quantidade de casos de teste.
//			Os 3 numeros seguintes respresentam, respectivamente, a quantidade
//			de alunos participando, quantidade de folhas utilizadas e o aluno
//			inicial.

//SAIDA: 	Um unico numero indicando o aluno vencedor.

//EXEMPLO:
//	Entrada: 1
//			 5 1 4

//	Saida: 1
public class papel {

	public static void main(String[] args)  {
		Scanner in = new Scanner(System.in);

		int casos = in.nextInt();
		for(int cont = 0; cont < casos; cont++) {
			ArrayList<int[]> lista = new ArrayList<>();
			int qtdeAlunos = in.nextInt();
			int qtdeFolhas = in.nextInt();
			int alunoInicial = in.nextInt();
			int participantes = qtdeAlunos;
			int vencedor = 0;
			int chutes = qtdeFolhas * 2;

			for(int i=0; i<qtdeAlunos; i++) {
				int[] vetor = new int[2];
				vetor[0] = i;
				vetor[1] = 1;
				lista.add(vetor);
			}
			int i = alunoInicial;

			while(participantes > 1){
				if(lista.get(i)[1] == 1) {
					if(chutes == 0) {
						lista.get(i)[1] = 0;
						participantes--;
						chutes = qtdeFolhas * 2;
					}else {
						vencedor = lista.get(i)[0];
						chutes--;
					}
				}
				if(i==0) i = qtdeAlunos-1;
				else i--;
			}
			System.out.println(vencedor);
		}
	}
}
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class boleto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		ArrayList<String> boletos = new ArrayList<>();

		String dataPagamento, dataVencimento;
		double valoresAtrasados = 0, valoresNormais = 0;

		for(int i=0; i<5; i++) {
			boletos.add(in.nextLine());
		}				

		for(int i=0; i<boletos.size(); i++) {
			dataVencimento = boletos.get(i).substring(4, 10);
			dataPagamento = boletos.get(i).substring(22, 28);

			int diaV = Integer.parseInt(dataVencimento.substring(0, 2));
			int mesV = Integer.parseInt(dataVencimento.substring(2, 4));
			int anoV = Integer.parseInt(dataVencimento.substring(4, 6));

			int diaP = Integer.parseInt(dataPagamento.substring(0, 2));
			int mesP = Integer.parseInt(dataPagamento.substring(2, 4));
			int anoP = Integer.parseInt(dataPagamento.substring(4, 6));

			if(anoP <= anoV) { //VENCEU EM ALGUM ANO PASSADO				
				if(mesP == mesV) {
					if(diaP <= diaV) {
						valoresNormais += Double.parseDouble(boletos.get(i).substring(10, 16));
						valoresNormais += Double.parseDouble("0."+boletos.get(i).substring(16, 18));
					}else {
						valoresAtrasados += Double.parseDouble(boletos.get(i).substring(10, 16));
						valoresAtrasados += Double.parseDouble("0."+boletos.get(i).substring(16, 18));
					}
				}else if(mesP < mesV){
					valoresNormais += Double.parseDouble(boletos.get(i).substring(10, 16));
					valoresNormais += Double.parseDouble("0."+boletos.get(i).substring(16, 18));					
				}else {
					valoresAtrasados += Double.parseDouble(boletos.get(i).substring(10, 16));
					valoresAtrasados += Double.parseDouble("0."+boletos.get(i).substring(16, 18));
				}
			}else {
				valoresAtrasados += Double.parseDouble(boletos.get(i).substring(10, 16));
				valoresAtrasados += Double.parseDouble("0."+boletos.get(i).substring(16, 18));
			}
		}

		System.out.println(df.format(valoresNormais)+"-ADIMPLENTE");
		System.out.println(df.format(valoresAtrasados)+"-INADIMPLENTE");
	}
}

package Jogo_Mat;

public class Game {
	private TipoJogo tj = new TipoJogo();
	
	public TipoJogo getTj() {
		return tj;
	}

	public void setTj(TipoJogo tj) {
		this.tj = tj;
	}
	
	public String verifica(double c, double d) {
		c = TipoJogo.a;
		d = TipoJogo.b;
		
		double r = tj.numeros(c, d);
		
		if(App.re == r) {
			System.out.println();
			System.out.print("Voc� Acertou! ");
			App.upNivel = 1;
			App.nivel(App.opr);
			if(App.upNivel >= 5) {
				App.upNivel = 6;
				return "Parab�ns, voc� venceu o jogo!";
				
			}else {
				System.out.println("Pr�ximo N�vel.");
			}
			
		}else {
			System.out.println();
			System.out.println("Voc� Errou! Tente Novamente.");
			App.upNivel = 0;
			App.nivel(App.opr);
		}
		
		return "";
	}

}

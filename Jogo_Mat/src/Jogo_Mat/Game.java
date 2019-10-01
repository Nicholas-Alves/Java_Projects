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
			System.out.print("Você Acertou! ");
			App.upNivel = 1;
			App.nivel(App.opr);
			if(App.upNivel >= 5) {
				App.upNivel = 6;
				return "Parabéns, você venceu o jogo!";
				
			}else {
				System.out.println("Próximo Nível.");
			}
			
		}else {
			System.out.println();
			System.out.println("Você Errou! Tente Novamente.");
			App.upNivel = 0;
			App.nivel(App.opr);
		}
		
		return "";
	}

}

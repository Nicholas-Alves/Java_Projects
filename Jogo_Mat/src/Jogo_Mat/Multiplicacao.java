package Jogo_Mat;

public class Multiplicacao extends TipoJogo{
	@Override
	public double numeros(double a, double b) {
		double r = a * b;
		return r;
	}
	
	public static void nivel() {
		if(App.nivelMu == 1) {
			System.out.println(TipoJogo.a = r.nextInt(10));			
			System.out.println(TipoJogo.b = r.nextInt(10));
		}else if(App.nivelMu== 2) {
			System.out.println(TipoJogo.a = (r.nextInt(89)+10));
			System.out.println(TipoJogo.b = (r.nextInt(89)+10));
		}else if(App.nivelMu == 3) {
			System.out.println(TipoJogo.a = (r.nextInt(899)+100));
			System.out.println(TipoJogo.b = (r.nextInt(899)+100));
		}else if(App.nivelMu == 4) {
			System.out.println(TipoJogo.a = (r.nextInt(8999)+1000));
			System.out.println(TipoJogo.b = (r.nextInt(8999)+1000));
		}else {
			System.out.println(TipoJogo.a = (r.nextInt(89999)+10000));
			System.out.println(TipoJogo.b = (r.nextInt(89999)+10000));
		}
	}
}

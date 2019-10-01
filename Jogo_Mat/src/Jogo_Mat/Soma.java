package Jogo_Mat;

public class Soma extends TipoJogo{
	@Override
	public double numeros(double a, double b) {
		double r = a + b;
		return r;
	}
	
	public static void nivel() {
		if(App.nivelSo == 1) {
			System.out.println(TipoJogo.a = r.nextInt(10));			
			System.out.println(TipoJogo.b = r.nextInt(10));
		}else if(App.nivelSo == 2) {
			System.out.println(TipoJogo.a = (r.nextInt(89)+10));
			System.out.println(TipoJogo.b = (r.nextInt(89)+10));
		}else if(App.nivelSo == 3) {
			System.out.println(TipoJogo.a = (r.nextInt(899)+100));
			System.out.println(TipoJogo.b = (r.nextInt(899)+100));
		}else if(App.nivelSo == 4) {
			System.out.println(TipoJogo.a = (r.nextInt(8999)+1000));
			System.out.println(TipoJogo.b = (r.nextInt(8999)+1000));
		}else {
			System.out.println(TipoJogo.a = (r.nextInt(89999)+10000));
			System.out.println(TipoJogo.b = (r.nextInt(89999)+10000));
		}
	}

}


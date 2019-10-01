package Jogo_Mat;

import java.util.Random;

public class TipoJogo {
	static int nivel = 1;	
	static Random r = new Random();
	static double a = 0;
	static double b = 0;
	
	public double numeros(double a, double b) {
		return 0;
	}
	
	public static void nivel() {
		if(nivel == 1) {
			System.out.println(a = r.nextInt(10));			
			System.out.println(b = r.nextInt(10));
		}else if(nivel == 2) {
			System.out.println(a = r.nextInt(89));
			System.out.println(b = r.nextInt(89));
		}else if(nivel == 3) {
			System.out.println(a = r.nextInt(899));
			System.out.println(b = r.nextInt(899));
		}else if(nivel == 4) {
			System.out.println(a = r.nextInt(8999));
			System.out.println(b = r.nextInt(8999));
		}else {
			System.out.println(a = r.nextInt(89999));
			System.out.println(b = r.nextInt(89999));
		}
	}

}

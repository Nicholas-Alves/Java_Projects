package Jogo_Mat;
import java.util.Random;
import java.util.Scanner;

public class App {
	static Random r = new Random();
	static double a = 0;
	static double b = 0;
	static double re = 0;
	static int upNivel = 0;
	static int nivelSo = 1;
	static int nivelSu = 1;
	static int nivelMu = 1;
	static int nivelDi = 1;
	static int nivelRe = 1;
	static String opr;


	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Game g = new Game();
		int op3 = 0;


		while(true){

			System.out.println();
			System.out.println("Menu - Jogo Mat");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Resto da Divisão");
			System.out.println("6 - Sair");
			int opcao = in.nextInt();

			switch (opcao) {
			case 1:
				opr = "soma";
				op3 = 1;
				while(op3 != 3) {
					System.out.println("Soma");
					System.out.println();
					System.out.println("Seu nível de dificuldade atual é: "+(nivelSo));
					System.out.println("O que quer fazer?");
					System.out.println("1 - Novo Jogo");
					System.out.println("2 - Continuar");
					System.out.println("3 - Sair");
					op3 = in.nextInt();
					
					switch (op3) {
					case 1:
						upNivel = 0;
						nivelSo = 1;
						Soma.nivel();
						g.setTj(new Soma());
						System.out.println("Digite a soma da operação: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 2:
						Soma.nivel();
						g.setTj(new Soma());
						System.out.println("Digite a soma da operação: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 3:
						break;
					default:
						System.out.println("Opção Inválida");
						break;
					}
				}
				break;

			case 2:
				opr = "sub";
				op3 = 1;
				while(op3 != 3) {
					System.out.println("Subtração");
					System.out.println();
					System.out.println("Seu nível de dificuldade atual é: "+(nivelSu));
					System.out.println("O que quer fazer?");
					System.out.println("1 - Novo Jogo");
					System.out.println("2 - Continuar");
					System.out.println("3 - Sair");
					op3 = in.nextInt();

					switch (op3) {
					case 1:
						upNivel = 0;
						nivelSu = 1;
						Subtracao.nivel();
						g.setTj(new Subtracao());
						System.out.println("Digite a diferença da operação: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 2:
						Subtracao.nivel();
						g.setTj(new Subtracao());
						System.out.println("Digite a diferença da operação: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 3:
						break;
					default:
						System.out.println("Opção Inválida");
						break;
					}
				}
				break;

			case 3:
				opr = "mult";
				op3 = 1;
				while(op3 != 3) {
					System.out.println("Multiplicação");
					System.out.println();
					System.out.println("Seu nível de dificuldade atual é: "+(nivelMu));
					System.out.println("O que quer fazer?");
					System.out.println("1 - Novo Jogo");
					System.out.println("2 - Continuar");
					System.out.println("3 - Sair");
					op3 = in.nextInt();

					switch (op3) {
					case 1:
						upNivel = 0;
						nivelMu = 1;
						Multiplicacao.nivel();
						g.setTj(new Multiplicacao());
						System.out.println("Digite o produto da operação: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 2:
						Multiplicacao.nivel();
						g.setTj(new Multiplicacao());
						System.out.println("Digite o produto da operação: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 3:
						break;
					default:
						System.out.println("Opção Inválida");
						break;
					}
				}
				break;

			case 4:
				opr = "div";
				op3 = 1;
				while(op3 != 3) {
					System.out.println("Divisão");
					System.out.println();
					System.out.println("Seu nível de dificuldade atual é: "+(nivelDi));
					System.out.println("O que quer fazer?");
					System.out.println("1 - Novo Jogo");
					System.out.println("2 - Continuar");
					System.out.println("3 - Sair");
					op3 = in.nextInt();

					switch (op3) {
					case 1:
						upNivel = 0;
						nivelDi = 1;
						Divisao.nivel();
						g.setTj(new Divisao());
						System.out.println("Digite o quociente da operação: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 2:
						Divisao.nivel();
						g.setTj(new Divisao());
						System.out.println("Digite o quociente da operação: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 3:
						break;
					default:
						System.out.println("Opção Inválida");
						break;
					}
				}
				break;
			case 5:
				opr = "res";
				op3 = 1;
				while(op3 != 3) {
					System.out.println("Resto da Divisão");
					System.out.println();
					System.out.println("Seu nível de dificuldade atual é: "+(nivelRe));
					System.out.println("O que quer fazer?");
					System.out.println("1 - Novo Jogo");
					System.out.println("2 - Continuar");
					System.out.println("3 - Sair");
					op3 = in.nextInt();

					switch (op3) {
					case 1:
						upNivel = 0;
						nivelRe = 1;
						RestoDivisao.nivel();
						g.setTj(new RestoDivisao());
						System.out.println("Digite o resto da divisão: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 2:
						RestoDivisao.nivel();
						g.setTj(new RestoDivisao());
						System.out.println("Digite o resto da divisão: ");
						re = in.nextDouble();
						System.out.println(g.verifica(a, b));
						break;
					case 3:
						break;
					default:
						System.out.println("Opção Inválida");
						break;
					}
				}
				break;
			case 6:
				System.out.println("Saindo");
				in.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}

		}

	}
	
	
	public static void nivel(String a) {
		
		if(a.equals("soma")) {
			if(upNivel == 1) {
				nivelSo++;
			}else {
				nivelSo = 1;
			}
		}else if(a.equals("sub")) {
			if(upNivel == 1) {
				nivelSu++;
			}else {
				nivelSu = 1;
			}
		}else if(a.equals("mult")) {
			if(upNivel == 1) {
				nivelMu++;
			}else {
				nivelMu = 1;
			}
		}else if(a.equals("div")) {
			if(upNivel == 1) {
				nivelDi++;
			}else {
				nivelDi = 1;
			}
		}else {
			if(upNivel == 1) {
				nivelRe++;
			}else {
				nivelRe = 1;
			}
		}
	}

}

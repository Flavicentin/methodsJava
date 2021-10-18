import java.util.Scanner;

public class ex03_empresaRh {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String[] nome = new String[4];
		double[] salario = new double[4];
		int[] tempo = new int[4];

		for (int i = 0; i < 4; i++) {

			System.out.print("Digite o nome: ");
			nome[i] = entrada.next();

			System.out.print("Digite o tempo: ");
			tempo[i] = entrada.nextInt();

			System.out.print("Digite o salário: ");
			salario[i] = entrada.nextDouble();

		}
		// call method
		// verify = return
		String[] situacao = verifica(salario, tempo);
		// report = no return 
		relatorio(situacao, nome);
	}

	// methods
	public static String[] verifica(double[] salario, int[] tempo) {

		String[] situacao = new String[4];

		for (int i = 0; i < 4; i++) {
			if (salario[i] < 700 || tempo[i] > 3) {
				situacao[i] = "Tera aumento";
			} else {
				situacao[i] = "Não tera aumento";
			}
		}

		return situacao;
	}

	public static void relatorio(String[] nome, String[] situacao) {

		for (int i = 0; i < 4; i++) {
			System.out.println("Funcionário: " + nome[i] + " - Situação: " + situacao[i]);
		}

	}

}

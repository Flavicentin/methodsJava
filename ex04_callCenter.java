import java.util.Scanner;

public class ex04_callCenter {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		//call methods
		
		//method 1
		int matriz[][] = chamados();
		
		//method 2
		relatorioErro(matriz);
		
		//method 3
		int [] contCriterios = relatorioCriterio(matriz);
		for (int i = 0; i < 5; i++) {
			System.out.println("Critério de erro "+(i+1)+": "+contCriterios[i]);
		}
	}

	// methods
	
	// 1 - no parameter with return
	public static int[][] chamados() {

		int matriz[][] = new int[5][3];

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 3; j++) {
				
				System.out.print("Digite o ID funcionário: ");
				matriz[i][0] = entrada.nextInt();

				System.out.print("Digite o código do erro: ");
				matriz[i][1] = entrada.nextInt();

				// verification
				while (matriz[i][1] < 1 || matriz[i][1] > 3) {

					matriz[i][1] = entrada.nextInt();

				}
				
				System.out.print("Digite o critério do chamado: ");
				matriz[i][2] = entrada.nextInt();
				
				// verification
				while (matriz[i][2] < 1 || matriz[i][2] > 4) {

					matriz[i][2] = entrada.nextInt();

				}
			}
		}
		return matriz;
	}
	// 2 - with parameter no return
	public static void relatorioErro(int [][] matriz) {

		int [] erro = new int [3];
		
		for (int i = 0; i < 5; i++) {
			if (matriz[i][1] == 1) {
				
				erro[0]++;
				
			} else if (matriz[i][1] == 2) {
				
				erro[1]++;
				
			} else {
				
				erro[2]++;
			}
		}
		System.out.println("");
		System.out.println("Relatórios de erros");
		for (int i = 0; i < 3; i++) {
			System.out.println("Numeros chamados de código "+(1+i)+ ": "+erro[i]);
		}
	}
	//3 - with parameter with return
	public static int[] relatorioCriterio(int[][] matriz) {
		
		int [] contCriterios = new int [4];
		
		for (int i = 0; i < 5; i++) {
			if (matriz[i][2] == 1) {
				
				contCriterios[0]++;
				
			} else if (matriz[i][2] == 2) {
				
				contCriterios[1]++;
				
			} else if (matriz[i][2] == 3){
				
				contCriterios[2]++;
				
			} else {
				
				contCriterios[3]++;
			}
		}
		
		return contCriterios;
		
	}
}

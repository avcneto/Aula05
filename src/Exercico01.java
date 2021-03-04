import java.util.Scanner;

public class Exercico01 {

	public static void main(String[] args) {
		// Mostrar a tabuado do número informado

		int numeroInformado = 0;
		int resultado;

		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor digite o numero para que possamos mostrar a tabuada");
		numeroInformado = leitor.nextInt();

		for (int i = 0; i <= 10; i++) {

			resultado = i * numeroInformado;
			System.out.println("tabuada do " + numeroInformado + " :" + i + "x" + numeroInformado + " = " + resultado);

		}

	}

}

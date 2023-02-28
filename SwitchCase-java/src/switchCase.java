import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o dia da semana");
		int diaSemana = scanner.nextInt();

		if (diaSemana == 1) {
			System.out.println("Domingo");
		} else if (diaSemana == 2) {
			System.out.println("Segunda");
		} else if (diaSemana == 3) {
			System.out.println("terça");
		} else if (diaSemana == 4) {
			System.out.println("quarta");
		} else if (diaSemana == 5) {
			System.out.println("Quinta");
		} else if (diaSemana == 6) {
			System.out.println("Sexta");
		} else if (diaSemana == 7) {
			System.out.println("Sábado");
		} else {
			System.out.println("Não é um dia valido");
		}

		switch (diaSemana) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Dia útil");
			break;
		case 7:
			System.out.println("Fim de semana");
			break;
		default:
			System.out.println("Não é um dia da semana valido");

		}

	}

}

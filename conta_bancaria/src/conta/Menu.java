package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();

		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 3, "Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		Scanner scanner = new Scanner(System.in);
		int opcao;

		while (true) {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "********************************************************************");
			System.out.println("                                                                    ");
			System.out.println("                      BANCO DO BRAZIL COM Z                         ");
			System.out.println("                                                                    ");
			System.out.println("********************************************************************");
			System.out.println("                                                                    ");
			System.out.println("                   1 - Criar Conta                                  ");
			System.out.println("                   2 - Listar todas as Contas                       ");
			System.out.println("                   3 - Buscar Conta por Número                     ");
			System.out.println("                   4 - Apagar Conta                                 ");
			System.out.println("                   5 - Sacar                                        ");
			System.out.println("                   6 - Depositar                                    ");
			System.out.println("                   7 - Apagar Conta                                 ");
			System.out.println("                   8 - Transferir valores entre Contas              ");
			System.out.println("                   9 - Sair                                         ");
			System.out.println("                                                                    ");
			System.out.println("********************************************************************");
			System.out.println("                                                                    ");
			System.out.println("                   Entre com a opção desejada:                      ");
			System.out.println("                                                                    " + Cores.TEXT_RESET);

			opcao = scanner.nextInt();

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				scanner.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta\n\n");

				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas\n\n");

				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");

				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados da Conta\n\n");

				break;

			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");

				break;

			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");

				break;

			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");

				break;

			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");

				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida\n");
				break;
			}

		}

	}

	public static void sobre() {
		System.out.println("********************************************************************");
		System.out.println("Projeto Desenvolvido por: Vinícius Aquino");
		System.out.println("Vinícius Aquino - contato.viniaquino@outlook.com");
		System.out.println("github.com/viniaquino");
		System.out.println("********************************************************************");
	}
}


import java.util.Scanner;

import br.com.vv.datasource.PedidoDataSource;

public class Menu {
	public static void main(String[] args) {
		PedidoDataSource pds = new PedidoDataSource();
		
		
		Scanner entrada = new Scanner(System.in);
		int menu;
		do {
			System.out.println("Entre com a opção Desejada:\n" + "1 - Listar\n" + "2 - Inclusao\n" + "3 - Alteracao\n"
					+ "4 - Exclusão\n" + "5 - Sair do Programa");

			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				pds.listar();
				break;
			case 2:
				pds.incluir();
				break;
			case 3:
				pds.alterar();
				break;
			case 4:
				pds.excluir();
				break;
			case 5:
				System.out.println("Sair do Programa");
				break;
			default:
				System.out.println("Opcao invalida");
		}
		

		} while (menu != 5);
		entrada.close();

	}
}

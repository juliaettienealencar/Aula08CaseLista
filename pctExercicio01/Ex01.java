package pctExercicio01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner receba = new Scanner(System.in);
		int option;
		double preco = 0;
		int quantidade;
		
		System.out.println("MENU LANCHONETE");
		System.out.println("1 - Café (R$ 4)");
		System.out.println("2 - Suco (R$ 6)");
		System.out.println("3 - Sanduíche (R$ 10)");
		System.out.println("Escolha a opção");
		
		option = receba.nextInt();
		System.out.println("Digite a quantidade");
		quantidade = receba.nextInt();
		
		switch(option) {
		case 1:
			preco = 4 * quantidade;
			break;
		case 2:
			preco = 6 * quantidade;
			break;
		case 3:
			preco = 10 * quantidade;
			break;
			default:
				System.out.println("Opção inválida");
		}
		System.out.println("total da compra R$" + preco);
		receba.close();
		
	}

}

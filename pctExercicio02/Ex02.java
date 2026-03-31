package pctExercicio02;

import java.util.Scanner;

public class Ex02 {
	 


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.println("Menu:");
	        System.out.println("1 - Hambúrguer (R$ 15)");
	        System.out.println("2 - Pizza (R$ 20)");
	        System.out.println("3 - Refrigerante (R$ 5)");

	        
	        System.out.print("Escolha o produto (1, 2 ou 3): ");
	        int opcao = sc.nextInt();

	        System.out.print("Digite a quantidade: ");
	        int quantidade = sc.nextInt();

	        double preco = 0;
	        String produto = "";

	        
	        if (opcao == 1) {
	            preco = 15;
	            produto = "Hambúrguer";
	        } else if (opcao == 2) {
	            preco = 20;
	            produto = "Pizza";
	        } else if (opcao == 3) {
	            preco = 5;
	            produto = "Refrigerante";
	        } else {
	            System.out.println("Opção inválida!");
	            return;
	        }

	        
	        double total = preco * quantidade;
	        double totalFinal = total;

	        
	        if (quantidade > 3) {
	            double desconto = total * 0.10;
	            totalFinal = total - desconto;
	            System.out.println("Você ganhou 10% de desconto: R$ " + desconto);
	        }

	        
	        System.out.println("Produto: " + produto);
	        System.out.println("Quantidade: " + quantidade);
	        System.out.println("Total a pagar: R$ " + totalFinal);

	        sc.close();
	    }

}


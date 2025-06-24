package Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto p = new Produto();

        System.out.print("Digite o nome do produto: ");
        p.setNome(sc.nextLine());

        System.out.print("Digite o preço do produto: ");
        p.setPreco(sc.nextDouble());

        System.out.print("Digite a quantidade do produto: ");
        p.setQuantidade(sc.nextInt());

        System.out.println("\n=== Dados do Produto ===");
        System.out.println(p); // Chama toString()
        
        sc.close();
    }
}

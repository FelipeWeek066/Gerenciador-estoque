package classes;

import java.util.Scanner;
import entities.Estoque;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estoque estoque = new Estoque();
      
		System.out.print("diga o nome do produto: ");
		String name = sc.next();
		System.out.println("diga o pre�o do produto: ");
		double price = sc.nextDouble();
		System.out.println();
		estoque.addItem(name, price);
    	       
    	 
		sc.close();
	}
}

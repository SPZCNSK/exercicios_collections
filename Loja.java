package br.com.generation.exercicios_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		Scanner rp = new Scanner(System.in);

		String e1 = "Terno";
		String e2 = "Camisa";
		String e3 = "Calça";
		String e4 = "Sapato";

		int qt1 = 100;
		int qt2 = 80;
		int qt3 = 0;
		int qt4 = 98;

		ArrayList<String> roupas = new ArrayList<>();

		roupas.add(e1 + " | Quantidade em estoque: " + qt1);
		roupas.add(e2 + " | Quantidade em estoque: " + qt2);
		roupas.add(e3 + " | Quantidade em estoque: " + qt3);
		roupas.add(e4 + " | Quantidade em estoque: " + qt4);

		System.out.println("   [ FANCYLOOK ]   \n");

		for (String i : roupas) {
			System.out.println("Tipo: " + i);
		}
		
		System.out.println("\nO item '" + e3 + "' está fora de estoque!\n");
		System.out.println("Atualizando a lista...\n");

		roupas.remove(e3);

		for (String i : roupas) {
			System.out.println("Tipo: " + i);
		}

		roupas.add(e3);
		System.out.println("\nReposição do(s) item(ns) em falta: " + roupas.get(2));

		System.out.print("Peças de '" + e3 + "' entrando em estoque: ");
		qt3 = rp.nextInt();
		rp.nextLine();		

		System.out.println("Foram incluídas " + qt3 + " " + e3 + " ao estoque!");
		
		rp.close();
	}

}

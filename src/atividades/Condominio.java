package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Condominio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String[][] cond = new String[4][4];
		String nome;
		int contador_casa1 = 0, contador_casa2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o seu nome");
		nome = sc.nextLine();

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				//Aqui seta o condomínio
				if (x <= 3 && y < 1) {
					cond[x][y] = nome;
				}//Aqui seta as informações da primeira casa e primeiro carro
				else if (x == 0 && y < 2) {
					System.out.println("Informe o número da primeira casa");
					cond[x][y] = sc.nextLine();
				} else if (x == 0 && y < 3) {
					System.out.println("Informe o modelo do primeiro carro da primeira casa");
					cond[x][y] = sc.nextLine();
				} else if (x == 0 && y < 4) {
					System.out.println("Informe a placa do primeiro carro da primeira casa");
					cond[x][y] = sc.nextLine();
					contador_casa1++;
				}//Aqui seta as informações da primeira casa e segundo carro
				else if (x == 1 && y < 2) {
					System.out.println("Informe o número da primeira casa");
					cond[x][y] = sc.nextLine();
				} else if (x == 1 && y < 3) {
					System.out.println("Informe o modelo do segundo carro da primeira casa");
					cond[x][y] = sc.nextLine();
				} else if (x == 1 && y < 4) {
					System.out.println("Informe a placa do segundo carro da primeira casa");
					cond[x][y] = sc.nextLine();
					contador_casa1++;
				}//Aqui seta as informações da segunda casa e primeiro carro
				 else if (x == 2 && y < 2) {
					System.out.println("Informe o número da segunda casa");
					cond[x][y] = sc.nextLine();
				} else if (x == 2 && y < 3) {
					System.out.println("Informe o modelo do primeiro carro da segunda casa");
					cond[x][y] = sc.nextLine();
				} else if (x == 2 && y < 4) {
					System.out.println("Informe a placa do primeiro carro da segunda casa");
					cond[x][y] = sc.nextLine();
					contador_casa2++;
				}////Aqui seta as informações da segunda casa e segundo carro
				else if (x == 3 && y < 2) {
					System.out.println("Informe o número da segunda casa");
					cond[x][y] = sc.nextLine();
				} else if (x == 3 && y < 3) {
					System.out.println("Informe o modelo do segundo carro da segunda casa");
					cond[x][y] = sc.nextLine();
				} else if (x == 3 && y < 4) {
					System.out.println("Informe a placa do segundo carro da segunda casa");
					cond[x][y] = sc.nextLine();
					contador_casa2++;
				}
			}
		}

		System.out.println("Nome do condomínio: " + cond[0][0]);
		System.out.println();
		for (int x = 0; x < 4; x++) {	
			if(x == 0) {
				System.out.println("Número da primeira casa: " + cond[x][1]);
				System.out.println();
			}else if (x == 2) {
				System.out.println("Número da segunda casa: " + cond[x][1]);
				System.out.println();
			}
				
			
			if(x == 0) {				
				System.out.println("Modelo do primeiro carro da primeira casa: " + cond[x][2]);
				System.out.println("Placa do primeiro carro da primeira casa: " + cond[x][3]);
				System.out.println();
			}else if(x == 1) {
				System.out.println("Modelo do segundo carro da primeira casa: " + cond[x][2]);
				System.out.println("Placa do segundo carro da primeira casa: " + cond[x][3]);
				System.out.println();
			}else if(x == 2) {
				System.out.println("Modelo do primeiro carro da segunda casa: " + cond[x][2]);
				System.out.println("Placa do primeiro carro da segunda casa: " + cond[x][3]);
				System.out.println();
			}else if(x == 3) {
				System.out.println("Modelo do segundo carro da segunda casa: " + cond[x][2]);
				System.out.println("Placa do segundo carro da segunda casa: " + cond[x][3]);
				System.out.println();
			}
			
		}
		System.out.println("Quantidade de carros na casa 1:  " + contador_casa1);
		System.out.println("Quantidade de carros na casa 2:  " + contador_casa2);
		
		/*System.out.println();
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				System.out.printf("%s ", cond[x][y]);
			}
			System.out.println();
		}
		*/
		sc.close();
	}
}

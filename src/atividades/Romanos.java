package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Romanos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, ano, diaN, mesN, anoN, idade, idade_calc, index = 0;
		String[] romano = new String[20];
		String nome;
		
		System.out.println("Digite o seu nome completo: ");
		nome = sc.nextLine();
		
		System.out.println("Informe o dia atual formato dd: ");
		dia = sc.nextInt();
		while(dia > 31 || dia < 0) {
			System.out.println("Informe um dia válido! formato dd: ");
			dia = sc.nextInt();
		}
		
		System.out.println("Informe o número do mês atual: formato mm: ");
		mes = sc.nextInt();
		while(mes > 12 || mes < 0) {
			System.out.println("Informe um mês válido! formato mm:");
			mes = sc.nextInt();
		}
		
		System.out.println("Informe o ano atual: formato aaaa: ");
		ano = sc.nextInt();
		while(ano < 1800) {
			System.out.println("Ano inferior a 1800 é inválido! Informe um ano válido! "
					+ "formato aaaa: ");
			ano = sc.nextInt();
		}
		
		System.out.println("Informe o dia do seu aniversário formato dd:");
		diaN = sc.nextInt();
		while(diaN > 31 || diaN < 0) {
			System.out.println("Informe um dia válido! formato dd:");
			diaN = sc.nextInt();
		}
		
		System.out.println("Informe o número do mês do seu aniversário formato mm:");
		mesN = sc.nextInt();
		while(mesN > 12 || mesN < 0) {
			System.out.println("Informe um mês válido! formato mm:");
			mesN = sc.nextInt();
		}
		
		System.out.println("Informe o ano do seu aniversário formato aaaa: ");
		anoN = sc.nextInt();
		while(anoN < 1800 || anoN >= ano) {
			System.out.println("Ano inferior a 1800, superior ou igual ao ano atual"
					+ " é inválido, insira um válido ! formato aaaa: ");
			anoN = sc.nextInt();
		}
		
		idade = ano - anoN;
		
		if( mes < mesN || mes == mesN && dia < diaN)
			idade -= 1;
		
		idade_calc = idade;
		while (idade_calc > 0) {
			if(idade_calc - 100 >= 0) {
				romano[index] = "C";
				idade_calc -= 100;
				index++;
			}else if(idade_calc - 90 >= 0) {
				romano[index] = "XC";
				idade_calc -= 90;
				index++;
			}else if(idade_calc - 50 >= 0) {
				romano[index] = "L";
				idade_calc -= 50;
				index++;
			}else if(idade_calc - 40 >= 0) {
				romano[index] = "XL";
				idade_calc -= 40;
				index++;
			}else if(idade_calc - 10 >= 0) {
				romano[index] = "X";
				idade_calc -= 10;
				index++;
			}else if(idade_calc - 9 >= 0) {
				romano[index] = "IX";
				idade_calc -= 9;
				index++;
			}else if(idade_calc - 5 >= 0) {
				romano[index] = "V";
				idade_calc -= 5;
				index++;
			}else if(idade_calc - 4 >= 0) {
				romano[index] = "IV";
				idade_calc -= 4;
				index++;
			}else if(idade_calc - 1 >= 0) {
				romano[index] = "I";
				idade_calc -= 1;
				index++;
			}
		}
		
		System.out.println("Aluno: " + nome);
		
		for(int i = 0; i < index; i++)
			System.out.printf("%s", romano[i]);
		System.out.printf(" Anos");
		sc.close();
	}
}

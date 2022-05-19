package net.codejava;

import java.util.Scanner;

public class Es_Abbonamenti_5 {

	public static void main(String[] args) {
	System.out.println("Di che tipo di abbonamento scegli (S= Settimanale, M= Mensile o A= Annuale)?:");
	char tipo= ' ';
	Scanner read= new Scanner(System.in);
	tipo= read.next().charAt(0);
	System.out.println("Di che zona hai fatto l'abbonamneto (1= Centrale, 2= Periferica o 3= Entrambi)?:");
	int zona= 0;
	zona= read.nextInt();
	double costo= 0;
	if(tipo=='S' && zona==1) {
		costo= 10;
	}
	else if(tipo=='S' && zona==2) {
		costo= 30;
	}
	else if(tipo=='S' && zona==3) {
		costo= 250;
	}
	else if(tipo=='M' && zona==1) {
		costo= 5;
	}
	else if(tipo=='M' && zona==2) {
		costo= 20;
	}
	else if(tipo=='M' && zona==3) {
		costo= 150;
	}
	else if(tipo=='A' && zona==1) {
		costo= 15;
	}
	else if(tipo=='A' && zona==2) {
		costo= 40;
	}
	else if(tipo=='A' && zona==3) {
		costo= 300;
	}
	System.out.println("Viaggi sulle ore di punta (S= Si o N= No)?:");
	char scelta= ' ';
	scelta= read.next().charAt(0);
	if(scelta=='N') {
		costo = 80.0 / 100.0 * costo;
		System.out.println("lo sconto del tuo abbonamento e' di: " + costo);
	}
	else {
		System.out.println("Il costo del tuo abbonamento e' di: " + costo);
	}
	}

}

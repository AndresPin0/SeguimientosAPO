package main;

import java.util.Scanner;

import model.Clasificaciones;

public class Main {
		
	private Scanner must;
	private Clasificaciones clasificaciones;

	public Main() {
		must =  new Scanner(System.in);
		clasificaciones = new Clasificaciones();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
	
	public void start() {
		
		System.out.println("Ingrese la cantidad de paises que registrara");
		int cantidad = must.nextInt();
		
		for(int i = 0; i < cantidad; i++) {
			
			fillList();
		}
		
		printList();
		clasificaciones.sotCount();
		printList1();
		printList2();
		
		
		
	}
	
	public void fillList() {
		
		String datos = must.next();
		String [] datosArreglos = datos.split(";");
		clasificaciones.addPais(datosArreglos[0], Integer.parseInt(datosArreglos[1]),Integer.parseInt(datosArreglos[2]),
				Integer.parseInt(datosArreglos[3]), Integer.parseInt(datosArreglos[4]),Integer.parseInt(datosArreglos[5]), Integer.parseInt(datosArreglos[6]));

	}
	
	public void printList() {
		
		System.out.println(clasificaciones.getList());
		
	}
	public void printList1() {
		
		System.out.println(clasificaciones.getList1());
		
	}
	public void printList2() {
		
		System.out.println(clasificaciones.getList2());
		
	}
}

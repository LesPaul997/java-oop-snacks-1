package org.snacks.java;

public class Main {

	public static void main(String[] args) {
		
		//Istanza classe Studente
		Studente studente = new Studente ("Pippo", "Alighieri", 52);
		System.out.println(studente.getAllInfo() + "\n");
		
		//Istanza classe ContoBancario
		ContoBancario conto001 = new ContoBancario(001);
		System.out.println ("Il saldo del conto " + conto001.getNumber() + " " + "è di: " + conto001.getBalance() + "€" + "\n");
		conto001.deposit(50);
		conto001.withdrawal(20);
		System.out.println ("Saldo residuo del conto " + conto001.getNumber() + " " + "è di: " + conto001.getBalance() + "€" + "\n");
		

	}

}

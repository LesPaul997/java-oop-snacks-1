package org.snacks.java;

public class Main {

	public static void main(String[] args) {
		
		//Istanza classe Studente
		Studente studente1 = new Studente("Michele", "Michelino", 50);
		System.out.println(studente1.getStudentInfo() + "\n");
		Studente studente2 = new Studente("Arcangelo", "Gabriele", 28);
		System.out.println(studente2.getStudentInfo() + "\n");
		
		//Istanza classe ContoBancario
		ContoBancario conto001 = new ContoBancario(001);
		System.out.println ("Il saldo iniziale del conto " + conto001.getNumber() + " " + "è di: " + conto001.getBalance() + "€" + "\n");
		conto001.deposit(50);
		conto001.withdrawal(20);
		System.out.println ("Saldo residuo del conto " + conto001.getNumber() + " " + "è di: " + conto001.getBalance() + "€" + "\n");
		
		//Istanza classe RegistroStudenti
		RegistroStudenti registro = new RegistroStudenti();
		registro.addStudent (studente1);
		registro.addStudent (studente2);
		registro.getStudents();
	}

}

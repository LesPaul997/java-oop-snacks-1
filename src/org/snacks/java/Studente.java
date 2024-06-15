package org.snacks.java;

class Studente {

		private String firstName;
		private String lastName;
		private int age;
	
		Studente(String firstName, String lastName, int age) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		
		}
	
		String getAllInfo() {
			return this.firstName + " " + this.lastName + "," + this.age + "anni";
		}
	
		public static void main(String[] args) {
			Studente studente = new Studente ("Pippo", "Alighieri", 52);
			System.out.println(studente.getAllInfo());
		}
		
	}



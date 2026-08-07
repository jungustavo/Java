package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double notaFinal() {
		double nota = nota1 + nota2 + nota3;
		return nota;
	}

	public static void passOrNot(double nota) {
		if (nota >= 60){
			System.out.println("FINAL GRADE = "+nota);
			System.out.println("PASS");
		}else {
			System.out.println("FINAL GRADE = "+nota);
			System.out.println("FAILED");
			System.out.println("MISSING "+ (60-nota )+ " POINTS");
		}
		
		
		
	}
	
}



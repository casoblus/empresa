// importo tecladito
import java.util.Scanner;

public class Empr
{
	String nome;
	int idade,
	    salario,
	    n_emp;

	public void ALTA_E()
	{
		Scanner sc = new Scanner( System.in );

		System.out.println();
		System.out.println( "Novo Empregado" );
		System.out.println( "--------------" );
		System.out.println( "Nome: " );
			nome = sc.nextLine(); 
		System.out.println( "Idade: " );
			idade = sc.nextInt(); 
		System.out.println( "Salario: " );
			salario = sc.nextInt(); 
		System.out.println( "Numero de empleado: " );
			n_emp = sc.nextInt(); 
		System.out.println();
	}
}

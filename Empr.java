// importo tecladito
import java.util.Scanner;

public class Empr
{
	String nome;
	int idade,
	    salario,
	    Numde;

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
		
		System.out.println( "Numero de departamento: " );
		Numde = sc.nextInt(); 
		
		System.out.println();
	}

	public void VER_E()
	{
		System.out.println();
		
		System.out.print( "Nome: " + nome );
		
		System.out.print( "Idade: " + idade );
		
		System.out.print( "Salario: " + salario );
		
		System.out.print( "Numero de departamento: " + Numde );
		
		System.out.println();
	}

	public void SET_DEP( int depart )
	{
		Numde = depart;
	}
}

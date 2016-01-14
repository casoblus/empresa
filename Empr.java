// importo tecladito
import java.util.Scanner;

public class Empr
{
	String nome;
	int idade,
	    salario,
	    Numde;

	public void ALTA_E( Empr[] empreg ) // recibe un array vacío
	{
		Scanner sc = new Scanner( System.in );
		
		for( int i = 0; i < empreg.length; i++ )
		{
				  System.out.println();
				  System.out.println( "Novo Empregado" );
				  System.out.println( "--------------" );
				  
				  System.out.println( "Nome: " );
				  empreg[i].nome = sc.nextLine(); 
				  
				  System.out.println( "Idade: " );
				  empreg[i].idade = sc.nextInt(); 
				  
				  System.out.println( "Salario: " );
				  empreg[i].salario = sc.nextInt(); 
				  
				  System.out.println( "Numero de departamento: " );
				  empreg[i].Numde = sc.nextInt(); 
				  
				  System.out.println();
		}
	}

	public void VER_E( Empr empreg ) // recibe un objeto
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

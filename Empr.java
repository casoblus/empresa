// importo tecladito
import java.util.Scanner;

public class Empr
{
	String nome;
	int idade,
	    salario,
	    Numde; 
	    
	static int emp_seg = 0;

	public void ALTA_E( Empr[] empreg ) // recibe un array vacío
	{
		Scanner sc = new Scanner( System.in );
		empreg[emp_seg] = new Empr();
		
		System.out.println();
		System.out.println( "Novo Empregado" );
		System.out.println( "--------------" );
		
		System.out.println( "Nome: " );
		empreg[emp_seg].nome = sc.nextLine();
		
		System.out.println( "Idade: " );
		empreg[emp_seg].idade = sc.nextInt(); 
		  
		System.out.println( "Salario: " );
		empreg[emp_seg].salario = sc.nextInt(); 
		  
		System.out.println( "Numero de departamento: " );
		empreg[emp_seg].Numde = sc.nextInt(); 
		  
		System.out.println();
		emp_seg++;
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

	/**
	 * Visualiza los datos de todos los empleados
	 **/
	public static void VER_TODOS( Empr[] empreg ) 
	{
		for( int i = 0; i < emp_seg; i++ )
		{
			System.out.println();
			
			System.out.println( "empreg"+i );
			System.out.println( empreg[i].nome );
			System.out.println( empreg[i].idade );
			System.out.println( empreg[i].salario );
			System.out.println( empreg[i].Numde );
		
			System.out.println();
		}
	}

	/**
	 * Busca un empleado por nombre y
	 * devuelve el objeto si lo encuentra
	 * si no, devuelve null.
	 **/

	public static Empr BUSCA_EMP( Empr[] empreg, String _nome )
	{
		for( int i = 0; i < emp_seg; i++ )
		{
			if( empreg[i].nome.equalsIgnoreCase( _nome ) )
			{
				return empreg[i];
			}
		}
		return null;
	}
	public void SET_DEP( int depart )
	{
		Numde = depart;
	}
}

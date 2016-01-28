// importo tecladito
import java.util.Scanner;
import java.util.ArrayList;

public class Empr
{
	String nome;
	int idade,
	    salario,
	    Numde; 
	    
	static int emp_seg = 0;

	public static void ALTA_E( ArrayList<Empr> empreg ) // recibe un array vacío
	{
		Scanner sc = new Scanner( System.in );
		Empr pepis = new Empr();
		
		
		System.out.println();
		System.out.println( "Novo Empregado" );
		System.out.println( "--------------" );
		
		System.out.println( "Nome: " );
		pepis.nome = sc.nextLine();
		
		System.out.println( "Idade: " );
		pepis.idade = sc.nextInt(); 
		  
		System.out.println( "Salario: " );
		pepis.salario = sc.nextInt(); 
		  
		System.out.println( "Numero de departamento: " );
		pepis.Numde = sc.nextInt(); 
		  
		System.out.println();
		empreg.add( pepis );
	
		//emp_seg++;
	}

	public static void VER_E( Empr empreg ) // recibe un objeto
	{
		System.out.println();
		System.out.print( "Nome: " + empreg.nome );
		System.out.print( "Idade: " + empreg.idade );
		System.out.print( "Salario: " + empreg.salario );
		System.out.print( "Numero de departamento: " + empreg.Numde );
		System.out.println();
	}
	/**
	 * Si le pasamos un empleado junto con el array de departamentos
	 * muestra los datos del empleado junto con los de su departamento
	 **/
	public static boolean VER_E( Empr empreg, Depart[] depart) // recibe un objeto
	{
		/*
		 * Busca el departamento
		 */
		for( int i = 0; i < Depart.seg_dep; i++ )
		{
			if( depart[i].Numde == empreg.Numde )
			{
				System.out.println();
				System.out.print( "Nome: " + empreg.nome );
				System.out.print( "Idade: " + empreg.idade );
				System.out.print( "Salario: " + empreg.salario );
				System.out.print( "Numero de departamento: " + empreg.Numde );
				System.out.print( "Nome do departamnento: " + depart[i].nome );
				System.out.print( "Presuposto do departamnento: " + depart[i].Presu );
				System.out.print( "Empregados no departamnento: " + depart[i].N_emp );
				System.out.println();
				return true;
			}
		}
		return false;
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
	/**
	 * Devuelve el numero de empleados dados de alta
	 **/
	public static int GET_SEG()
	{
		return emp_seg;
	}
	public void SET_DEP( Empr empreg, int depar )
	{
		empreg.Numde = depar;
	}
}

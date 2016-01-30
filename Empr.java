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



	public static void VER_E( Empr empregado ) // Recibe un Objeto Empr
	{	
		System.out.println();
		System.out.println( "Nome: " + empregado.nome );
		System.out.println( "Idade: " + empregado.idade );
		System.out.println( "Salario: " + empregado.salario );
		System.out.println( "Numero de departamento: " + empregado.Numde );
		System.out.println();
	}




	/**
	 * Si le pasamos un empleado junto con el array de departamentos
	 * muestra los datos del empleado junto con los de su departamento
	 **/
	public static boolean VER_E( ArrayList<Empr> empreg, int n,  ArrayList<Depart> depart ) // recibe un objeto
	{
		// Extrae el objeto n del ArrayList
		
		Depart departamento;
		Empr empregado = empreg.get(n);

		/*
		 * Busca el departamento
		 */

		for( int i = 0; i < depart.size() ; i++ )
		{
			// Comprobar cada elemento del Arraylist de departamentos
			
			departamento = depart.get(i);

			if( departamento.Numde == empregado.Numde )
			{
				System.out.println();
				System.out.print( "Nome: " + empregado.nome );
				System.out.print( "Idade: " + empregado.idade );
				System.out.print( "Salario: " + empregado.salario );
				System.out.print( "Numero de departamento: " + empregado.Numde );
				System.out.print( "Nome do departamnento: " + departamento.nome );
				System.out.print( "Presuposto do departamnento: " + departamento.Presu );
				System.out.print( "Empregados no departamnento: " + departamento.N_emp );
				System.out.println();
				return true; // Esto puede valer para gestionar alguna cosa en el main en caso de que encuentre o no...
			}
		}
		return false;
	}




	/**
	 * Visualiza los datos de todos los empleados
	 **/
	public static void VER_TODOS( ArrayList<Empr> empregado ) 
	{
		int size = empregado.size();
		Empr emp;
		for( int i = 0; i < size; i++ )
		{
			emp = empregado.get(i);
			System.out.println();
			
			System.out.println( "empregado: "+i );
			System.out.println( emp.nome );
			System.out.println( emp.idade );
			System.out.println( emp.salario );
			System.out.println( emp.Numde );
		
			System.out.println();
		}
	}

	/**
	 * Busca un empleado por nombre y
	 * devuelve el objeto si lo encuentra
	 * si no, devuelve null.
	 **/

	public static Empr BUSCA_EMP( ArrayList<Empr> empreg, String _nome )
	{
		int size = empreg.size();
		Empr empregado;

		for( int i = 0; i < size; i++ )
		{
			empregado = empreg.get(i);

			if( empregado.nome.equalsIgnoreCase( _nome ) )
			{
				return empregado;
			}
		}

		return null;
	}


	/**
	 * Devuelve el numero de empleados dados de alta
	 **/
	/*
	 * ESTE ES EL SIZE()
	 *  
	 * public static int GET_SEG()
	{
		return emp_seg;
	}
	*/
	public void SET_DEP( Empr empreg, int depar )
	{
		empreg.Numde = depar;
	}
}

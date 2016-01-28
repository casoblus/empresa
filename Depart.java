import java.util.Scanner;
import java.util.ArrayList;

class Depart {
	String nome;
	int Numde,
	    Presu,
	    N_emp;
	static int Tot_emp;
	
	// Departamento siguente.
	// Establece cuantos objetos inicializados hay en el array
	static int seg_dep = 0; 

	public static void ALTA_D( Depart[] departamento )
	{
		Scanner sc = new Scanner( System.in );
		departamento[seg_dep] = new Depart();
		System.out.println();
		System.out.println( "Novo departamento:" );
		System.out.println( "------------------" );
		System.out.println( "Nome: " );
			departamento[seg_dep].nome = sc.nextLine(); 
		System.out.println( "Numero de departamento: " );
			departamento[seg_dep].Numde = sc.nextInt(); 
		System.out.println( "Presuposto: " );
			departamento[seg_dep].Presu = sc.nextInt(); 
		System.out.println( "Numero de empregados: " );
			departamento[seg_dep].N_emp = sc.nextInt(); 
		System.out.println();
		seg_dep++;
	}

	public static void VER_D( Depart departamento )
	{
		System.out.println();
		System.out.println( departamento.nome );
		System.out.println( departamento.Presu );
		System.out.println( departamento.N_emp );
		System.out.println( departamento.Numde );
		System.out.println();
	}

	public void MODIF_NEMP()
	{
		Scanner sc = new Scanner( System.in );

		System.out.println();
		N_emp = sc.nextInt();
	}

/*	public static int GET_SEG()
	{
		return dep_seg;
	}
	*/
}

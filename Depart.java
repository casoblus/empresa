import java.util.Scanner;

class Depart {
	String nome;
	int Numde,
	    Presu,
	    N_emp;
	static int Tot_emp;

	public void ALTA_D()
	{
		Scanner sc = new Scanner( System.in );

		System.out.println();
		System.out.println( "Novo departamento:" );
		System.out.println( "------------------" );
		System.out.println( "Nome: " );
			nome = sc.nextLine(); 
		System.out.println( "Numero de departamento: " );
			Numde = sc.nextInt(); 
		System.out.println( "Presuposto: " );
			Presu = sc.nextInt(); 
		System.out.println( "Numero de empregados: " );
			Num_emp = sc.nextInt(); 
		System.out.println();
	}

	public void VER_D()
	{
		System.out.println();
		System.out.println( nome );
		System.out.println( Presu );
		System.out.println( N_emp );
		System.out.println( Numde );
		System.out.println();
	}

}

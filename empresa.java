import java.util.Scanner;
class Empresa
{
	public static void main( String[] args )
	{
		/*
		// Crea objeto de clase Departegado
		Empr empregado = new Empr();
		// Crea objeto de clase Departamento
		Depart departamento = new Depart();


		// ALTAS
		empregado.ALTA_E();
		departamento.ALTA_D();

		
		// MOSTRAR DATOS
		empregado.VER_E();
		departamento.VER_D();
		//*/
		

		/**
		 * Crea arrays
		 **/

		Empr[] empregado = new Empr[10];
		Depart[] departamento = new Depart[10];
		Scanner sc = new Scanner( System.in );
		int option, n;

		/**
		 * menu
		 **/
		do {
			System.out.println( "" );
			System.out.println( "[1]. Alta empleado." ); 
			System.out.println( "[2]. Ver empleado." );
			System.out.println( "[3]. Ver empleado (Método sobrecargado-NO FUNCIONA-)" );
			System.out.println( "[4]. Ver todos." );
			System.out.println( "[5]. Buscar empleado por nombre." );
			System.out.println( "[6]. Establecer departamento" );
			System.out.println( "[0]. Salir!" );
			System.out.println( "" );
			System.out.println( "" );

			option = sc.nextInt();

			switch( option )
			{
				case 0:
					break;
				case 1:
					Empr.ALTA_E( empregado );
					break;
				case 2:
					//hay que pasarle el objeto del que queremos ver los datos
					//asi que habra que preguntar antes.
					
					System.out.println("Numero del empleado?");
					n = sc.nextInt();
					
					// Hay que comprobar que exista empregado[n]
					// Pero, no se :) Aun asi, compruebo que 
					// al menos n este en el rango del array
					
					if( n >= 0 && n < empregado.legnth )
					{
					
							  Empr.VER_E( empregado[n] );

					} else {

						System.out.print("Fuera de rango");
					
					}
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					System.out.println( "Opcion incorrecta." );
					break;
			}
		} while( option != 0 );

	}
}

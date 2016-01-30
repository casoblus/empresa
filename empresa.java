import java.util.Scanner;
import java.util.ArrayList;

class Empresa
{
	public static void main( String[] args )
	{

		/**
		 * Crea arrays 
		 **/

		ArrayList<Empr> empregado = new ArrayList<Empr>();
		ArrayList<Depart> departamento = new ArrayList<Depart>();
		Scanner sc = new Scanner( System.in );
		int option, n;
		String nom;
	
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
			System.out.println( "[7]. Alta departamento." );
			System.out.println( "[0]. Salir!" );
			System.out.println( "" );
			System.out.println( "" );

			option = sc.nextInt();

			switch( option )
			{
				case 0:
					break;
				
				case 1:
					Empr.ALTA_E( empregado ) ;
					break;
				
				
				case 2:
					
					//hay que pasarle el objeto del que queremos ver los datos
					//asi que habra que preguntar antes.
					
					System.out.println("Numero del empleado?");
					n = sc.nextInt();
					nom = sc.nextLine();

					// Se comprueba que el ArrayList NO está vacío
					if( !empregado.isEmpty() && n < empregado.size() )
					{
					
						 Empr.VER_E( empregado.get(n) );

					} else {

						System.out.print("No existen elementos.");
					
					}
					break;
		
				
				case 3:

					/**
					 * METODO SOBRECARGADO EMPLEA EMPREGADO Y DEPARTAMENTO MOSTRANDO DATOS DE AMBOS.
					 **/

					// Pido los datos de la consulta:
					System.out.print( "Posicion del empleado en el array: " );
					n = sc.nextInt();

					// Compruebo que n exista en el rango del array de empleados
					if( !empregado.isEmpty() && n < empregado.size() )
					{

						Empr.VER_E( empregado, n, departamento );

					} else {

						System.out.println( "No existen elementos." );

					}
					break;
				
				
				case 4:

					Empr.VER_TODOS( empregado );
					break;

						
				case 5:

					// Buscar empleado por nombre
					System.out.println( "Nombre del empleado:" );
					nom = sc.nextLine(); // Recoge el salto de linea que hay en el buffer
					nom = sc.nextLine();
					Empr e; // posición del empleado
					e = Empr.BUSCA_EMP( empregado, nom );
					Empr.VER_E( e );
					break;
		
					
		/*		case 6:
					// Set departamento. 
					// Le pasamos el objeto empleado y el departamento
					System.out.println();
					System.out.println( "Empleado?" );
					nom = sc.nextLine();
					nom = sc.nextLine();
					Empr e = Empr.BUSCA_EMP( empregado, nom );
					if( e != null ) // e != null
					{
						System.out.println( "Departamento?" );
						Depart d = sc.nextLine();
						if( d != null ) // d != null 
						{
							Empr.SET_DEP( e, d );
						}
					}
					System.out.println();
					break;
				
				
				case 7:
					// ALTA DEPARTAMENTO
					Depart.ALTA_D( departamento );
					break;
					*/
				default:
					System.out.println( "Opcion incorrecta." );
					break;
			}
		} while( option != 0 );

	}
}

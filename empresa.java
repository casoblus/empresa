//
class Empresa
{
	public static void main( String[] args )
	{
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
	}
}

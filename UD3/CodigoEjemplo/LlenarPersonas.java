import java.util.ArrayList;

public class LlenarPersonas {
	public static void main(String[] args) {
		int n = 9;
		String nombres[] = { "Ana", "Luis Miguel", "Alicia", "Pedro", "Manuel", "Andrés", "Julio", "Antonio",
				"María Jesús" };

		int edades[] = { 14, 15, 13, 15, 16, 12, 16, 14, 13 };

		ArrayList<Persona> lista = new ArrayList<Persona>();

		// llenar lista
		for (int i = 0; i < n; i++)
			lista.add(new Persona(nombres[i], edades[i]));

		// mostrar lista
		for (int i = 0; i < lista.size(); i++)
			System.out.println(lista.get(i).getNombre() + "*" + lista.get(i).getEdad());
	}
}// main
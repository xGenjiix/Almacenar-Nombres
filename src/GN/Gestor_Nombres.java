package GN;

import javax.swing.JOptionPane;

public class Gestor_Nombres {

	String[] Nombre = new String[100]; // tamaño de 100 por el ejercicio.
	int UL_Post;

	public Gestor_Nombres() {
		UL_Post = 0;
	}

	public void IntroducirNombre(String NuevoNombre) { // Introducir nuevo
														// nombre

		if (NuevoNombre.length() <= 20 && NuevoNombre.length() >= 1) {
			Nombre[UL_Post] = NuevoNombre;
			UL_Post++;
		} else {
			JOptionPane.showMessageDialog(null, "Tamaño insuficiente");

		}
	}

	public String GetNombre() { // Devolver nombres almacenados
		String cadena = "";
		for (int i = 0; i < UL_Post; i++) {
			cadena += Nombre[i] + "\n";
		}
		return (cadena);
	}

	public void EliminarNombre(String EliminaNombre) { // Eliminar nombres
														// almacenados
		String aux = "", aux1 = "", delNam = "";
		int aux3 = 0;
		aux = EliminaNombre;

		for (int i = 0; i < UL_Post; i++) {
			aux1 += Nombre[i] + "\n";
			{
				if (aux1.equals(aux))
					aux3 = Integer.parseInt(aux);
				Nombre[aux3] = delNam;
			}
		}
	}
}
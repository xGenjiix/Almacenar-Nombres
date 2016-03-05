package GN;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class M_GestorNombres {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String ruta, contenido, nombre, opt, salir, ElminaNombre;

		Gestor_Fichero NF = new Gestor_Fichero();
		ruta = JOptionPane.showInputDialog(null, "Dime ruta para crear fichero.");
		Gestor_Nombres NN = new Gestor_Nombres();

		do {
			Object opcion = JOptionPane.showInputDialog(null, "Selecciona opci�n", "Menu", JOptionPane.QUESTION_MESSAGE,
					null, new Object[] { "Seleccione", "A�adir Nombre", "Leer Nombres", "Eliminar Nombre" },
					"Seleccione");
			opt = (String) opcion;
			switch (opt) {
			case "A�adir Nombre":
				nombre = JOptionPane.showInputDialog(null, "Dime usuario que deseas almacenar.");
				NN.IntroducirNombre(nombre);
				break;
			case "Leer Nombres":
				contenido = NN.GetNombre();
				NF.CrearFichero(ruta, contenido);
				JOptionPane.showMessageDialog(null, NF.muestraContenido(ruta));
				break;
			case "Eliminar Nombre":
				nombre = JOptionPane.showInputDialog(null, "Dime usuario que deseas eliminar.");
				NN.EliminarNombre(nombre);
				break;
			}
			Object opcion2 = JOptionPane.showInputDialog(null, "Desea Hacer Algo m�s?", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Seleccione", "Si", "No" }, "Seleccione");
			salir = (String) opcion2;
		} while (salir != "No");

	}

}

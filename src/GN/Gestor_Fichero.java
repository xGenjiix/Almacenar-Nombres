package GN;

import java.io.*;

import javax.swing.JOptionPane;

public class Gestor_Fichero {

	BufferedWriter bw_1;
	FileReader fr;

	public void CrearFichero(String ruta, String contenido) throws IOException {// crear
																				// fichero
		File archivo = new File(ruta);

		if (archivo.exists()) {
			JOptionPane.showMessageDialog(null, "El fichero  " + archivo + " existe");
			bw_1 = new BufferedWriter(new FileWriter(archivo));
			bw_1.write(contenido);
			bw_1.close();
		} else {
			JOptionPane.showMessageDialog(null, "El fichero  " + archivo + " NO existe");
			bw_1 = new BufferedWriter(new FileWriter(archivo));
			bw_1.write(contenido);
			bw_1.close();
		}
	}

	public static String muestraContenido(String ruta) throws FileNotFoundException, IOException {// leer
																									// de
																									// fichero
		String aux;
		String cadena = "";
		FileReader f = new FileReader(ruta);
		BufferedReader br = new BufferedReader(f);
		while ((aux = br.readLine()) != null) {
			cadena += aux + "\n";
		}
		br.close();
		return (cadena);
	}
}

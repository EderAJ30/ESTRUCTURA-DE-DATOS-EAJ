package fes.aragon.inicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class PruebaHastSet {
	public static void main(String[] args) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		Set<String> palabras=new HashSet<>();
		long totalTiempo=0;
		try {
			
			archivo = new File(System.getProperty("user.dir")+"/Don_quijote.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] lineaLeer=linea.split(" ");
				long momentoLlamada=System.currentTimeMillis();
				for (String palabra : lineaLeer) {
					palabras.add(palabra);
				}
				momentoLlamada=System.currentTimeMillis()-momentoLlamada;
				totalTiempo+=momentoLlamada;
				
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("Total de palabras: "+palabras.size());
		System.out.println("Tiempo: "+totalTiempo);
	}

}

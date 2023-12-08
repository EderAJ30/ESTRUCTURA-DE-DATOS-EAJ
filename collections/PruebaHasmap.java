package fes.aragon.inicios;

import java.util.HashMap;
import java.util.Map;

public class PruebaHasmap {
	public static void main(String[] args) {
		Map<Integer,Persona> mapa=new HashMap<>();
		mapa.put(1, new Persona("A1",34));
		mapa.put(2, new Persona("A2",24));
		mapa.put(3, new Persona("A3",14));
		mapa.put(4, new Persona("A4",54));
		
		for(Map.Entry<Integer, Persona> objeto:mapa.entrySet()) {
			System.out.println("Llave: "+objeto.getKey()+ " Valor: "+objeto.getValue());
		}
		
		System.out.println("-----------");
		
		mapa.forEach((k,v)->{
			System.out.println("Llave: "+k + " Valor: "+ v);
		}); 
		
		System.out.println("-----------");
		mapa.remove(3);
		mapa.forEach((k,v)->{
			System.out.println("Llave: "+k + " Valor: "+ v);
		});
		
		
	}

}

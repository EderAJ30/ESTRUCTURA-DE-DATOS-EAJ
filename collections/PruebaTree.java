package fes.aragon.inicios;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaTree {
	public static void main(String[] args) {
		SortedSet<Integer> arbol=new TreeSet<>();		
		arbol.add(234);
		arbol.add(34);
		arbol.add(534);
		arbol.add(4);		
		arbol.iterator().forEachRemaining(objeto->System.out.println(objeto));
		System.out.println("------------");
		arbol.remove(34);
		Iterator<Integer> iter=arbol.iterator();
		while(iter.hasNext()) {
			Integer obj=(Integer)iter.next();
			System.out.println(obj);
		}
		System.out.println("------------");
		SortedSet<Persona> arbolDos=new TreeSet<>();
		arbolDos.add(new Persona("A1",1));
		arbolDos.add(new Persona("B1",10));
		arbolDos.add(new Persona("C1",9));		
		arbolDos.iterator().forEachRemaining(objeto->System.out.println(objeto.getEdad()));		
		System.out.println("------------");		
		SortedSet<Persona> arbolCinco=new TreeSet<>(new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				String nombreUno=o1.getNombre();
				String nombreDos=o2.getNombre();
				return nombreUno.compareTo(nombreDos);
			}			
		});
		SortedSet<Persona> arbolCuatro=new TreeSet<>();
		arbolCuatro.add(new Persona("A1",120));
		arbolCuatro.add(new Persona("B1",10));
		arbolCuatro.add(new Persona("C1",9));
		arbolCuatro.add(new Persona("A2",9));		
		arbolCinco.addAll(arbolCuatro);
		arbolCinco.iterator().forEachRemaining(objeto->System.out.println(objeto));
		
	}

}

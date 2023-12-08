package fes.aragon.inicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<>();
		lista.add(12);
		lista.add(34);
		lista.add(67);
		
		Iterator<Integer> iter=lista.iterator();
		while(iter.hasNext()) {
			Integer i=(Integer)iter.next();
			System.out.println(i);
		}
		System.out.println("---------------");
		
		lista.iterator().forEachRemaining(objeto->System.out.println(objeto));
		
	
	}

}

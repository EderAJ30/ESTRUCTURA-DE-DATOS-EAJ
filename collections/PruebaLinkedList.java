package fes.aragon.inicios;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PruebaLinkedList {
	public static void main(String[] args) {
		List<Integer> lista=new LinkedList<>();
		lista.add(34);
		lista.add(134);
		lista.add(234);
		
		Iterator<Integer> iter=lista.iterator();
		while(iter.hasNext()) {
			Integer objeto=(Integer)iter.next();
			System.out.println(objeto);
		}
		System.out.println("-------------");
		lista.iterator().forEachRemaining(objeto->System.out.println(objeto));
		System.out.println("-------------");
		iter=lista.listIterator();
		while(iter.hasNext()) {
			Integer objeto=(Integer)iter.next();
			if(objeto.equals(134)) {
				iter.remove();				
			}else {
				System.out.println(objeto);	
			}			
		}
		System.out.println("-----Malo-----");
		iter=lista.listIterator();
		Iterator<Integer> iterDos=lista.listIterator();
		iter.next();
		iter.remove();
		iterDos.next();
		
	}

}

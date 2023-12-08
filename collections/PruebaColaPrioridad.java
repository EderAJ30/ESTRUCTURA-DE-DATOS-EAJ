package fes.aragon.inicios;

import java.util.PriorityQueue;

public class PruebaColaPrioridad {
	public static void main(String[] args) {
		PriorityQueue<Persona> cola=new PriorityQueue<>();
		cola.add(new Persona("A1",23));
		cola.add(new Persona("A2",123));
		cola.add(new Persona("A3",3));
		
		cola.iterator().forEachRemaining(objeto->System.out.println(objeto));
		System.out.println("------------");
		cola.remove();
		cola.iterator().forEachRemaining(objeto->System.out.println(objeto));
		
	}

}

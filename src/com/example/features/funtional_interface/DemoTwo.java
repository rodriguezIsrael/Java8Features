package com.example.features.funtional_interface;

import java.util.Objects;

public class DemoTwo {

	/**
	 * Se crea la interface funcional, misma que debera de tener solo un método
	 * abstracto, a forma de ejemplo se crea sobre esta misma clase, pero lo ideal
	 * es ponerlo en un .java aparte
	 * 
	 * @author isivroes
	 *
	 */
	public interface Concat {

		/**
		 * Método abstracto que realizara cualquier operacion
		 * 
		 * @param x
		 * @param y
		 * @return
		 */
		public String operation(StringBuilder x, String y);

		/**
		 * Si creamos algun otro método en donde se utilice la interface funcional dara
		 * un error debido a que solo debe existir un metodo abstracto en una interface
		 * funcional, por tal razon el siguiente método se tiene comentado
		 * 
		 * @param x
		 * @param y
		 * @return
		 */
//		public double anotherOperation(double x, double y);

	}

	public static final void main(String... strings) {
		// Uso de interface funcional para suma
		Concat concat = (x, y) -> x.append(y).toString();
		
		System.out.println("El resultado de la suma es: " + concat.operation(new StringBuilder("Hola..."), "Adios"));

	}

}

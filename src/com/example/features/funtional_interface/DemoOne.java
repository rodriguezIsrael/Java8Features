package com.example.features.funtional_interface;

public class DemoOne {

	/**
	 * Se crea la interface funcional, misma que debera de tener solo un método
	 * abstracto, a forma de ejemplo se crea sobre esta misma clase, pero lo ideal
	 * es ponerlo en un .java aparte
	 * 
	 * @author isivroes
	 *
	 */
	public interface Mathematics {

		/**
		 * Método abstracto que realizara cualquier operacion
		 * 
		 * @param x
		 * @param y
		 * @return
		 */
		public double operation(double x, double y);

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
		Mathematics sum = (x, y) -> x + y;
		// Uso de interface funcional para resta
		Mathematics subtraction = (x, y) -> x - y;
		// Uso de interface funcional para multiplicacion
		Mathematics mult = (x, y) -> x * y;
		// Uso de interface funcional para division
		Mathematics div = (x, y) -> x / y;

		System.out.println("El resultado de la suma es: " + sum.operation(15, 10));
		System.out.println("El resultado de la suma es: " + subtraction.operation(15, 10));
		System.out.println("El resultado de la suma es: " + mult.operation(15, 10));
		System.out.println("El resultado de la suma es: " + div.operation(15, 10));

	}

}

package kata_depuracion;

public class FizzBuzz {
	   /**
     * Este método ejecuta el algoritmo FizzBuzz.
     * Imprime números del 1 al 100 con las siguientes reglas:
     * - "Fizz" si el número es divisible por 3.
     * - "Buzz" si el número es divisible por 5.
     * - "FizzBuzz" si el número es divisible por ambos 3 y 5.
     * - El número en cualquier otro caso.
     */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {//Breakpoint 1
				System.out.println("FizzBuzz");//Breakpoint 2
			}
			else if (i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}

}

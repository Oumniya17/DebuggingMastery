package kata_depuracion;

public class Tamagotchi {
//Declaracion de los atributos
	private int hunger;
	private int energy;
	private int mood;
//Constructor
	public Tamagotchi() {
		this.hunger = 4;//Puntuacion inicial de hambre
		this.energy = 4;//Puntuacion inicial de energia
		this.mood = 4;//Puntuacion inicial de humor
	}
	   /**
     * Método para jugar con el Tamagotchi.
     * - Aumenta el hambre y el humor en 1.
     * - Disminuye la energía en 1.
     * - Devuelve el estado del Tamagotchi después de jugar.
     * @return String con el estado actual del Tamagotchi.
     */
	public String play() {
		hunger += 1;//Breakpoint 1
		mood += 1; 
		energy -=1;
		
		return getState();
	}
    /**
     * Método para alimentar al Tamagotchi.
     * - Disminuye el hambre en 2.
     * - Disminuye la energía en 1.
     * - Devuelve el estado del Tamagotchi después de comer.
     * @return String con el estado actual del Tamagotchi.
     */
	public String eat() {
		hunger -=2;
		if (hunger < 0) hunger = 0;//Breakpoint 2
		energy -= 1;
		
		return getState();
	}

    /**
     * Método para poner a dormir al Tamagotchi.
     * - Aumenta la energía en 2.
     * - Devuelve el estado del Tamagotchi después de dormir.
     * @return String con el estado actual del Tamagotchi.
     */
	public String sleep() {
		energy += 2;
		return "(-_-) zZZ";
	}
	  /**
     * Método privado para obtener el estado del Tamagotchi basado en sus atributos.
     * - `:-)` Contento: si el humor > 8.
     * - `(-_-)` Cansado: si la energía < 3.
     * - `(-_-) zZZ` Dormido: si la energía == 0.
     * - `ఠ_ఠ` Enfadado: si el humor < 2.
     * - `:-|` Normal: en todos los demás casos.
     * @return String con el estado actual del Tamagotchi.
     */
	private String getState() {
		if (mood > 8) {
			return ":-)";//Breakpoint 3
		} else if (energy < 3 && energy > 0) {
			return "(-_-)";
		} else if (energy <= 0) {
			return "(-_-) zZZ";
		} else if (mood < 2) {
			return "ఠ_ఠ";
		} else {
			return ":-|";
		} 
	}
// Métodos principales para probar el Tamagotchi	
	public static void main(String[] args) {
		Tamagotchi pet = new Tamagotchi();
		
		System.out.println("Estado inicial: " + pet.getState());
		
		System.out.println("Jugar: " + pet.play());
		System.out.println("Comer: " + pet.eat());
		System.out.println("Dormir: " + pet.sleep());
		System.out.println("Estado final: " + pet.getState());
	}

}

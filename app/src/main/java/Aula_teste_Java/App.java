/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Aula_teste_Java;

//HEran�a 
//Poliformismo
public class App {

    public static void main(String[] args) {
    	Equipe equipeYamaha = new Equipe ();
		Equipe equipeSuzuki = new Equipe();
		Equipe equipeHonda = new Equipe();
    	equipeYamaha.v1 = new Veiculo (new MotorDeYamaha());
    	equipeSuzuki.v2 = new Veiculo(new MotorDeSuzuki());
		equipeHonda.v3 = new Veiculo(new MotorDeHonda());
    	equipeYamaha.v1.Acelerar(4);
		equipeSuzuki.v2.Acelerar(4);
		equipeHonda.v3.Acelerar(4);
    	System.out.println(equipeYamaha.v1.Acelerar(5));
		System.out.println(equipeSuzuki.v2.Acelerar(3));
		System.out.println(equipeHonda.v3.Acelerar(3));
		
    
    }

 
}

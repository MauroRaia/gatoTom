
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gato tom = new Gato();
		Raton jerry = new Raton (1.0, 5.0, "guada");
		Raton jerry2 = new Raton (1.5, 5.0, "mau");
		Raton jerry3 = new Raton (2.5, 5.0, "maru");
		tom.comerRaton(jerry);
		tom.comerRaton(jerry2);
		tom.comerRaton(jerry3);
		tom.meConvieneComerA_queEstaA(jerry);
		System.out.println(tom.devolverNombreRatonesComidos(tom));
		

	}

}
//Maru genia de la vida
//Guada enferma por siempre
//Mau presidente con h prhecidhnth vote 4 Mau.

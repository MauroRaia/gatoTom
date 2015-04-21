
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gato tom = new Gato();
		Raton jerry = new Raton(1.0,50000.0);
		tom.meConvieneComerA_queEstaA(jerry);
		System.out.println(tom.meConvieneComerA_queEstaA(jerry));

	}

}
  
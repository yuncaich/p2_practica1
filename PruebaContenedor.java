
public class PruebaContenedor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContenedorDeEnteros a = new ContenedorDeEnteros();
		int[] v;
		System.out.println("El contenedor a tiene "+a.cardinal()+" elementos.");
		for(int i=0; i<10; i++){
			a.insertar(i);
			a.buscar(i);
		}
		System.out.println("El contenedor a tiene "+a.cardinal()+" elementos.");
		a.extraer(1);
		System.out.println("El contenedor a tiene "+a.cardinal()+" elementos.");

		v = a.elementos();
		for(int i=0; i<a.cardinal(); i++) System.out.println(v[i]);
		a.vaciar();
		
		for(int i=0; i<100; i++){
			a.insertar(i);
			a.extraer(i);
		}
	}

}

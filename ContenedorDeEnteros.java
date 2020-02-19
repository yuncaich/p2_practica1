

public class ContenedorDeEnteros {
	private Nodo raiz;
	
	public ContenedorDeEnteros() {
		raiz = null;
	}
	
	public int cardinal() {
		int cont = 0;
		Nodo aux = raiz;
		while (aux != null) {
			cont++;
			aux = aux.getSiguiente();
		}
		return cont;
	}
	
	public boolean insertar(int add){
		Nodo nuevo = new Nodo();
		nuevo.setValor(add);
		
		Nodo aux = raiz;
		
		if(buscar(add) == true) {
			return false;
		}
		if(raiz == null) {
			raiz = nuevo;
		}else {
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
		}
		return true;
		
	}
	
	public boolean buscar(int add) {
		Nodo aux = raiz;
		while (aux != null) {
			if(aux.getValor() == add) {
				return true;
			}else {
				aux = aux.getSiguiente();
			}
		}
		return false;
	}
	
	public boolean extraer(int add) {
		Nodo siguiente = new Nodo();
		Nodo nuevo = new Nodo();
		nuevo.setValor(add);
		
		Nodo aux = raiz;
		
		if(!buscar(add)) {
			return false;
		}
		
		while(aux.getValor() != add) {
			aux = aux.getSiguiente();
		}
		siguiente = aux.getSiguiente().getSiguiente();
        // Enlaza el nodo anterior al de eliminar con el 
        // sguiente despues de el.
        aux.setSiguiente(siguiente);  
		return true;
	}
	
	public void vaciar() {
		raiz = null;
	}
	public int [] elementos() {
		int [] vector = new int [cardinal()];
		Nodo aux = raiz;
		
		while (aux != null) {
			for(int i = 0 ; i<vector.length;i++) {
				vector[i] = aux.getValor();
				aux = aux.getSiguiente();
			}
		}
		return vector;
		
	}
	
}
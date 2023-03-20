package clases;
/**
 * 
 * @author bsanchez
 *
 */
public class Contador {
	
	private int cont;
	
	//Constructor por defecto
/**
 * 
 */
	public Contador() {}
	
	//Contructor con par�metros
	/**
	 * 
	 * @param cont
	 */
	public Contador(int cont) {
		if(cont<0) {
			this.cont=0;
		}else {
			this.cont=cont;
		}
	}
	
	//Constructor copia
	/**
	 * 
	 * @param c
	 */
	public Contador(final Contador c) {
		cont=c.cont;
	}
	
	//geter 
	/**
	 * 
	 * @param cont
	 */
	public void setContador(int cont) {
		if(cont<0) {
			this.cont=0;
		}else {
			
		this.cont=cont;
		}
	}
	//setter
	/**
	 * 
	 * @return
	 */
	public int getContador() {
		return cont;
	}
	
	//M�todo incrementar
	/**
	 * 
	 */
	public void incrementar() {
		cont++;
	}
	//M�todo decrementarç
	/**
	 * 
	 */
	public void decrementar() {
		cont--;
		if (cont<0) {
			cont=0;
		}
	}
	
	

}

package clases;
/**
 * 
 * @author bsanchez
 *
 */
public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	//constructor por defecto
	/**
	 * 
	 */
	public Libro() {} 
	// constructor con par�metros
	/**
	 * 
	 * @param titulo (this variable is the title of the book)
	 * @param autor (this variable is the author of the book)
	 * @param ejemplares (this variable is the number of examples of the book)
	 * @param prestados (this variable is the number or borrowed books)
	 */
	public Libro (String titulo,String autor,int ejemplares,int prestados) {
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.prestados=prestados;
		
	}
	// constructor copy
	/**
	 * 
	 * @param lib
	 */
	public Libro( final Libro lib) {
		titulo=lib.titulo;
		autor=lib.autor;
		ejemplares=lib.ejemplares;
		prestados=lib.prestados;
		
	}
	
	//getters y setters
	/**
	 * 
	 * @param titulo (this is the title of the book)
	 */
	public void setTitulo(String titulo) {
		this.titulo=titulo;
			}
	/**
	 * 
	 * @return (the system return the title of the book)
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * 
	 * @param autor (this is the title of the book)
	 */
	public void setAutor( String autor) {
		this.autor=autor;
	}
	/**
	 * 
	 * @return (the system return us the name of the author of the book)
	 */
	public String getAutor() {
		return autor;
	}
	/**
	 * 
	 * @param ejemplares (number of examples)
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares=ejemplares;
	}
	/**
	 * 
	 * @return (the system return us the number of examples)
	 */
	public int getEjemplares() {
		return ejemplares;
	}
	/**
	 * 
	 * @param prestados (number of borrowed books)
	 */
	public void setPrestados(int prestados) {
		this.prestados=prestados;
	}
	/**
	 * 
	 * @return (the system return us the number of borrowed books)
	 */
	public int getPrestados() {
		return prestados;
	}
		
	
	//m�todo toString (the system return us the message that is the title of the book, the author,the number of examples and the number of borrowed books)
	/**
	 * 
	 */
	public String toString() {
		String mensaje="T�tulo: "+titulo+"\nAutor: "+autor+"\nEjemplares: "+ejemplares+"\nPrestados: "+prestados+"\n----------------\n";
		return mensaje;
		
	}
	// M�todo pr�stamo que incremente el atributo correspondiente cada vez que se realice un pr�stamo del libro. 
	//No se podr�n prestar libros de los que no queden ejemplares disponibles para prestar. 
	//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
	/**
	 * 
	 * @return (the system return us if the borrow is true or false)
	 */
	public boolean prestamoLibro() {
		boolean prestamo=true;
		if (prestados<ejemplares)
		{
			prestados++;
			
		}
		else
		{
			prestamo=false;
		}
		return prestamo;
	}
		
	//M�todo devoluci�n que decremente el atributo correspondiente cuando se produzca la devoluci�n de un libro
	//No se podr�n devolver libros que no se hayan prestado.
	//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
		/**
		 * 
		 * @return (the system return us if the refund is true or false)
		 */
	public boolean devolucionLibro() {
			boolean devuelto=true;
			if(prestados>0) {
				prestados--;
			}
			else
			{
				devuelto=false;
			}
			return devuelto;		
			
		}
	
}

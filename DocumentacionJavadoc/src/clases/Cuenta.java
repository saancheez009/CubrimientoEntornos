package clases;
/**
 * 
 * @author bsanchez
 *
 */
public class Cuenta {
	private String nombre;
	private String numeroCuenta;
	private double interes;
	private double saldo;
	
	//Constructor por defecto
	public Cuenta(){
		
	}
	//Constructor con par�metros
	/**
	 * 
	 * @param nombre
	 * @param numero_cuenta
	 * @param interes
	 * @param saldo
	 */
	public Cuenta(String nombre,String numero_cuenta,double interes, double saldo) {
		this.nombre=nombre;
		this.numeroCuenta=numero_cuenta;
		this.interes=interes;
		this.saldo=saldo;
		
	}
	//Constructor copia
	/*
	 * 
	 */
	public Cuenta(final Cuenta c) {
		nombre=c.nombre;
		numeroCuenta=c.numeroCuenta;
		interes=c.interes;
		saldo=c.saldo;
	}

	//get y set
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param numeroCuenta
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta=numeroCuenta;
	}
	/**
	 * 
	 * @return
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * 
	 * @param interes
	 */
	public void setInteres(double interes) {
		this.interes=interes;
		
	}
	/**
	 * 
	 * @return
	 */
	public double getInteres() {
		return interes;
	}
	/**
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	/**
	 * 
	 * @return
	 */
	public double getSaldo() {
		return saldo;
	}
	//M�todo ingreso 
	/**
	 * 
	 * @param cantidad
	 * @return
	 */
	public boolean ingreso(double cantidad) {
		if (cantidad>0) {
		saldo=saldo+cantidad;
		return true;
		}
		else
		{
			return false;
		}
	}
	
	//M�todo reintegro 
	/**
	 * 
	 * @param cantidad
	 * @return
	 */
	public boolean reintegro(double cantidad) {
		if(saldo>=cantidad) {
		 saldo=saldo-cantidad;
		 return true;
		}
		else {
		return false;
			
		}
	}
	
	//M�todo transferencia
	/**
	 * 
	 * @param c
	 * @param cantidad
	 * @return
	 */
	public boolean transferencia(Cuenta c,double cantidad) {
		boolean correcto=true;
		if(cantidad <0 || saldo< cantidad) {
			correcto=false;	
		}else {
			reintegro(cantidad);
			c.ingreso(cantidad);
			
			}
		return correcto;
		
	}
		

}

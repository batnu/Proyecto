/** 
 * Proyecto: Juego de la vida.
 * Organiza aspectos de gestión de la simulación según el modelo1.1.
 * @since: prototipo1.0
 * @source: Simulacion.java 
 * @version: 1.2 - 2019.02.25
 * @author: ajp
 */

package modelo;

import util.Fecha;

public class Simulacion {

	public static final int CICLOS_SIMULACION = 20;
	private Usuario usr;
	private Fecha fecha;
	private Mundo mundo;

	/**
	 * Constructor convencional.
	 * Establece el valor inicial de cada uno de los atributos.
	 * Recibe parámetros que se corresponden con los atributos.
	 * Utiliza métodos set... para la posible verificación.
	 * @param usr
	 * @param fecha
	 * @param mundo
	 */
	public Simulacion(Usuario usr, Fecha fecha, Mundo mundo) {
		setUsr(usr);
		setFecha(fecha);
		setMundo(mundo);
	}

	/**
	 * Constructor por defecto.
	 * Establece el valor inicial, por defecto, de cada uno de los atributos.
	 * Llama al constructor convencional de la propia clase.
	 */
	public Simulacion() {
		this(new Usuario(), new Fecha(), new Mundo());	
	}

	/**
	 * Constructor copia.
	 * Establece el valor inicial de cada uno de los atributos a partir de
	 * los valores obtenidos de un objeto de su misma clase.
	 * El objeto Usuario es compartido (agregación).
	 * Llama al constructor convencional.
	 * @param s - la Simulacion a clonar
	 */
	public Simulacion(Simulacion s) {
		setUsr(new Usuario(s.usr));
		setFecha((Fecha)s.fecha.clone());
		setMundo(new Mundo(s.mundo));
	}

	public Usuario getUsr() {
		return usr;
	}

	public void setUsr(Usuario usr) {
		assert usr != null;
		this.usr = usr;
	}


	public Mundo getMundo() {
		return mundo;
	}

	public void setMundo(Mundo mundo) {
		assert mundo != null;
		this.mundo = mundo;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		assert fecha != null;
		this.fecha = fecha;
	}

	public String getIdSimulacion() {	
		return this.usr.getId() + "-" + fecha.toStringMarcaTiempo();
	}
	
	@Override
	public String toString() {
		return String.format(
				"Simulacion [usr=%s, fecha=%s, mundo=%s]", usr, fecha, mundo);
	}

//	/**
//	 * Ejecuta una simulación del juego de la vida en la consola.
//	 */
//	public void lanzarDemo() {
//		int generacion = 0; 
//		do {
//			System.out.println("\nGeneración: " + generacion);
//			mundo.actualizarMundo();
//			generacion++;
//			simulacion.getMundo().toStringEstadoMundo();
//		}
//		while (generacion < CICLOS_SIMULACION);
//	}


} //class

package ejercicio1;
/****
 * 
 * <h2>Descripci?n</h2>
 * <p>La clase <em>FiguraGeometrica</em> es una clase abstracta cuya finalidad 
 * es la de proporcionar tanto atributos como m?todos a las clases que estenderan de ella.</p>
 * 
 * @author ElenaSanz
 * @version 2.46
 * 
 * */
public abstract class FiguraGeometrica {
	/***
	 * Atributo valor de tipo bouble
	 * */
	protected double valor;
	
	/***
	 * Constructor que adjudica al atributo valor el introducido como parametro
	 * 
	 * @param double valor 
	 * */
	public FiguraGeometrica(double valor) {
		this.valor = valor;
	}
	
	/***
	 * M?todo sin implementar 
	 * 
	 * @return area total de la figura geom?trica
	 * */
	public abstract double getArea();
	
	/***
	 * M?todo sin implementar 
	 * 
	 * @return per?metro total de la figura geom?trica
	 * */
	public abstract double getPerimetro();
	
	/****
	 * Modifica el valor anterior adjudicandole el nuevo pasado como parametro
	 * 
	 * @param double valor
	 * */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/****
	 * Devuelve el atributo valor
	 * 
	 * @return double valor
	 * */
	public double getValor() {
		return valor;
	}

}


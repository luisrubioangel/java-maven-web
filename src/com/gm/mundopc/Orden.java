package com.gm.mundopc;

public class Orden {
	private final int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private static final int 	MAX_COMPUTADORAS=10;
	private int contadorComputadoras;
	public Orden() {
		this.idOrden =++Orden.contadorOrdenes;	
		this.computadoras =new Computadora[Orden.MAX_COMPUTADORAS];	
	}
	public void agregarComputadora(Computadora computadora) {
		if(this.contadorComputadoras<Orden.MAX_COMPUTADORAS) {
			this.computadoras[this.contadorComputadoras++]=computadora;
		}else {
			System.out.print("Has superado el limite de " + Orden.MAX_COMPUTADORAS);		
		}
		
	}
	public void mostrarOrden() {
		System.out.print("Orden #: " + this.idOrden+"\n");
		System.out.print("computadors de la Orden #: " +this.idOrden+"\n");
		for(int i=0;i<this.contadorComputadoras;i++) {
			System.out.println(this.computadoras[i]+"\n");
			
		}
}
	
	
	

}

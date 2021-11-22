package com.gm.mundopc;

public class Teclado extends DispositivoDeEntrada{
	private final int idTeclado;
	private static int contadoTecldos;
	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = ++Teclado.contadoTecldos;
		
	}
	@Override
	public String toString() {
		return "Teclado [idTeclado=" + idTeclado + ", getTipoEntrada()=" + getTipoEntrada() + ", getMarca()="
				+ getMarca() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	


}

package MundoPc;

import com.gm.mundopc.*;

public class Mundopc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Monitor monitorHP=new Monitor("hp",13);
	    Teclado tecladoHP=new Teclado("bluetooth","hp");
	    Raton ratonHP=new Raton("bluetooth","hp");

	Computadora computadoraHP=new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
	
	Monitor monitorGamer=new Monitor("Gamer",20);
    Teclado tecladoGamer=new Teclado("bluetooth","Gamer");
    Raton ratonGamer=new Raton("bluetooth","Gamer");
    
    Computadora computadoraGamer=new Computadora("Computadora HP",monitorGamer,tecladoHP,ratonGamer);
	
    
    Orden orden1=new Orden();
    orden1.agregarComputadora(computadoraHP);
    orden1.agregarComputadora(computadoraGamer);
    orden1.mostrarOrden();
	}

}

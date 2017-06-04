package Container;

import java.util.ArrayList;

import models.ListaOrdenada;
import models.Trayecto;

public class Container {

	static ListaOrdenada<Trayecto> trayectos = new ListaOrdenada<Trayecto>(
			(Trayecto t1, Trayecto t2) -> t2.getIniciotrayecto().compareTo(t1.getIniciotrayecto()));

	public static ArrayList<Trayecto> getTrayectos() {
		return trayectos;
	}

}

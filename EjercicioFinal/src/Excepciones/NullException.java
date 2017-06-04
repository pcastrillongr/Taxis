package Excepciones;

public class NullException {



	//Excepcion creada para cuando se intente introducir un null dentro de nuestro arraylist

	public class ElementNotAllowedException extends NullPointerException {
		
		public ElementNotAllowedException(String msg){
			
			
			super("Exception:"+msg);
		}

	}

}

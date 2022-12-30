package us.muit.fs.a4i.exceptions;

/**
 * @author Isabel Rom�n
 *
 */
public class MetricException extends Exception {
	 /**
	 * Excepci�n al manejar m�trica
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Informaci�n sobre el error
	 */
	private String message;
	/**
	 * <p>Constructor</p>
	 * @param info Mensaje definiendo el error
	 */
	public MetricException(String info){
		message=info;
	}

	@Override
	    public String getMessage(){
		 return message;
    }
}
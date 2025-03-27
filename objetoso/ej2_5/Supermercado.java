package ej2_5;

public class Supermercado {

		   
		public void notificarPedido(long nroPedido, Cliente cliente) {

		     // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
		    System.out.println(this.extracted(nroPedido, cliente));
		  }

		private String extracted(long nroPedido, Cliente cliente) {
			return MessageFormat.format(“Estimado cliente, se le informa que hemos 
					recibido su pedido con número {0}, el cual será enviado a la 
					dirección {1}”, new Object[] { nroPedido, cliente.getDireccionFormateada() });
		}
		
	
}

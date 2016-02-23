package paquete;

public class PaqueteSaldo implements Paquetes {

	public PaqueteSaldo() {
		
	}

	private double precioBase;
	
	@Override
	public double getPrecioBase() {
		return this.precioBase;
	}

	public void setPrecioBase(Clientes cliente) {
		this.precioBase = cliente.getSaldo() * 0.1;
	}

	@Override
	public double getPrecioFinal(double impuesto) {
		return getPrecioBase() * impuesto;
	}

}

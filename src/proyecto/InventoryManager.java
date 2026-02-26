package proyecto;

public class InventoryManager {
	private static final int LONGITUD_MINIMA_NOMBRE = 3;
	private static final int PRECIO_MAXIMO = 10000;
	private static final double IVA = 0.21;

	public void actualizarStock(String producto, int cantidad, double precio) {
		if (cantidad > 0 && precio > 0 && precio < PRECIO_MAXIMO && producto.length() > LONGITUD_MINIMA_NOMBRE) {
			System.out.println("Stock actualizado: " + producto);
			double valorTotal = cantidad * precio + cantidad * precio * IVA;
			System.out.println("Valor total con IVA: " + valorTotal);
		}
	}
}

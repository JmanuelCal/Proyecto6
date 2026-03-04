package proyecto;

public class InventoryManager {
	private static final int LONGITUD_MINIMA_NOMBRE = 3;
	private static final int PRECIO_MAXIMO = 10000;
	private static final double IVA = 0.21;

	public void actualizarStock(String producto, int cantidad, double precio) {
		if (esValida(producto, cantidad, precio)) {
			imprimirConfirmacion(producto);
			double valorTotal = calcularValorConIva(cantidad, precio);
			System.out.println("Valor total con IVA: " + valorTotal);
		}
	}
}

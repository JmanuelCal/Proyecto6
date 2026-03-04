package proyecto;

public class InventoryManager {
	public void actualizarStock(String producto, int cantidad, double precio) {
		if (esValida(producto, cantidad, precio)) {
			imprimirConfirmacion(producto);
			double valorTotal = calcularValorConIva(cantidad, precio);
			System.out.println("Valor total con IVA: " + valorTotal);
		}
	}
}

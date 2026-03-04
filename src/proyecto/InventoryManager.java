package proyecto;

public class InventoryManager {
	public void actualizarStock(String producto, int cantidad, double precio) {
		if (cantidad > 0 && precio > 0 && precio < 10000 && producto.length() > 3) {
			System.out.println("Stock actualizado: " + producto);
			double valorTotal = cantidad * precio + cantidad * precio * 0.21;
			System.out.println("Valor total con IVA: " + valorTotal);
		}
	}
}
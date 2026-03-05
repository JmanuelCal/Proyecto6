package proyecto;

/**
 * Clase encargada de la gestión y validación del inventario de productos.
 * Permite actualizar existencias y realizar cálculos fiscales asociados.
 * * @author Tu Nombre 
 * @version 1.0 
 * @since 2026-02-26
 */

public class InventoryManager {
	/** Longitud mínima requerida para el nombre de un producto.*/
	private static final int LONGITUD_MINIMA_NOMBRE = 3;
	/** Límite superior de precio permitido por unidad para validación.*/
	private static final int PRECIO_MAXIMO = 10000;
	/** Tasa impositiva aplicada al valor de los productos (21%)*/
	private static final double IVA = 0.21;

	/**
     * Procesa la actualización del stock de un producto tras validar sus datos.
     * Muestra por consola el estado de la actualización y el valor fiscal total.
     * * @param producto Nombre identificativo del artículo. 
     * @param cantidad Número de unidades a ingresar (debe ser mayor a cero). 
     * @param precio Valor unitario del artículo. 
     */
	public void actualizarStock(String producto, int cantidad, double precio) {
		if (esValido(producto, cantidad, precio)) {
			System.out.println("Stock actualizado: " + producto);
			double valorTotal = calcularValorConIva(cantidad, precio);
			System.out.println("Valor total con IVA: " + valorTotal);
		}
	}
	
	/**
     * Procesa la actualización del stock de un producto tras validar sus datos.
     * Muestra por consola el estado de la actualización y el valor fiscal total.
     * * @param producto Nombre identificativo del artículo. 
     * @param cantidad Número de unidades a ingresar (debe ser mayor a cero). 
     * @param precio Valor unitario del artículo. 
     */

	private double calcularValorConIva(int cantidad, double precio) {
		double neto = cantidad * precio;
		return neto + (neto * IVA);
	}

	/**
     * Verifica que los datos del producto cumplan con las reglas de negocio.
     * * @param producto Nombre a validar. 
     * @param cantidad Cantidad a validar (positiva). 
     * @param precio Precio a validar (dentro de rangos permitidos). 
     * @return true si todos los parámetros son correctos, false en caso contrario. 
     */
	private boolean esValido(String producto, int cantidad, double precio) {
		return cantidad > 0 && precio > 0 && precio < PRECIO_MAXIMO && producto.length() > LONGITUD_MINIMA_NOMBRE;
	}
}

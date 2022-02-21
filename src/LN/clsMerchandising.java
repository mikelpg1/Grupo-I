package LN;

public class clsMerchandising {
	private int idMerchandising;
	private String nombre;
	private String descripcion_corta;
	private double precio;
	private int stock;
	
	public clsMerchandising(int idMerchandising, String nombre, String descripcion_corta, double precio, int stock) {
		super();
		this.idMerchandising = idMerchandising;
		this.nombre = nombre;
		this.descripcion_corta = descripcion_corta;
		this.precio = precio;
		this.stock = stock;
	}

	public int getId() {
		return idMerchandising;
	}

	public void setId(int idMerchandising) {
		this.idMerchandising = idMerchandising;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion_corta() {
		return descripcion_corta;
	}

	public void setDescripcion_corta(String descripcion_corta) {
		this.descripcion_corta = descripcion_corta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}  
	
}

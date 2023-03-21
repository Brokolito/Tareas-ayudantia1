package model;

public class Tareas {
	private String titulo;
	private String descripcion;
	private Date fecha;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Tareas(String titulo, String descripcion, Date fecha) {
		throw new UnsupportedOperationException();
	}
}
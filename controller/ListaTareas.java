package controller;

import java.util.ArrayList;
import java.util.Date;

import model.Tareas;

public class ListaTareas {
	private ArrayList<Tareas> tareas;

	public ListaTareas() {
		this.tareas=new ArrayList<>();
	}

	public ArrayList<Tareas> getTareas() {
		return this.tareas;
	}

	public boolean eliminarTarea(int indice) {
		try{
			tareas.remove(indice);
		}catch (IndexOutOfBoundsException e){
			System.out.println("El indice de la tarea escogida para eliminar no existe");
			return false;
		}
		return true;
	}

	public boolean agregarTarea(String titulo, String descripcion, Date fecha) {
		Tareas tareas1=new Tareas(titulo,descripcion,fecha);
		tareas.add(tareas1);
		return true;
	}

	public void mostrarTareas() {
		int index = 0;
		for(Tareas tareas1: this.tareas){
			System.out.println(index+" "+tareas1.getTitulo()+" "+tareas1.getFecha());
			index++;
		}
	}
}
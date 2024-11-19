/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionestudiantes;

/**
 *
 * @author Amparo
 */
public class Curso {
	private String nombre;
	private String apellido;
	private double nota;
	
	public Curso(String nombre, String apellido, double nota) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Curso: Nombre:" + nombre + ", Apellido:" + apellido + ", Nota:" + nota;
	}
	
}
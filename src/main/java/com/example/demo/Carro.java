package com.example.demo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carro {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String marca;
	String modelo;
	Integer ano;
	

@Override
public String toString() {
	return "Carro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
}


public Carro(Long id, String marca, String modelo, Integer ano) {
	super();
	this.id = id;
	this.marca = marca;
	this.modelo = modelo;
	this.ano = ano;
}



public Carro() {
	super();
	// TODO Auto-generated constructor stub
}


@Override
public int hashCode() {
	return Objects.hash(ano, id, marca, modelo);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Carro other = (Carro) obj;
	return Objects.equals(ano, other.ano) && Objects.equals(id, other.id) && Objects.equals(marca, other.marca)
			&& Objects.equals(modelo, other.modelo);
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public Integer getAno() {
	return ano;
}


public void setAno(Integer ano) {
	this.ano = ano;
}




}
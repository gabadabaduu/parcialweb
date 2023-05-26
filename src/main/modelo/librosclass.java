package com.web.parcialWeb.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONObject;

import java.util.Iterator;

@Entity
public class libros {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private String Nombre_libro;
  private String referencia;
  private string Autor;
  private double Precio;

  private ubicación;

  public libros() {
    super();
    Nombre_libro = null;
    referencia = null;
    autor = null;
    precio = 0;
    ubicacion = null;
  }
  public libros(String nombre, String referencia, String autor, double precio, String Ubicacion) {
    Nombre_libros = nombre;
    referencia = referencia;
    autor = autor;
    precio = precio;
    ubicacion = Ubicacion;
  }

  public Long getLibro() {
    return Nombre_libro;
  }

  public String getReferencia() {
    return referencia;
  }

  public int getAutor() {
    return autor();
  }

  public int getPrecio() {
    return precio;
  }
  public String getubicacion() {
    return ubicacion;
  }
  public void setlibro(Long Nombre_libro) {
    this.Nombre_libro = Nombre_libro;
  }
  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }
  public void setAutor(String autor) {
    this.Autor = autor;
  }
  public void setPrecio(int precio) {
    precio = precio;
  }

  public void setubicacion(String ubacacion) {
    ubacacion = getubicacion();
  }

  public JSONObject toJSON() throws Exception {
    JSONObject jlibros = new JSONObject();
    jlibros.put("Titulo", getLibro());
    jlibros.put("referencia", getReferencia());
    jlibros.put("Autor", getAutor());
    jlibros.put("Precio", getPrecio());
    jlibros.put("ubicacion", getubicacion());
    return jlibros;
  }

  public static JSONArray toJSONArray( Iterable<libros>librosIterable ) throws Exception {
    JSONArray jlibros = new JSONArray();
    Iterator<Canchas> ilibros = libros.iterator();
    while( icancha.hasNext() ) {
      libros c = icancha.next();
      jlibros.put( c.toJSON() );
    }
    return jlibros;
  }

  @Override
  public String toString() {
    return "libro{" +
      "Titulo=" + Titulo +
      ", referencias='" + referencia + '\'' +
      ", autor=" + autor +
      ", precio=" + precio +
      ", ubicacion='" + ubicacion + '\'' +
      '}';
  }
}

package com.web.proyectocanchasg1.modelo;

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

  public int getHoraC() {
    return Hora_cerrado;
  }

  public String getFecha() {
    return Fecha_canchas;
  }

  public void setIdCancha(Long idCancha) {
    this.idCanchas = idCancha;
  }

  public void setNombre(String nombre) {
    Nombre_canchas = nombre;
  }
  public void setFecha(String fecha) {
    Fecha_canchas = fecha;
  }
  public void setHora_abierta(int hora_a) {
    Hora_abierta = hora_a;
  }

  public void setHora_cerrado(int hora_c) {
    Hora_cerrado = hora_c;
  }

  public JSONObject toJSON() throws Exception {
    JSONObject jcancha = new JSONObject();
    jcancha.put("id", getIdCancha());
    jcancha.put("nombre", getNombre());
    jcancha.put("Hora_Apertura", getHoraA());
    jcancha.put("Hora_Close", getHoraC());
    jcancha.put("Fecha", getFecha());
    return jcancha;
  }

  public static JSONArray toJSONArray( Iterable<Canchas>cancha ) throws Exception {
    JSONArray jcancha = new JSONArray();
    Iterator<Canchas> icancha = cancha.iterator();
    while( icancha.hasNext() ) {
      Canchas c = icancha.next();
      jcancha.put( c.toJSON() );
    }
    return jcancha;
  }

  @Override
  public String toString() {
    return "libro{" +
      "idCanchas=" + idCanchas +
      ", Nombre_canchas='" + Nombre_canchas + '\'' +
      ", Hora_abierta=" + Hora_abierta +
      ", Hora_cerrado=" + Hora_cerrado +
      ", Fecha_canchas='" + Fecha_canchas + '\'' +
      '}';
  }
}

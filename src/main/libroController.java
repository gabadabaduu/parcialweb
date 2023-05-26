package com.web.proyectocanchasg1.controladores;

import com.web.proyectocanchasg1.modelo.Canchas;
import com.web.proyectocanchasg1.modelo.CanchasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibrosControlador {

  @Autowired
  LibrosRepository librosRepository;

  @CrossOrigin
  @PostMapping(value = "/Libros", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> insertarCancha(@RequestParam String Titulo,
                                               @RequestParam int hora_a,
                                               @RequestParam String ubicaion,
                                               @RequestParam String referencia) throws Exception{
    Libros libro = new Canchas(titulo, precio, ubicaion, fecha);
    canchasRepository.save(libro);
    HttpHeaders responseHeaders = new HttpHeaders();
    return  new ResponseEntity<String>( "{\"respuesta\":\"exito\"}", responseHeaders, HttpStatus.OK );
  }

  @CrossOrigin
  @GetMapping(value = "/libros/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public  ResponseEntity<String> getCanchas(@PathVariable Long id  ) throws Exception{
    Canchas cancha = canchasRepository.findById(id).get();
    HttpHeaders responseHeaders = new HttpHeaders();
    return  new ResponseEntity<String>(libro.toJSON().toString(), responseHeaders, HttpStatus.OK );
  }

  @CrossOrigin
  @GetMapping(value = "/libros/libro/{Titulo}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> getFromNameCanchas(@PathVariable String Titulo) throws Exception{
    List<Libros> c = canchasRepository.findByName(Titulo);
    String resCanchas = c.toString();
    HttpHeaders responseHeaders = new HttpHeaders();
    return  new ResponseEntity<String>(reslibros, responseHeaders, HttpStatus.OK );
  }
}

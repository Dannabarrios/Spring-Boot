package com.sena.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.sena.helloworld.dto.PersonDTO;
import com.sena.helloworld.dto.Response;

/*
 * @RestController=configura la clase para que
 * trabaje como un controlador
 */
@RestController
public class HelloController {
	
	/*
	 * GET=Obtener información
	 * POST=crear registros
	 * PUT=actualizar registros completo
	 * PATCH=actualización parcial
	 * DELETE=eliminar un registro
	 */
	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}
	
	@GetMapping("/hello2")
	public ResponseEntity<Response> hello2(){
		Response response=new Response();
		response.setMessage("Hello World");
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping("/saludo/{nombre}")
	public ResponseEntity<Response> saludo(@PathVariable String nombre){
		Response response=new Response();
		response.setMessage("Hola "+nombre);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@PostMapping("/saludo2")
	public ResponseEntity<Response> saludo2(@RequestBody PersonDTO person ){
		Response response=new Response();
		response.setMessage("Cordial saludo"+
				"Nombre: "+person.getNombre()+
				"Apellido: "+person.getApellido()+
				"Edad: "+person.getEdad()
				);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	/*
	 * status response
	 * 100 información
	 * 200 correcto
	 * 	200 OK
	 * 300 errores de redirección
	 * 400 errores de usuario/cliente
	 * 	404 NOT FOUND
	 * 500 errores del servidor
	 * 
	 * 
	 */

}

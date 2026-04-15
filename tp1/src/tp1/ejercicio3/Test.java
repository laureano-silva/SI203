package tp1.ejercicio3;

public class Test {

	public static void main(String[] args) {
	    Estudiante estudiante1 = new Estudiante();
	    estudiante1.setNombre("Lucía");
	    estudiante1.setApellido("Fernández");
	    estudiante1.setComision("K1051");
	    estudiante1.setEmail("lucia.fernandez@gmail.com");
	    estudiante1.setDireccion("Av. Corrientes 1234");

	    Estudiante estudiante2 = new Estudiante();
	    estudiante2.setNombre("Matías");
	    estudiante2.setApellido("Romero");
	    estudiante2.setComision("K1052");
	    estudiante2.setEmail("matias.romero@gmail.com");
	    estudiante2.setDireccion("Calle Falsa 456");

	    Profesor profesor1 = new Profesor();
	    profesor1.setNombre("Carlos");
	    profesor1.setApellido("Sánchez");
	    profesor1.setEmail("csanchez@uba.ar");
	    profesor1.setCatedra("Algoritmos");
	    profesor1.setFacultad("FIUBA");

	    Profesor profesor2 = new Profesor();
	    profesor2.setNombre("Ana");
	    profesor2.setApellido("Gómez");
	    profesor2.setEmail("agomez@uba.ar");
	    profesor2.setCatedra("Bases de Datos");
	    profesor2.setFacultad("FIUBA");

	    Profesor profesor3 = new Profesor();
	    profesor3.setNombre("Roberto");
	    profesor3.setApellido("Díaz");
	    profesor3.setEmail("rdiaz@uba.ar");
	    profesor3.setCatedra("Sistemas Operativos");
	    profesor3.setFacultad("FIUBA");	

	    Estudiante[] estudiantes = {estudiante1, estudiante2};
	    Profesor[] profesores = {profesor1, profesor2, profesor3};
	    
	    for (Estudiante e : estudiantes) {
	    	e.tusDatos();
	    }
	    
	    for (Profesor p : profesores) {
	    	p.tusDatos();
	    }
	}
}
package ejercicioTema8;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		
		persona.setEdad(25);
		int edad = persona.getEdad();
		System.out.println(edad);
		
		persona.setNombre("Agustina");
		String nombre = persona.getNombre();
		System.out.println(nombre);
		
		persona.setTelefono(33221155);
		int telefono = persona.getTelefono();
		System.out.println(telefono);
	
	

	}

}

class Persona{
	private int edad;
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return this.edad;
	}
	private String nombre;
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	private int telefono;
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getTelefono() {
		return this.telefono;
	}
}
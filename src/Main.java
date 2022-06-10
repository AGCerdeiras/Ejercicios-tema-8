public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setEdad(44);
        System.out.println(persona1.getEdad());

        persona1.setNombre("Manuel");
        System.out.println(persona1.getNombre());

        persona1.setTelefono(672153588);
        System.out.println(persona1.getTelefono());
    }

}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

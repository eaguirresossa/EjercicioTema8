public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(36);
        persona.setNombre("Edison Aguirre");
        persona.setTelefono("573003000000");
        System.out.print("Hola "+ persona.getNombre() + ", Tienes "+ persona.getEdad()+ " Años... te llamaremos al teléfono: "+persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
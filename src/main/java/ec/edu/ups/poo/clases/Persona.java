package ec.edu.ups.poo.clases;
public class Persona {
    // Atributos

    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;

    //* Constructores *
    // tiene que ser publicos || no regresa nada || tiene que tener el mismo nombre que la clase
    // Sirve para instanciar

    public Persona() {
        // Constructor vacío
    }

    public Persona(String nombre, String apellido, String cedula, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    // Getter and setter
    // Asignar datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: " + direccion;
    }
}

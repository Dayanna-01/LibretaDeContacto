package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;

public class Familiar extends Persona {
    // Atributos
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaNacimiento;

    // Constructores
    public Familiar() {
    }

    public Familiar(String nombre, String apellido, String cedula, String direccion, String parentesco, String tipoDeSangre, GregorianCalendar fechaNacimiento) {
        super(nombre, apellido, cedula, direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getter & Setters
    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Metodo para calcular la edad de las personas
    public int calcularEdad() {
        int anioActual = GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
        int anioNacimiento = fechaNacimiento.get(GregorianCalendar.YEAR);
        return (anioActual - anioNacimiento);
    }

    // Metodo toString
    @Override
    public String toString() {
        // Crear un formato de fecha para mostrar la fecha de nacimiento en formato DD/MM/YYYY
        int dia = fechaNacimiento.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = fechaNacimiento.get(GregorianCalendar.MONTH) + 1; // Los meses en GregorianCalendar son 0-indexados
        int anio = fechaNacimiento.get(GregorianCalendar.YEAR);

        // Devolver los datos con el formato de fecha corregido
        return super.toString() + "\nParentesco: " + parentesco
                + "\nTipo de sangre: " + tipoDeSangre
                + "\nFecha de nacimiento: " + dia + "/" + mes + "/" + anio;
    }
}

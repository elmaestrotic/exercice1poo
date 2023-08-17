public class Asignatura {
    // Attributes
    private String nombre;
    private double nota;

    // Constructor
    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getConcepto(Double nota) {
        if (nota >= 3.5) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota + "\n concepto"+getConcepto(nota)+ '}';
    }
}

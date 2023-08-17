import java.util.ArrayList;

public class Alumno {
    // Attributes
    private String nombre;
    private int edad;
    private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

    // Constructor
    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void addMateria(Asignatura asignatura) {
        boolean swiche = false;
        for (Asignatura a : asignaturas) {
            if (a.getNombre().equals(asignatura.getNombre())) {
                swiche = true;
                System.out.println("La asignatura ya existe");
                break;
            }
        }//fin del for|
        if (!swiche) {
            if (asignaturas.size() <= 4) {
                asignaturas.add(asignatura);
            } else {
                System.out.println("No se puede agregar más materias");
            }

        }
    }


    public double getPromedio() {
        double promedio = 0;
        for (Asignatura a : asignaturas) {
            promedio += a.getNota();
        }//fin del for
        return promedio / asignaturas.size();

    }//fin del metodo


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", asignaturas=" + asignaturas +
                '}';
    }


}//fin de la clase
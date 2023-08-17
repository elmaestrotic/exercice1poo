public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", 20);
        Alumno alumno2 = new Alumno("Pedro", 21);
        Alumno alumno3 = new Alumno("Maria", 22);


        alumno1.addMateria(new Asignatura("Matematicas", 3.5));
        alumno1.addMateria(new Asignatura("Física", 3.5));
        alumno1.addMateria(new Asignatura("Matematicas", 3.5));


        alumno2.addMateria(new Asignatura("Matematicas", 3.5));

        alumno3.addMateria(new Asignatura("Filosofía", 4.8));
        alumno3.addMateria(new Asignatura("Física", 3.5));

        System.out.println(alumno1);
        System.out.println(alumno1.getPromedio());
        System.out.println(alumno2);
        System.out.println(alumno2.getPromedio());
        System.out.println(alumno3);
        System.out.println(alumno3.getPromedio());
    }
}
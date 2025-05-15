package hashing;

public class Actas {

    private static String datosConcatenados = "";
    private static int numeroAlumnos;

    public static void main(String[] args) {

        Alumno alumnos[] = {
                new Alumno("carlos", "fernandez", 9, 1234),
                new Alumno("pepe", "gonzalez", 4, 1235)
        };

        numeroAlumnos = alumnos.length;
        concatenarDatos(alumnos);
        System.out.println("Hash generado: " + generarHash());
    }

    public static void concatenarDatos(Alumno alumnos[]) {
        for (int i = 0; i < alumnos.length; i++) {

            Alumno alumnoActual = alumnos[i];
            String nombre = alumnoActual.getNombre();
            String apellido = alumnoActual.getApellidos();
            int calificacion = alumnoActual.getCalificacion();
            int id = alumnoActual.getId();

            datosConcatenados += id + "|" + nombre + "|" + apellido + "|" + calificacion + "|" + id;

            if (i < alumnos.length - 1) {
                datosConcatenados += ";";
            }
        }

        System.out.println("Datos concatenados: " + datosConcatenados);
    }

    public static int generarHash() {

        int hash = 0;
        for (int i = 0; i < datosConcatenados.length(); i++) {
            char dato = datosConcatenados.charAt(i);
            hash = (hash * 31 + dato) % 1000000007;
        }

        return hash;
    }
}

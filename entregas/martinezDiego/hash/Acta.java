package entregas.martinezDiego.hash;

public class Acta {
    public static void main(String[] args) {
        DatosAlumno[] alumnos = {
        new DatosAlumno("Carlos", "Martínez", 12345678, "EDA2", 6.5, 8.4, 9.0),
        new DatosAlumno("Lucía", "Gómez", 87654321, "EDA2", 5.5, 7.2, 8.0),
        new DatosAlumno("Marcos", "Fernandez", 46678738, "EDA2", 5.8, 8.2, 6.0),
        };
       

        String hash = Hashing.generarHash(alumnos);
        System.out.println("Código hash: " + hash);
       
    }
}

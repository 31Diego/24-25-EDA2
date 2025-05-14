package hashing;

class Alumno {

    private String nombre;
    private String apellidos;
    private int calificacion;
    private int id;

    public Alumno(String nombre, String apellidos, int calificacion, int id) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.calificacion = calificacion;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
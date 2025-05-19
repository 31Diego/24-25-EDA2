package entregas.martinezDiego.hash;

class DatosAlumno {

    private String nombreAlumno;
    private String apellidosAlumno;
    private int idAlumno;
    private String asignatura;
    private double notaParcial;
    private double notaFinal;
    private double notaEV;

    public DatosAlumno(String nombreAlumno, String apellidosAlumno, int idAlumno, String asignatura, double notaParcial,
            double notaFinal, double notaEV) {
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.idAlumno = idAlumno;
        this.asignatura = asignatura;
        this.notaParcial = notaParcial;
        this.notaFinal = notaFinal;
        this.notaEV = notaEV;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidosAlumno() {
        return apellidosAlumno;
    }

    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getNotaEV() {
        return notaEV;
    }

    public void setNotaEV(double notaEV) {
        this.notaEV = notaEV;
    }

}


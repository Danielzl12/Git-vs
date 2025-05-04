import javax.swing.*;

public class Estudiante{
    //declaracion de variables de la clase
    String nombres;
    String carrera;
    String semestre;
    int codigoEstudiantil;
    int edad;

    //constructor de la clase #1 ya que asi lo pide la guìa (en este caso se separo entre string e int)
    public Estudiante(String nombres, String carrera, String semestre) {
        this.nombres = nombres;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    //contructor de la clase #2
    public Estudiante(int codigoEstudiantil, int edad) {
        this.codigoEstudiantil = codigoEstudiantil;
        this.edad = edad;
    }
    //instruccion para obtener y mostrar datos de la clase
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public int getCodigoEstudiantil() {
        return codigoEstudiantil;
    }
    public void setCodigoEstudiantil(int codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
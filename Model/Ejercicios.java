package Model;

public class Ejercicios {
    
    private String nombre;
    private String descripcion;
    private int repeticiones;
    private int series;

    public Ejercicios() {
    }

    public Ejercicios(String nombre, String descripcion, int repeticiones, int series) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

}

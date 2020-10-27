package casadeeventos;

public class PlazoletaDeComidas {//Agregación
    private String nombre;
    private int numeroDeMesas;
    private Boolean disponibleAlEvento;
    private Boolean orquesta;

    public PlazoletaDeComidas(String nombre, 
            int numeroDeMesas, 
            Boolean disponibleAlEvento, 
            Boolean orquesta) {
        this.nombre = nombre;
        this.numeroDeMesas = numeroDeMesas;
        this.disponibleAlEvento = disponibleAlEvento;
        this.orquesta = orquesta;
    }
    
}

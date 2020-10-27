package casadeeventos;

public class Bar extends PlazoletaDeComidas{//Agregación
    private String tiposDeBebidas;
    private String juegosYactividades;
    private String repertorioDeMusica;

    public Bar(String tiposDeBebidas, 
            String juegosYactividades, 
            String repertorioDeMusica, 
            String nombre, 
            int numeroDeMesas, 
            Boolean disponibleAlEvento, 
            Boolean orquesta) {
        super(nombre, numeroDeMesas, disponibleAlEvento, orquesta);
        this.tiposDeBebidas = tiposDeBebidas;
        this.juegosYactividades = juegosYactividades;
        this.repertorioDeMusica = repertorioDeMusica;
    }

}

package casadeeventos;

public class EquipoDeDecoracion {//Composición
    private String tipoDeEvento;
    private String maestroDeCeremonias;
    private int numeroDeMeseros;
    private String sonidoYtarimas;
    private Boolean planeadorDeBodas; 
    private Boolean bailarines; 
    private int numeroDeBailarines; 
    private String catering;

    public EquipoDeDecoracion(String tipoDeEvento, 
            String maestroDeCeremonias, 
            int numeroDeMeseros, 
            String sonidoYtarimas, 
            Boolean planeadorDeBodas, 
            Boolean bailarines, 
            int numeroDeBailarines, 
            String catering) {
        this.tipoDeEvento = tipoDeEvento;
        this.maestroDeCeremonias = maestroDeCeremonias;
        this.numeroDeMeseros = numeroDeMeseros;
        this.sonidoYtarimas = sonidoYtarimas;
        this.planeadorDeBodas = planeadorDeBodas;
        this.bailarines = bailarines;
        this.numeroDeBailarines = numeroDeBailarines;
        this.catering = catering;
    }
    
    
}

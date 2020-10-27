package casadeeventos;

import java.util.Date;

public class CasaDeEventos {

    private String direccion; /**Lugar donde se encuentra el salón*/
    private int cantidadDeEmpleados; /**Número de empleados disponibles*/
    private Date fechasReservadas; /**Fechas en las cuales el salón de 
     * eventos estará ocupado*/
    private Boolean estaFuncionando; /**Se confirma si el salón está 
     * disponible, al tener la cantidad requerida de empleados para 
     * atender los eventos*/
    private int aforoMáximo;/**Capacidad máxima de personas que el 
     * salón puede recibir*/
    //Atributos de Composición
    private PlazoletaDeComidas restaurante;
    private EquipoDeDecoracion eventoPrincipal; 
            
    public CasaDeEventos(
            String direccion, 
            int cantidadDeEmpleados, 
            Date fechasReservadas, 
            Boolean estaFuncionando, 
            int aforoMáximo) {
        this.direccion = direccion;
        this.cantidadDeEmpleados = cantidadDeEmpleados;
        this.fechasReservadas = fechasReservadas;
        this.estaFuncionando = estaFuncionando;
        this.aforoMáximo = aforoMáximo;
        this.restaurante = restaurante;
        this.eventoPrincipal = new EquipoDeDecoracion(
                "Boda",
                "Federico Lagos",
                30,
                "Dj Blue",
                true,
                true,
                18,
                "Catering Pamela y Asociados");
    }

    public PlazoletaDeComidas getCentroDeComidas() {
        return this.restaurante;
    }

    public void setCentroDeComidas(PlazoletaDeComidas sectorA) {
        this.restaurante = sectorA;
    }
    
    
    
    /**Este método tiene la función de cambiar 
     * la dirección de la casa de eventos y aumentar en 20 la 
     * capacidad de personas que puede recibir(aforo)
     * @param nuevaDireccion es la nueva ubicación del salón
     */
        
    public void cambiarDireccion(
            String nuevaDireccion){
        this.direccion = nuevaDireccion;
        this.aforoMáximo += 20  ;
    }
    
    /**Este metodo me permite cambiar la cantidad de empleados y
     * confirmar si la Casa de eventos tiene los empleados suficientes
     * para estar en funcionamiento, el cual debe ser un número mayor 
     * o igual a 10.
     * @param empleadosActuales es la nueva cantidad de empleados disponibles
     * en el salón
     */
    
    public void confirmarDisponibilidad(int empleadosActuales){
        this.cantidadDeEmpleados = empleadosActuales;
        if(empleadosActuales >= 10){
         this.estaFuncionando = true;
         }else{
         this.estaFuncionando = false;}
    }
     
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadDeEmpleados() {
        return cantidadDeEmpleados;
    }

    public void setCantidadDeEmpleados(int cantidadDeEmpleados) {
        this.cantidadDeEmpleados = cantidadDeEmpleados;
    }

    public Date getFechasReservadas() {
        return fechasReservadas;
    }

    public void setFechasReservadas(Date fechasReservadas) {
        this.fechasReservadas = fechasReservadas;
    }

    public Boolean getEstaFuncionando() {
        return estaFuncionando;
    }

    public void setEstaFuncionando(Boolean estaFuncionando) {
        this.estaFuncionando = estaFuncionando;
    }

    public int getAforoMáximo() {
        return aforoMáximo;
    }

    public void setAforoMáximo(int aforoMáximo) {
        this.aforoMáximo = aforoMáximo;
    }
    
    public static void main(String[] args) {
        CasaDeEventos salon1 = new CasaDeEventos(
                "Calle 20 #50-12",
                24,
                new Date(),
                true,
                30);
        CasaDeEventos salon2 = new CasaDeEventos(
                "Calle 20 #50-14",
                90,
                new Date(),
                true,
                110);
        
        
        System.out.println("---Trabajo 1---");
        System.out.println(salon1.getDireccion());
        System.out.println(salon1.getAforoMáximo());
        
        salon1.cambiarDireccion("calle 50 # 4-22");//METODO 1
        
        System.out.println(salon1.getDireccion());
        System.out.println(salon1.getAforoMáximo());
        
        System.out.println(salon2.getCantidadDeEmpleados());
        System.out.println(salon2.getEstaFuncionando());
        
        salon2.confirmarDisponibilidad(9);//METODO 2
        
        System.out.println(salon2.getCantidadDeEmpleados());
        System.out.println(salon2.getEstaFuncionando());
        
        
    }
}

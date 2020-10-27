package casadeeventos;

import java.util.Date;

public class ClubSocial extends CasaDeEventos{
    private int numeroDePersonas; /**Es la cantidad de personas que se van 
         a hospedar en el club*/
    private boolean piscina; /**Pregunta al cliente si desea tener acceso a
         las piscinas del club*/
    private int diasReservados; /**Es la cantidad de días que se van a 
         hospedar en el club*/

    public ClubSocial(
            String direccion, 
            int cantidadDeEmpleados, 
            Date fechasReservadas, 
            Boolean estaFuncionando,
            int aforoMáximo,
            int numeroDePersonas, 
            boolean piscina,
            int diasReservados) {
        super(
                direccion, 
                cantidadDeEmpleados, 
                fechasReservadas, 
                estaFuncionando, 
                aforoMáximo);
        this.numeroDePersonas = numeroDePersonas;
        this.piscina = piscina;
        this.diasReservados = diasReservados;
    }

        public void accesoPiscina(){
            if(this.numeroDePersonas >= 36){
                this.piscina = false;
                System.out.println("Lo sentimos, no podrá tener acceso a "
                        + "la piscina, solo estará disponible para los clientes "
                        + "que reserven para menos de 36 personas.");
            }else{
                this.piscina = true;
                System.out.println("Tendrá acceso a la piscina");
            }
        }
        
        public void minimaMaximaEstadia(){
            if(this.diasReservados <5){
                System.out.println("El mínimo de días para reservar no puede "
                        + "ser menor a 5"); 
            }else if(this.diasReservados >15){
                System.out.println("El máximo de dias para hospedarse en el "
                        + "club es de 15");
            }else{
                System.out.println("Gracias por hacer su reservación");
            }
        }
        
        public static void main(String[] args) {
            
            System.out.println("---Club Social Stelar---");
            
            ClubSocial clubStelar = new ClubSocial(
                    "Calle 22 #5-67", 
                    15, 
                    new Date(), 
                    true, 
                    12, 
                    40, 
                    true, 
                    3);
            clubStelar.minimaMaximaEstadia();
            clubStelar.accesoPiscina();
          
            System.out.println("---Club Social Melanea---");
            
            ClubSocial clubMelanea = new ClubSocial(
                    "Calle 35 #50-47", 
                    36, 
                    new Date(), 
                    true, 
                    80, 
                    20, 
                    true, 
                    30);
            clubMelanea.minimaMaximaEstadia();
            clubMelanea.accesoPiscina();
    } 
       
} 

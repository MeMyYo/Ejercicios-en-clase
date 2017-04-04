/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.gestion.hotelera;

/**
 *
 * @author Jorge
 */
public class CasoGestionHotelera {
    static Hotel h = new Hotel();
    public void menu(){
        int eleccion= Lector.validar();
        switch(eleccion){
            case 1: 
                h.reservar();
                break;
            case 2: h.ingresar();
                break;
            case 3: h.liberar();
                break;
            case 4: ;h.reiniciar();
                break;
            case 5: System.out.println("Apagando..."); System.exit(0);
            default : ;
                break;
        
        }
        //Elegir (ingresar, reservar, liberar)
        //Elegir (Reiniciar)
    }
    
    public void interactuar(){
        System.out.println("Ingrese con un numero del 1 al 4 la opcion que desea ejecutar:");
        System.out.println("1) Reservar una habitacion.");
        System.out.println("2) Ingresar una habitacion.");
        System.out.println("3) Liberar una habitacion.");
        System.out.println("4) Reiniciar el sistema.");
        System.out.println("5) Apagar el sistema.");
    }
    
    public void loop(){
        interactuar();
        menu();
        loop();
    }
    
    
    
    
    public static void main(String[] args) {
        CasoGestionHotelera main = new CasoGestionHotelera();
        main.loop();
        
        //Pedir especificaciones al test
        //Crear el Hotel
        //Usar el menu
    }
    
}

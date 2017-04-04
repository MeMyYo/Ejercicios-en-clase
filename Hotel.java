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
public class Hotel {
    Habitacion habi=new Habitacion();
    public Hotel(){
    }
    
    public void reservar(){
        System.out.println("Ingrese el numero de habitacion (entre 1-10)");
        int numero= Lector.validarHab();
        if (habi.getHab(0, numero)==0 || habi.getHab(0, numero)==1) {
            System.out.println("Ingrese el numero de noches a reservar");
            int noches= Lector.validarPos();
            habi.resHab(numero,noches);
        }else{System.out.println("Error, habitacion no disponible.");}
        
        //instanciar a la clase habitacion para que cambie su estado
        // a reservado
    }
    
    public void ingresar(){
        System.out.println("Ingrese el numero de habitacion");
        int numero= Lector.validarHab();
        if (habi.getHab(0, numero)==0 || habi.getHab(0, numero)==2) {
            System.out.println("Ingrese el numero de noches a ocupar");
            int noches= Lector.validarPos();
            habi.setHab(numero, noches);
        }else{System.out.println("Error, habitacion no disponible.");}

        //instanciar a la clase habitacion para que cambie su estado
        // a ocupado
    }
    
    public void liberar(){
        System.out.println("Ingrese el numero de habitacion");
        int numero= Lector.validarHab();
        if (habi.getHab(0, numero)==0 || habi.getHab(0, numero)==1) {
            habi.desHab(numero);
            
        }else{System.out.println("Error, habitacion no disponible.");}

        //instanciar a la clase habitacion para que cambie su estado
        // a disponible
        //al cambiar el estado imprimir boleta con cantidad de noches
        // y total a cancelar
    }
    
    public void reiniciar(){
        System.out.println("Ingrese contraseña");
        if (Lector.validar()==1234){habi.reinicio(); }else{ System.out.println("Contraseña incorrecta!");
        //Reinicia todos los estados y los establece en disponible
    }}
}

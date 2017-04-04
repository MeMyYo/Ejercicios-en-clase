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
public class Habitacion {
    private int hab[][];
    //estados X noches
    public Habitacion(){
        hab=new int[2][10];
    }
    
    public void setHab(int id, int noc){
        hab[0][id-1]=2;
        hab[1][id-1]=noc;
        System.out.println("Habitacion ocupada exitosamente.");
    }
    
    public void resHab(int id, int noc){
        hab[0][id-1]=1;
        hab[1][id-1]=noc;
        System.out.println("Habitacion reservada exitosamente.");
    }
    
    public void desHab(int id){
        System.out.println("-------------Boleta----------");
        System.out.println("Cantidad de noches: "+hab[1][id-1]);
        System.out.println("Costo total:        $"+40000*hab[1][id-1]);
        System.out.println("-----------------------------");
        hab[0][id-1]=0;
        hab[1][id-1]=0;
        System.out.println("Habitacion liberada exitosamente.");
        
    }
    
    public int getHab(int eleccion, int id){
        //entrega con 0 el estado de la habitacion (0,1,2)/(disponible,reservado,ocupado)
        //con 1 el numero de noches
        int a=0;
        switch(eleccion){
            case 1 : a= hab[0][id-1];
            break;
            case 2 : a= hab[1][id-1];
                break;
        }
        return a;
    }
    
    public void reinicio(){
        System.out.println("Reiniciando...");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                hab[i][j]=0;
            }
        }
        System.out.println("Reiniciado exitosamente");
    }
}

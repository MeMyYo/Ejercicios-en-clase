/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso.gestion.hotelera;

import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class Lector {
    static Scanner leer = new Scanner (System.in);
    
    public static String leer(){
        System.out.println("Ingrese un numero entero");
        String ans= leer.nextLine();
        return ans;
    }
    
    public static int validar(){
        boolean i=false;
        int var=0;
        while(i==false){
            try{
            var=Integer.parseInt(leer());
            i=true;
            }catch(Exception e){
                System.out.println("Error, ingrese solo numeros enteros (no espacios, simbolos ni vacio)");
            }
        }
        System.out.println("Numero aceptado");
        return var;
    }
    
    public static int validarPos(){
        boolean i=false;
        int var=0;
        while(i==false){
            try{
            var=Integer.parseInt(leer());
                if (var>0) {
                    i=true;
                }else{ System.out.println("Solo podemos permitir un numero de noches mayor a cero");}
            }catch(Exception e){
                System.out.println("Error, ingrese solo numeros enteros (no espacios, simbolos ni vacio)");
            }
        }
        System.out.println("Numero aceptado");
        return var;
    }
    
    public static int validarHab(){
        boolean i=false;
        int var=0;
        while(i==false){
            try{
            var=Integer.parseInt(leer());
                if (var>=1 && var<=10) {
                    i=true;
                }else{ System.out.println("Tenemos solo habitaciones enumeradas del 1 al 10");}
            }catch(Exception e){
                System.out.println("Error, ingrese solo numeros enteros (no espacios, simbolos ni vacio)");
            }
        }
        System.out.println("Numero aceptado");
        return var;
    }
}


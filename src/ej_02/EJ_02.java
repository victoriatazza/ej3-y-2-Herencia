/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_02;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rembe
 */
public class EJ_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Lavadora lavadora = new Lavadora();
//        lavadora.crearLavadora();
//
//        Televisor televisor = new Televisor();
//        televisor.crearTelevisor();
        List<Electrodomestico> bolsa = new ArrayList<>();
        
        int precioTotal=0, precioLav=0, precioTel=0;
     

        Lavadora lav1 = new Lavadora(20, 1000.0, "azul", 'A', 20); 
        Lavadora lav2 = new Lavadora(40, 1000.0, "amarillo", 'b', 90); 
        bolsa.add(lav1);
        bolsa.add(lav2);

        Televisor tv1 = new Televisor(32, false, 1000.0, "negro", 'D', 7);
        Televisor tv2 = new Televisor(50, true, 1000.0, "gris", 'E', 10);
        bolsa.add(tv1);
        bolsa.add(tv2);
        
  

        for (Electrodomestico aux : bolsa) {
            //electrodomestico.getClass();
            if (aux instanceof Lavadora) {
                aux.precioFinal();
                System.out.println(aux.getPrecio());
                precioLav += aux.getPrecio();
                
                
            }
            if (aux instanceof Televisor) {
                aux.precioFinal();
                System.out.println(aux.getPrecio());
                precioTel += aux.getPrecio();
                
            }
            
        }
        precioTotal += precioLav + precioTel;
        System.out.println("precio lavadora: " + precioLav + ",precio televisores: " + precioTel + ", precio total: " + precioTotal);
    }

}

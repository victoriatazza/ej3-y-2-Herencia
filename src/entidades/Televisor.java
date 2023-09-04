/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

//@author rembe
public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean tdt = true;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean tdt, Double precio, String color, Character consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        System.out.print("De cuantas pulgadas es?: ");
        resolucion = scan.nextInt();
        System.out.print("Tiene TDT: ");
        
        String ans = scan.next();
        if (ans.equalsIgnoreCase("no")) {
            tdt=false;
        }
        precioFinal();
        System.out.println(toString());
        
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion > 40) {
            precio = (precio * 1.3);
        }
        if (tdt) {
            precio = precio + 500;
        } 
    }

    @Override
    public String toString() {
        return "Televisor\n" + super.toString()+"\nResolucion= " + resolucion + "\nTDT= " + tdt;
    }

}

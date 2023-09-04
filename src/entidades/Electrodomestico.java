package entidades;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//@author rembe
public abstract class Electrodomestico {

    protected Double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Integer peso;
    Scanner scan;
    

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.
     */
    
//    protected char comprobarConsumoEnergetico(char letra) {
//        //letra = Character.toUpperCase(letra);
//        if (!(letra == 'A' || letra == 'a' || letra == 'B' || letra == 'b' || letra == 'C' || letra == 'c' || letra == 'D' || letra == 'd' || letra == 'E' || letra == 'e')) {
//            consumoEnergetico = 'F';
//        } else consumoEnergetico = letra;
//        return consumoEnergetico;
//    }
    
    protected char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (!(letra>= 'A'&& letra<='E')) {
            consumoEnergetico = 'F';
        } else consumoEnergetico = letra;
        return consumoEnergetico;
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    
    protected String comprobarColor(String color) {
        if (!(color.equalsIgnoreCase("blanco")) || !(color.equalsIgnoreCase("negro")) || !(color.equalsIgnoreCase("azul")) || !(color.equalsIgnoreCase("rojo")) || !(color.equalsIgnoreCase("gris"))) {
            this.color = "blanco";
        }
        return color;
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.
     */
    
    protected void crearElectrodomestico() {
        scan = new Scanner(System.in);
        precio = 1000.0;
        System.out.println("Bienvenidos a su tienda el CortoCircuito ");
        System.out.print("Digite el color: ");
        color = scan.next();
        System.out.print("Letra del consumo energetico: ");
        Character letra = scan.next().toUpperCase().charAt(0);
        consumoEnergetico = comprobarConsumoEnergetico(letra);
        System.out.print("Escriba el peso: ");
        peso = scan.nextInt();
        comprobarColor(color);
    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
     */
    public void precioFinal() {
        //Double precio;
        switch (consumoEnergetico) {
            case 'A':
                precio = 1000 + precio;
                break;
            case 'B':
                precio = 800 + precio;
                break;
            case 'C':
                precio = 600 + precio;
                break;
            case 'D':
                precio = 500 + precio;
                break;
            case 'E':
                precio = 300 + precio;
                break;
            case 'F':
                precio = 100 + precio;
                break;
        }
        
        if (peso >= 1 && peso <= 19) {
            precio = 100 + precio;
        } else if (peso >= 20 && peso <= 49) {
            precio = 500 + precio;
        } else if (peso >= 50 && peso <= 79) {
            precio = 800 + precio;
        } else if (peso >= 80) {
            precio = 1000 + precio;
        }
    }

    @Override
    public String toString() {
        return "Precio= " + precio + "\nColor= " + color + "\nConsumo Energetico= " + consumoEnergetico + "\nPeso= " + peso;
    }
}

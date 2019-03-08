/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposVehiculos;

/**
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 */
public class Bicicleta extends Vehiculo{
    private int numeroPiñones;

    public Bicicleta(int numeroPiñones, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPiñones = numeroPiñones;
    }

    @Override
    public void informacionVehiculo(){
        System.out.println("\t +>Informacion sobre la MTB.");
    }
    
    public void metodoPropioBicicleta() {
        System.out.println("Metodo principal de la MTB.");
    }

    public int getNumeroPiñones() {
        return numeroPiñones;
    }

    public void setNumeroPiñones(int numeroPiñones) {
        this.numeroPiñones = numeroPiñones;
    }
}

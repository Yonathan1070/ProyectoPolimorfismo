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
public class Jet extends VehiculoConMotor{
    private int numeroMotores;

    public Jet(int numeroMotores, String tipoCombustible, String marca, String modelo) {
        super(tipoCombustible, marca, modelo);
        this.numeroMotores = numeroMotores;
    }
    
    @Override
    public void informacionVehiculo(){
        System.out.println("\t +>Información sobre el Jet.");
    }
    
    public void metodoPrincipalJet(){
        System.out.println("Metodo principal del Jet.");
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }
}

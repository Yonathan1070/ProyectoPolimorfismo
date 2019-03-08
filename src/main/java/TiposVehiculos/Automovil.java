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
public class Automovil extends VehiculoConMotor{
    private float cilindrajeMotor;

    public Automovil(float cilindrajeMotor, String tipoGasolina, String marca, String modelo) {
        super(tipoGasolina, marca, modelo);
        this.cilindrajeMotor = cilindrajeMotor;
    }
    
    @Override
    public void informacionVehiculo(){
        System.out.println("\t+> Información sobre el Automovil.");
    }
    public void metodoPincipalAutomovil(){
        System.out.println("Metodo principal del Automovil");
    }

    public float getCilindrajeMotor() {
        return cilindrajeMotor;
    }

    public void setCilindrajeMotor(float cilindrajeMotor) {
        this.cilindrajeMotor = cilindrajeMotor;
    }
}

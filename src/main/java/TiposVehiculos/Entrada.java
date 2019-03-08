/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposVehiculos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 */
public class Entrada {
    List <Vehiculo> listadoVehiculos=new ArrayList<>();
    
    Vehiculo tablaSkate =new TablaSkate((float) 78.5,"ZERO FAN","2019");
    Vehiculo mtb= new Bicicleta(10,"X-Calibre 8","2019");
    Vehiculo carro=new Automovil(1600,"Gasolina","Hiunday Accent","2010");
    Vehiculo jet=new Jet(2,"ATF","Airbus ","ACJ319");
    
    public Entrada(){
        listadoVehiculos.add(tablaSkate);
        listadoVehiculos.add(mtb);
        listadoVehiculos.add(carro);
        listadoVehiculos.add(jet);
        
        for (Vehiculo vehiculos : listadoVehiculos) {
            if(vehiculos instanceof Automovil){
                Automovil automovil=(Automovil)vehiculos;
                automovil.metodoPincipalAutomovil();
                automovil.informacionVehiculo();
                System.out.println("\t\t ->"+automovil.getMarca());
                System.out.println("\t\t ->"+automovil.getModelo());
                System.out.println("\t\t ->"+automovil.getTipoCombustible());
                System.out.println("\t\t ->"+automovil.getCilindrajeMotor());
            }
            else if(vehiculos instanceof Jet){
                Jet jet=(Jet)vehiculos;
                jet.metodoPrincipalJet();
                jet.informacionVehiculo();
                System.out.println("\t\t ->"+jet.getMarca());
                System.out.println("\t\t ->"+jet.getModelo());
                System.out.println("\t\t ->"+jet.getNumeroMotores());
                System.out.println("\t\t ->"+jet.getTipoCombustible());
            }
            else if(vehiculos instanceof Bicicleta){
                Bicicleta bici=(Bicicleta)vehiculos;
                bici.metodoPropioBicicleta();
                bici.informacionVehiculo();
                System.out.println("\t\t ->"+bici.getMarca());
                System.out.println("\t\t ->"+bici.getModelo());
                System.out.println("\t\t ->"+bici.getNumeroPiñones());
            }
            else if(vehiculos instanceof TablaSkate){
                TablaSkate tabla=(TablaSkate)vehiculos;
                tabla.metodoPropioTablaSkate();
                tabla.informacionVehiculo();
                System.out.println("\t\t ->"+tabla.getMarca());
                System.out.println("\t\t ->"+tabla.getModelo());
                System.out.println("\t\t ->"+tabla.getLargoTablaSkate());
            }
        }
    }
}

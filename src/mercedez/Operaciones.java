/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercedez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Operaciones {
    
    private ArrayList<Auto> autos = new ArrayList();
    private double impuestoTotal = 0;
    
    public void ejecuta(){
        Auto x = new Auto();
        do{
            x = crearAuto();
        }while(x != null);
        System.out.println("La cantidad recaudada es:");
        System.out.println(impuestoTotal);
    }
    
    public Auto crearAuto(){
        Auto auto = new Auto();
        String placa;
        double valorAuto;
        int clave;
        double impuesto;
        String porcentaje;
        Scanner op = new Scanner(System.in);
        System.out.println("******** Bienvenido ********");
        System.out.println("Introduzca la placa del auto");
        placa = op.nextLine();
        if(placa.equals("0")){
            return null;
        }
        System.out.println("Introduzca el valor del auto");
        valorAuto = op.nextDouble();
        do{
            System.out.println("Introduzca la clave del auto");
            clave = op.nextInt();
            impuesto = pago(valorAuto, clave);
        }while(impuesto == 0);
        porcentaje = porcentaje(clave);
        auto.setPlaca(placa);
        auto.setValorAuto(valorAuto);
        auto.setClave(clave);
        auto.setPorcentaje(porcentaje);
        auto.setMontoImpuesto(impuesto);
        autos.add(auto);
        impuestoTotal = impuestoTotal + impuesto;
        System.out.println("Registro añadido");
        System.out.println(auto);
        return auto;
    }
    
    public double pago(double valor, int clave){
        double cantidadImpuesto = 0;
        switch(clave){
            case 1:
                cantidadImpuesto = (valor * 0.10);
            break;
            case 2:
                cantidadImpuesto = (valor * 0.07);
            break;
            case 3:
                cantidadImpuesto = (valor * 0.05);
            break;
            default:
                System.out.println("La clave no es correcta, intente de nuevo");
                cantidadImpuesto = 0;
            break;
        }
        return cantidadImpuesto;
    }
    
    public String porcentaje( int clave ){
        String porcentaje ="";
        switch ( clave ){
            case 1:
                porcentaje = "10 %";
            break;
            case 2:
                porcentaje = "7 %";
            break;
            case 3:
                porcentaje = "5 %";
            break;
        }
        return porcentaje;
    }
    
}

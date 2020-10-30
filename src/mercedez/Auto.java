/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercedez;

/**
 *
 * @author erick
 */
public class Auto {
    private String placa;
    private int clave;
    private double valorAuto;
    private double montoImpuesto;
    private String porcentaje;

    public Auto() {
    }

    public Auto(String placa, int clave, double valorAuto, double montoImpuesto, String porcentaje) {
        this.placa = placa;
        this.clave = clave;
        this.valorAuto = valorAuto;
        this.montoImpuesto = montoImpuesto;
        this.porcentaje = porcentaje;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public double getValorAuto() {
        return valorAuto;
    }

    public void setValorAuto(double valorAuto) {
        this.valorAuto = valorAuto;
    }

    public double getMontoImpuesto() {
        return montoImpuesto;
    }

    public void setMontoImpuesto(double montoImpuesto) {
        this.montoImpuesto = montoImpuesto;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
    

    @Override
    public String toString() {
        return "Placa: " + placa + " Clave: " + clave + " Valor Auto: " + valorAuto + "Porcentaje: " + porcentaje + " Monto Impuesto: " + montoImpuesto;
    }
    
    
    
}

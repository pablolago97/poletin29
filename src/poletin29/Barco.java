/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poletin29;

/**
 *
 * @author oracle
 */
public abstract class Barco {

    public Barco(int ddc, String matricula, String eslora, float precio) {
        this.ddc = ddc;
        this.matricula = matricula;
        this.eslora = eslora;
        this.precio = precio;
    }

    public Barco() {
    }
    
    private int ddc;
    private String matricula;
    private String eslora;
    private float precio;
    
    public int calcularModulo(String eslora){
        return ddc*(Integer.parseInt(eslora)*10);
    }
}

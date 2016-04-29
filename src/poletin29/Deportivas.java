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
public class Deportivas extends Barco {

    public Deportivas(float potenciaCV, String eslora) {
        this.potenciaCV = potenciaCV;
        this.eslora = eslora;
    }

    public Deportivas() {
    }
    
    private float potenciaCV;
    private String eslora;
    
    @Override
    public int calcularModulo(String eslora) {
        return super.calcularModulo(this.eslora); //To change body of generated methods, choose Tools | Templates.
    }
    
}

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
public class Yates extends Barco {

    public Yates(float potenciaCV, int num_camarotes, String eslora) {
        this.potenciaCV = potenciaCV;
        this.num_camarotes = num_camarotes;
        this.eslora = eslora;
    }

    public Yates() {
    }
    
    private float potenciaCV;
    private int num_camarotes;
    private String eslora;
    
    @Override
    public int calcularModulo(String eslora) {
        return super.calcularModulo(this.eslora); //To change body of generated methods, choose Tools | Templates.
    }
    
}

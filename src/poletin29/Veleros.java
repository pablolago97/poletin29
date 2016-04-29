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
public class Veleros extends Barco {

    public Veleros(int numeroMastiles, String eslora) {
        this.numeroMastiles = numeroMastiles;
        this.eslora = eslora;
    }

    public Veleros() {
    }
    
    private int numeroMastiles;
    private String eslora;
    
    @Override
    public int calcularModulo(String eslora) {
        return super.calcularModulo(this.eslora); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jgmontoya
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SerVivo s=new Humano();
        s.comunicarse();
        
        s=new Pato();
        s.comunicarse();
        
        s=new Perro();
        s.comunicarse();        
    }
    
    
    
}

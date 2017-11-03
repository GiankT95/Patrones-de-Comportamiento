/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronInterpreter;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contexto contexto = new Contexto();
        ArrayList<Expresion> arbol = new ArrayList();
        
        ArrayList<String> cadena = new ArrayList();
        
        cadena.add("dos");
        cadena.add("mas");
        cadena.add("dos");
        
        for(String s : cadena){
        
            if(contexto.devuelveEntero(s)>=0){
                arbol.add(new ExpresionNumerica(s));
            }
            else{
                arbol.add(new ExpresionOperacion(s));
            }
            
        }
        
        for(Expresion e : arbol){
            e.interpretar(contexto);
        }
        
        System.out.println("El resultado de la interpretacion es: " + contexto.getResultado());
        
    }
    
}

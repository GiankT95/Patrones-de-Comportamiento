/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronInterpreter;

/**
 *
 * @author Asus
 */
public class ExpresionNumerica implements Expresion{

    private String valor;
    
    public ExpresionNumerica (String valor){
        this.valor = valor;
    }
    
    @Override
    public void interpretar(Contexto contexto) {
     
        contexto.setOperador(contexto.devuelveEntero(this.valor));
        contexto.calcular();
    }
    
}

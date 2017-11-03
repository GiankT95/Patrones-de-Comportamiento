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
public class ExpresionOperacion implements Expresion{
    
    private String operacion;
    
    public ExpresionOperacion (String operacion){
        this.operacion = operacion;
    }

    @Override
    public void interpretar(Contexto contexto) {
        
        contexto.setOperacion(this.operacion);
        contexto.calcular();
        
    }
    
    
    
}

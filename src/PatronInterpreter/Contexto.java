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
public class Contexto {

    private String sigOp = "";

    private int operador = 0;

    private int resultado = 0;

    public int devuelveEntero(String entero) {

        int a = 0;
        
        switch (entero){
            
            case "cero":
                a = 0;
                break;
            
            case "uno":
                a = 1;
                break;
                
            case "dos":
                a = 2;
                break;
                
            case "tres":
                a = 3;
                break;
                
            case "cuatro":
                a = 4;
                break;
                
            case "cinco":
                a = 5;
                break;
                
            case "seis":
                a = 6;
                break;
                
            case "siete":
                a = 7;
                break;
                
            case "ocho":
                a = 8;
                break;
                
            case "nueve":
                a = 9;
                break;
        }

        return a;
    }

    public void setOperador(int operador) {

        this.operador = operador;

    }

    public void setOperacion(String operation) {

        if (operation.toLowerCase().equals("mas")) {
            this.sigOp = "+";
        } 
        else if (operation.toLowerCase().equals("menos")) {
            this.sigOp = "-";
        }

    }

    public void calcular() {

        if (this.sigOp.toLowerCase().equals("") || this.sigOp.toLowerCase().equals("+")) {
            this.resultado += operador;
        } 
        else if (this.sigOp.toLowerCase().equals("-")) {
            this.resultado -= operador;
        }

    }

    public int getResultado() {

        return this.resultado;

    }

}

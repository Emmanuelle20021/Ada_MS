/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbotcontrol;

import Exception.AdamSandlerException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class Control {
    public static String contestar(String frase){
        frase = frase.toLowerCase();
        if(frase.equals("hazme una pregunta")){
            return hacerPregunta();
        }
        if(frase.equals("adam sandler")){
            AdamSandlerException adam = new AdamSandlerException();
            adam.setVisible(true);
            // throw adam sandler exception.
            return "Adam Sandler, ¿Dónde?";
        }
        for(int i = 0; i< Datos.preguntas.length; i++){
            if(Datos.preguntas[i].contains(frase)){
                if(Datos.Mrespuestas[i]!=true){
                    Datos.Mrespuestas[i] = true;
                    return Datos.respuestas[i];
                }
                else{
                    Datos.Mrespuestas[i] = false;
                    return "Ya te conteste eso";
                }
            }
        }
        int numeroR = (int)(Math.random()*Datos.desconocido.length);
        return Datos.desconocido[numeroR];
    }
    
    public static String hacerPregunta(){
        for(int i = 0; i<Datos.preguntas.length; i++){
            if(Datos.Mpreguntas[i]!=true && i != 10 && i != 11 && i != 13 && i != 14 && i != 16 && i != 18 && i != 20){
                Datos.Mpreguntas[i] = true;
                return Datos.preguntas[i];
            }
        }
        //throw adam sandeler exception
        AdamSandlerException adam = new AdamSandlerException();
        adam.setVisible(true);
        return "Toma Adam Sandler";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author student
 */
public class Friday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Jest piątek. Blisko do weekendu";
    }
    
    @Override
    public String createMainMessage() {
        return "Końcówka pracy";
    }
    
    @Override
    public String createClosingMessage() {
        return "Początek weekendu";
    }
}

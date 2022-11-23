/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author student
 */
public class Saturday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Sobota.";
    }
    
    @Override
    public String createMainMessage() {
        return "Spokojny dzień";
    }
    
    @Override
    public String createClosingMessage() {
        return "Weekend mija";
    }
}

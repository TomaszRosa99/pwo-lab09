/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.composite;

/**
 *
 * @author student
 */
public class Pokrywa extends WaterSystem {
    @Override
    public void fill() {
        super.fill();
        System.out.println("Otwieram pokrywe");
    }


    @Override
    public void afterDrain() {
        super.afterDrain();
        System.out.println("Zamykam pokrywę");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userinterface;

import java.util.Random;

/**
 *
 * @author calinbora
 */
public class choiceGame {
    
    private static int computerChoice;
    
    public choiceGame(){
        
        choiceComputer();
        
        
    }
    
    private void choiceComputer(){
        
        Random random = new Random();
        
        computerChoice = random.nextInt(3);
        
    }
    
    public static int getcomputerChoice(){
        
        return computerChoice;
        
    }
    
}

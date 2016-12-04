/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3050_assignment;

/**
 *
 * @author Alex
 */
public class Shark {
    public int[] position = {0, 0}; // Default values of {0, 0}
    public int[] velocity = {0, 0}; // Default values of {0, 0}
    public int time = 0; 
    
    
    public void Shark(int[] position, int[] velocity){
        this.position = position;
        this.velocity = velocity;
    }
}

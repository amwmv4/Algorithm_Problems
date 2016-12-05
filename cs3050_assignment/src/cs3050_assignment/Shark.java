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
    
    
    public void printShark(){
        System.out.printf("Position: %d, %d Velocity: %d, %d\n", position[0], position[1], velocity[0], velocity[1]);
    }
    
    public void setVelocity(int[] velocity){
        this.velocity = velocity;
    }
    
    public void setPosition(int[] position){
        this.position = position;
    }
    
    public void nextPosVel(int[] dim, Shark shark){
        
        // Make new position array to be used temporarily
        int[] positionTemp = new int[2];
        positionTemp[0] = position[0];
        positionTemp[1] = position[1];
                
        // Make new velocity array to be used temporarily
        int[] velocityTemp = new int[2];
        velocityTemp[0] = velocity[0];
        velocityTemp[1] = velocity[1];
        
        // Initialize variables for changing direction
        int changeV = 1;
        int changeH = 1;
        
        // FIND VERTICAL POSITION
        while(velocityTemp[0] != 0){
            // Are you going up?
            if(velocityTemp[0]<0){
                // Are you at the top of the map?
                if(positionTemp[0] == 0){
                    velocityTemp[0] = velocityTemp[0]*-1; // Change direction of velocityTemp
                    changeV = changeV*-1;
                }
            }else{ // you must be moving down
                if(positionTemp[0] == dim[0]){
                    velocityTemp[0] = velocityTemp[0]*-1; // Change direction of velocityTemp
                }
            }
            
            // Increment the positionTemp by 1 and subtract 1 from the velocityTemp
            if(velocityTemp[0]>0){
                --velocityTemp[0];
                ++positionTemp[0];
            }else{
                ++velocityTemp[0];
                --positionTemp[0];
            }
        }
        
        while(velocityTemp[1] != 0){
            
            // FIND HORIZTONAL POSITION
            // Are you going left?
            if(velocityTemp[1]<0){
                // Are you at the leftmost of the map?
                if(positionTemp[1] == 0){
                    velocityTemp[1] = velocityTemp[1]*-1; // Change direction of velocityTemp
                    changeH = changeH*-1;
                }
            }else{ // you must be moving right
                if(positionTemp[1] == dim[1]){
                    velocityTemp[1] = velocityTemp[1]*-1; // Change direction of velocityTemp
                }
            }
            
            // Increment the position by 1 and subtract 1 from the velocityTemp
            if(velocityTemp[1]>0){
                --velocityTemp[1];
                ++positionTemp[1];
            }else{
                ++velocityTemp[1];
                --positionTemp[1];
            }

        }
        
        // Set position of other shark
        shark.setPosition(positionTemp);
        
        // Reset velocityTemp value
        velocityTemp[0] = velocity[0]*changeV;
        velocityTemp[1] = velocity[1]*changeH;
        
        // Set input shark velocity values
        shark.setVelocity(velocityTemp);
    }
}

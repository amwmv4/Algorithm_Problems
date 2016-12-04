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
public class Node {
    
    public int[] position;
    public int time;
    public Node prev_node;

    public void Node(int[] position, int time){
        this.position = position;
        this.time = time;
        this.prev_node = null;
    }
    
    public void Node(int[] position, int time, Node prev_node){
        this.position = position;
        this.time = time;
        this.prev_node = prev_node;
    }
    
    
    
    
}

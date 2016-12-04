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
public class Cs3050_assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // First declare Shark Objects
       Shark shark_1 = new Shark();
       shark_1.Shark(new int[]{1,0}, new int[]{1,1});
       
       Shark shark_2 = new Shark();
       shark_2.Shark(new int[]{5,7}, new int[]{0,-1});
       
       // Initialize Squares
       Square[][] squares = new Square[10][10];
       
       // Assign Robot to position
       squares[0][0].state = State.RED;
       int[] s_position = new int[] {0,0};
       Node nodeStart = new Node();
       nodeStart.Node(s_position, 0);
       squares[0][0].node = nodeStart;
       
       // Assign Finish Line for Robot
       squares[9][9].state = State.GREEN;
       int[] e_position = new int[] {9,9};
       Node nodeEnd = new Node();
       nodeEnd.Node(e_position, 0);
       squares[9][9].node = nodeEnd;
       
       
    }
    
}

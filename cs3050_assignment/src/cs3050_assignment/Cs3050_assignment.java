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
        
       // Initialize Squares, will be a 3 dimensional array 
       Square[][][] squares = new Square[2][10][10];
       int[] dim = {9,9}; // dimensions of squares, will use later
       
       // Now put the actual square objects in the squares
       for(int i=0; i<2; i++ ){
            for(int j=0; j<10; j++){
                for(int k = 0; k<10; k++){
                    squares[i][j][k] = new Square();
                }
            }
       }
       
       // Assign Robot to position
       squares[0][0][0].setState(State.RED);
       
       int[] s_position = new int[] {0,0};
       Node nodeStart = new Node();
       nodeStart.Node(s_position, 0);
       squares[0][0][0].node = nodeStart;
       
       // Assign Finish Line for Robot
       squares[0][9][9].state = State.GREEN;
       int[] e_position = new int[] {9,9};
       Node nodeEnd = new Node();
       nodeEnd.Node(e_position, 0);
       squares[0][9][9].node = nodeEnd;
       
       // Declare Shark Objects
       
       // SHARK 1
       Shark[] shark_1 = new Shark[2];
       for(int i=0; i<2; i++){
           shark_1[i] = new Shark();
           shark_1[i].Shark(new int[]{1,0}, new int[]{12,1});
       }
       
       // SHARK 2
       Shark[] shark_2 = new Shark[2];
       for(int i=0; i<2; i++){
           shark_2[i] = new Shark();
           shark_2[i].Shark(new int[]{5,7}, new int[]{0,-9});
       }
       
       // Set shark spaces to BLACK on squares[0] or board 1
       squares[0][shark_1[0].position[0]][shark_1[0].position[1]].setState(State.BLACK);
       squares[0][shark_2[0].position[0]][shark_2[0].position[1]].setState(State.BLACK);
       
       
       /*
       shark_1[0].printShark();
       shark_2[0].printShark();
       // Find the position of the sharks
       shark_1[0].nextPosVel(dim, shark_1[1]);
       shark_2[0].nextPosVel(dim, shark_2[1]);
       
       shark_1[0].printShark();
       shark_2[0].printShark();
       
       shark_1[1].printShark();
       shark_2[1].printShark();
       */
       
    int boardNum = 0; // will be used to switch between sharks and boards
    int processing = 1; // will be used to see if we can still process pieces, when 0 stop while loop and return nothing\
    Node last = null;
    // make sure to set processing to 0 at the beginning of each loop process
    
    
    while(processing==1){
        processing = 0; // Reset processing variable
        
        squares[0]
        
        // Change board state to process next board
        if(boardNum == 1){
            boardNum = 0;
        }else{
            boardNum = 1;
        }
        
    }
    /*
    1. Process green spaces first 
    2. process sharks: find new sharks and assign them to new board positions
    3. process nodes (find all possible positions that it could go)
        1. based off of current position, return set of arrays (make this built in function for node with params: dim)
        2. if NULL, process next (if not null, set processing  
        3. check to see if node on new board is black (if so, go to next)
        4. check to see if node on new board (if state is WHITE, add to board)
        5. check to see if node on new board is GREEN (if so, make new node with position pointing to node and BREAK loop)
    ,   6. else process next until nothing left
        7. Rinse and repeat
    
    4. If last == null, return dead man, else print nodes
    
    */   
       
    }
    
}

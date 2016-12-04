package cs3050_assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public enum State {
    BLACK,
    WHITE,
    RED,
    BLUE,
    GREEN
}

/* 

0. BLACK - shark is there
1. WHITE - nothing is there
2. RED - robot there, not processed
3. BLUE - robot there, already processed
4. GREEN - finish line

*/

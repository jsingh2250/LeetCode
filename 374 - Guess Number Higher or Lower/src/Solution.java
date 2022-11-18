/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int getMiddleNumber(int lowNumber, int highNumber) {
        // Pick the middle number in the range of numbers between the low number and the high number. Find the middle number in a way that prevents rollover.
        return ((highNumber - lowNumber) / 2 + lowNumber);
    }
    
    public int guessNumber(int n) {
        // Declare variables that store the low number and high number from the range of possible numbers that the guess number should be within.
        int lowNumber = 1;
        int highNumber = n;
        
        // Declare a variable to store the guess number.
        int guessNumber;
        
        // Declare a variable that'll store whether the guessed number is the correct number.
        int guessResult;
        
        // Guess numbers in the middle of the range of possible numbers. If the guessed number is incorrect, modify the range of possible numbers based on the feedback received. Repeat this process until the feedback indicates that the guessed number is correct.
        do {
            guessNumber = getMiddleNumber(lowNumber, highNumber);
            guessResult = guess(guessNumber);
            
            if (guessResult == -1) {
                highNumber = guessNumber - 1;
            }
            else if (guessResult == 1) {
                lowNumber = guessNumber + 1;
            }
            
        } while (guessResult != 0);
        
        // Return the correctly guessed number.
        return guessNumber;
    }
}
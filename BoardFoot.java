/****************************************************************************
 * Created by: Wendi Yu
 * Created on: Feb 18 2019
 * Created for: ICS4U
 * This program user need to input the length and width,
 *  it will calculates the height of a board foot.
 ****************************************************************************/

import java.util.Scanner;

public class BoardFoot {

    public static void main(String[] arg) {
    	
    	// properties
    	
        double length;
        double width;
        double height;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please, enter the length of the board foot in inches: ");
		length = userInput.nextDouble();
		
		System.out.println("Please, enter the width of the board foot in inches: ");
		width = userInput.nextDouble();
		
		height = boardFoot(length, width);
		
		// width and length can not equal 0 or negative
		if(length <= 0 || width <= 0 ) {
			System.out.println("Invalid input! Please, put a positive and not 0 number for width and length.");
		}
		
		else {
		System.out.print("The height of the board foot is " + height + " inches.");
		
		}
	}
	
	public static double boardFoot(double length, double width) {
		
			// properties
		
			double height;
			double VOLUME;
			
			VOLUME = 144;
			// round decimal to 3 place
			height = Math.round(((VOLUME / length) / width)*1000.0)/1000.0;
			
			return height;
		}
	}


//ykaner productions
//
//designed by Yosef Kaner
//all rights reserved

import java.util.*;

public class PiExecution
{
	public static void main(String[] args) {
				
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		
		long totalPoints = 10000000;
		String cmd = "continue";
		System.out.println("instructions: ");
		System.out.println("exit    stop");
		System.out.println("go      continue executing");
		System.out.println();
		System.out.println("start?");
		in.next();
		System.out.println("start executing Pi");
		while(!cmd.equals("exit")){
		    totalPoints *= 1.1;
    		long insidePoints = 0;
    		double x, y;
    		for(long i = 0; i < totalPoints; i++){
    		    x = rnd.nextDouble();
        		y = rnd.nextDouble();
        		//randoming a point (x, y) in the square [(0, 0), (1, 1)]
        		
        		if(distBetweenPoints(x, y, 0.5, 0.5) < 0.5){
        		    //if the point is inside the incircled circle of the square
    		        insidePoints++;
        		}
    		}
    		
    		//totalPoints = square area = 1*1 = 1
    		//insidePoints = circle area = pi*r^2
    		//where r is raius of the defined circle, r=0.5
    		
    		//circle area/square area = pi*r^2/1
    		//pi = (insidePoints/totalPoints)/r^2
    				
    		double pi = (double)insidePoints/totalPoints;
    		pi *= 4; // division by r^2
    		
    		System.out.println("for this time pi executed as: " + pi);
    		System.out.println("for exit type : \"exit\"");
    		cmd = in.next();
    		
		}
		
	}
	
	//@return the distance between two points
	public static double distBetweenPoints(double x1, double y1, double x2, double y2){
	    return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));//pythagoras
	}
	
}
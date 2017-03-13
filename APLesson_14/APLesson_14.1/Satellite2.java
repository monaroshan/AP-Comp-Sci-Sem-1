import java.util.ArrayList;
import java.util.Arrays;
public class Satellite2 
{
    public static void main(String[]args) 
	{
        ArrayList<Car> locate = new ArrayList<>();
        double[] position = new double[6];
       
	   for(int i = 0; i < 6; i++) 
		{
        	position[i] = Math.round((double)(Math.random() * 100) + 1);
        }
        
		double[] hLoc = {5, 6};
		
        locate.add(new Honda2(hLoc));
        locate.add(new Toyota2("8, 9"));
        locate.add(new GMC2(3, 8));
        int i = 0;
       
	   for(Car l : locate) 
		{
        	l.move(position[i], position[i+1]);
        	i += 2;
        }
        
		double[] home = {0, 0};
        String printout = "==========================\n" + "\nStarting locations: ";
        
		for(Car l : locate) 
		{
            printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
        }
        printout += "\n\n" + "==========================";
        i = 0;
        
		for(Car l : locate) 
		{
            double[] newPos = l.getLoc();
            double x = newPos[0], y = newPos[1];
            printout += "\n\nAfter " + l.getID() + " moved (" + position[i] + ", " + position[i+1] + ")"
            + "\nNew location: " + "(" + x + ", " + y + ")" + "\n";
            i += 2;
        }
        printout += "\n" + "==========================" + "\nDistance from home...";
        
		for(Car l : locate) 
		{
            printout += "\n\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
        }
        System.out.println(printout);
    }
	
    public static double getDistance(double[] car, double[] home) 
	{
        return Math.round(Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2))));
    }
	
    public static String getLocation(double[] Loc) 
	{
        return Loc[0] + ", " + Loc[1];
    }
}
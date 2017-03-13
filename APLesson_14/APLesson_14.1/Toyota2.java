import java.util.ArrayList;
import java.util.Arrays;
public class Toyota2 extends Car 
{
	private double xCoord;
	private double yCoord;
	
    public Toyota2(String pos) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
        Double posX = Double.parseDouble(position.get(0));
		Double posY = Double.parseDouble(position.get(1));
        move(posX, posY);
    }
	
    public void move(double x, double y) 
	{
        this.xCoord += x;
        this.yCoord += y;
    }
	
    public double[] getLoc() 
	{
        double[] location = {xCoord, yCoord};
        return location;
    }
}
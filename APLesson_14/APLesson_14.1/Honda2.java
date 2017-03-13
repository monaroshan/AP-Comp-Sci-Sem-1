public class Honda2 extends Car 
{
    private double xCoord;
	private double yCoord;
	
    public Honda2(double[] pos) 
	{
        super();
        move(pos[0], pos[1]);
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
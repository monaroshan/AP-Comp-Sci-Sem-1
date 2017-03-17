public class Honda extends Car 
{
    private double xCoord;
	private double yCoord;
	
    public Honda(double[] pos) 
	{
        super();
        move(pos[0], pos[1]);
    }
}
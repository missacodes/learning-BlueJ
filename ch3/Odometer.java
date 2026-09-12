public class Odometer
{
    private NumberDisplay miles;
    
    public Odometer() 
    {
        miles = new NumberDisplay(10000);
    }
    
    public void addMile()
    {
        miles.increment();
    }
}
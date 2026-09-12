public class Dashboard
{
    private Odometer odometer;
    private Speedometer speedometer;
    
    public Dashboard()
    {
        odometer = new Odometer();
        speedometer = new Speedometer();
    }
    
    public void drive()
    {
        odometer.addMile();
        speedometer.speedUp();
    }
    
    public void stop()
    {
        speedometer.setSpeed(0);
    }

}
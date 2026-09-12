public class Speedometer
{
    private NumberDisplay speed;
    public Speedometer()
    {
        speed = new NumberDisplay(250);
    }
    public void speedUp()
    {speed.increment();}
    public void slowDown()
    {speed.decrement();}
    public void setSpeed(int mph)
    {
    speed.setValue(mph);}
    public int getSpeed()
    {
        return speed.getValue();
    }
}
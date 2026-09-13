public class Counter
{
    private int count;
    private String label;
    
    public Counter(String startLabel)
    {
        count = 0;
        label=startLabel;
    }

    public void increment()
    {
        count = count + 1;
    }
    public int getCount()
    {
    return count;
    }
    public String getLabel()
    {
    return label;
    }
    
    public void decrementBy(int amount)
    {
    count = count-amount;    
    }

}
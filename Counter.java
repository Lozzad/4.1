// File [Counter_java_4.1.html] MAS - last created: Fri 28 Apr 2017 21:40:21 BST

public class Counter
{
    // Declaration of a long instance variable to hold 
    //  the value of the counter 
    // You need to declare this instance variable here. 
    //  What should it initial value be. 
    long cValue = 0;
    /**
     * Return the current value of the counter
     * @return The value of the counter
     */
    public long getValue()
    {
        return cValue;
    }

    /**
     * Reset the counter to zero
     */
    public void reset()
    {
        cValue = 0;
    }

    /**
     * Add 1 to the counter
     */
    public void inc()
    {
        cValue++; 
    }

    /**
     * Subtract 1 from the counter
     */
    public void dec()
    {
        if (cValue>=1) 
        {
            cValue--;
        }
    }

    /**
     * Add 5 to the counter
     */
    public void add5()
    {
        cValue+=5; 
    }

    /**
     * Add 10 to the counter
     */
    public void add10()
    {
        cValue+=10; 
    }

    /**
     * Round to nearest 10
     */
    public void round10()
    {
        String sValue = Long.toString(cValue);
        int length = sValue.length();
        char endChar = sValue.charAt(length-1);
        int endInt = Character.getNumericValue(endChar);
        if (endInt>=1&&endInt<=4)
        {
            cValue-=endInt;
        } 
        else if (endInt>=5&&endInt<=9)
        {
            cValue+=(10-endInt);
        }
    }
}

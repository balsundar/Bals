package moh.sample.SampleThreads;


import java.text.DecimalFormat;
import java.text.NumberFormat;
 
public class NumberFormatTest
{
    public static void main(String[] args)
    {
    	
    	double tnum = 100550000.75;
        NumberFormat formatter = new DecimalFormat("#0.00");
        
        System.out.println(tnum);
        System.out.println(formatter.format(tnum));
    }
    
    
}


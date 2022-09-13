public class ques4 {
    public static void main(String args[])
    {
        int val1=10;
        int val2=20;
        System.out.println("Before swapping");
        System.out.println("Value of val1 is: "+val1+" "+"Value of val2 is: "+val2);
        
        // With temp 
        int temp=val1;
        val1=val2;
        val2=temp;
        System.out.println("After swapping");
        System.out.println("Value of val1 is: "+val1+" "+"Value of val2 is: "+val2);
        
        // Witout temp
        val1=val1+val2;
        val2=val1-val2;
        val1=val1-val2;
        System.out.println("Again after swapping without temp variable");
        System.out.println("Value of val1 is: "+val1+" "+"Value of val2 is: "+val2);


    }
    
}

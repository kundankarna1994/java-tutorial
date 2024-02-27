


// Name of the class
class Calculator 
{
    // Methods returning integer and accepting two int parameter
    public int add(int num1,int num2) // Here num1 and num2 is local variable
    {
        return num1 + num2;
    }
}

public class ClassTutorial
{
    public static void main(String args[])
    {
        //  Create a object from Calculator Class
        // Type Calculator reference variable calculator
        Calculator calculator = new Calculator();

        int result = calculator.add(5,10);
        
        System.out.println(result);
    }
}
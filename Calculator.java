public class Calculator
{

            //Add, sub, divide and multiplication with 2 integer no.
        static int x = 50;
        static int y = 25;
        //This method will perform addition
        static void add()
        {
            System.out.println(x+y);
        }
        //This method will perform Subtraction
        static void sub()
        {
            System.out.println(x-y);
        }
        //This method will perform divide
        static void div()
        {
            System.out.println(x/y);
        }
        //This method will perform multiplexation
        static void multi()
        {
            System.out.println(x*y);
        }
        //Java main method
        public static void main(String[] args)
        {
            add(); //define addition of x and y values
            sub(); //define substraction of x and y values
            div(); //define division of x and y values
            multi(); //defines multiplication of x and y values
        }

}

public class StudentsParameter
{
    //Calculate total marks and percentage for 3 subjects using parameterized method

    static void addition ( int h , int e , int g)  //h=hindi, e=english, g=gujarati
    {
        //calculating the total marks of all subject
        System.out.println ("Total Marks");
        System.out.println(h+e+g); //Total marks for hindi,english,gujarati
    }
    static void percentage (int h , int e , int g )
    {
        //calculating percentage for the student
        System.out.println ("Total Percentage");
        System.out.println ((h+e+g)*100/300); //Total percent of student on basis of 3 subject
    }

    public static void main (String[] args)
    {
        System.out.println("Kaushal"); //student name
        addition(55,65,57);
        percentage(55,65,57 );

    }

}

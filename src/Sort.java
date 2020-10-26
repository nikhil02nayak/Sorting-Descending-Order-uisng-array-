import java.util.Scanner;

public class Sort {

    private static Scanner scanner = new Scanner(System.in) ;
    public static void main(String[] args){
        System.out.println("enter the number of elements to sort in descending order");
        int input = scanner.nextInt() ;
        int[] myintegernumbers = getintegers1(input);
        int[] sorted = sortintegers(myintegernumbers) ;
        System.out.println("Elemnts after sorting in descending order : ");
        for (int i = 0 ; i < sorted.length ; i++)
        {
            System.out.println("Element" + i + ": " + sorted[i]);
        }

    }

    public static int[] getintegers1(int numbers)
    {
        int[] value = new int[numbers] ;
        System.out.println("enter " + numbers + " numbers to sort");
        for (int i=0 ; i< value.length ; i++ )
        {
            value[i] = scanner.nextInt() ;

        }

        return value ;
    }


    public static int[] sortintegers (int[] value)
    {
       int temp ;
       boolean flag = true ;
       while (flag)
       {
           flag = false ;
           for (int i = 0 ; i < value.length - 1; i++)
           {
               if (value[i] < value [i+ 1])
               {
                   temp = value [i] ;
                   value [i] = value [i + 1] ;
                   value [i + 1] = temp ;
                   flag = true ;
               }
           }
       }
        return value ;

    }


}

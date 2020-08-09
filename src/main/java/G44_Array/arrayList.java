package G44_Array;

import java.util.Comparator;
import java.util.List;

public class arrayList extends ParentClass{
    private String nameArrayList;
    private int numberArrayList;

    public arrayList (){
        System.out.println("Новый пустой экземпляр класса " + getClass().getName());
    }

    public arrayList (String name, int number)
    {
        nameArrayList=name;
        numberArrayList=number;
    }

    public static void printListString (List<String> myListString){

        //1. Natural order
        myListString.sort( Comparator.comparing( String::toString ) );

        System.out.println("Natural order " +myListString);

        //2. Reverse order
        myListString.sort( Comparator.comparing( String::toString ).reversed() );

        System.out.println("Reverse order " +myListString);

    }

}

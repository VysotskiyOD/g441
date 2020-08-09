package G44_Array;

import java.util.ArrayList;
import java.util.List;

public class arrayToList extends ParentClass {
    private String nameArrayToList;
    private int numberArrayToList;

    public arrayToList (){
        System.out.println("Новый пустой экземпляр класса " + getClass().getName());
    }

    public arrayToList (String name, int number)
    {
        nameArrayToList=name;
        numberArrayToList=number;
    }

    public static String[] myArray1 = { "seven", "six", "eight", "four", "five", "nine"};//использую альтернативный способ инициализации массива

    public static List<String> getArrayList1() {

        ArrayList<String> getArray1 = new ArrayList<String>();
        int i=0;//переменная для выхода с цыкла
        while (i<=4) {
            getArray1.add(myArray1[i]);
        i=i+1;
        } // конец цикла while

        return getArray1;
    }

}

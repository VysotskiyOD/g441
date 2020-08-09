package G44_Array;

import java.util.List;

public class ParentClass {
    protected static String parentName;

    public ParentClass(String parentName) {
        this.parentName = parentName;
    }

    public ParentClass() {
    }

    public static void print(ParentClass father) {
        System.out.println(parentName+": Выведен текст");
    }

    public static void getArrayListParent(List<String> parentArray){


        try {
            String str = parentArray.toString();
            for (String retval : str.split(" ")) {
                System.out.println();
                char[] strToArray = retval.toCharArray();
                // Вывод массива на экран
                for(int i = 0; i < strToArray.length; i++) {
                    System.out.print(strToArray[i] + " ");
                }
            };
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Массив не определён. Пожалуйста проверьте корректность вводимых значений");
        }
    }
}

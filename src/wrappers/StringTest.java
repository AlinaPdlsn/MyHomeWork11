package wrappers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        String str = "Literal";
        String str2 = new String("new");
        String str3[] = new String[2];
        str3[0] = "Text 1";
        str3[1] = "Text 2";
        byte str4 = 120;
        StringBuilder str5 = new StringBuilder("NewText");
        String str6 = "Апельсин,Яблоко,Гранат,Груша";
        String str7[] = str6.split(",");
        Arrays.sort(str7);
        System.out.println(str7[0].toLowerCase());
        System.out.println(str7[0].substring(0, 3));
        String str8 = "   Я_новая_строка      ";
        str8 = mytrim(str8);
        System.out.println(str8);
        System.out.println(myreplace(str8));
        Scanner scanner = new Scanner(System.in);
        String str9 = scanner.nextLine();

        System.out.println("Вы ввели: " + str9);

        if(str9.matches("^Запуск$")){
            System.out.println("Запускаем процесс");
        }

        if(str9.matches("^завершен$")){
            System.out.println("Процесс завершен");
        }

        str9 = str9.toLowerCase();

        if(str9.matches("^(.*?(\\bошибка\\b)[^$]*)$")){
            System.out.println("Произошла ошибка");
        }

        StringBuilder str10 = new StringBuilder();
        str10.append(str);
        str10.append(str2);
        str10.append(str3);
        str10.append("\n");
        str10.append(str4);
        str10.append(str5);
        str10.append(str6);
        str10.append("\n");
        str10.append(str8);
        str10.append(str9);
        str10.reverse();
        
        System.out.println(str10.toString());



    }

    public static String mytrim(String s) {
        s = s.replaceAll("^\\s+","");
        s = s.replaceAll("\\s+$","");
        return s;
    }

    public static String myreplace(String s) {
        s = s.replaceAll("_"," ");
        return s;
    }
}

package task2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isCorrectNumber(String str)
    {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public static void main(String[] args) {

        boolean proverka = false;

        Scanner scanner = new Scanner(System.in);

        String strnumber = "";

        //System.out.println(isSimpleNumber(997));

        while(!proverka)
        {
            System.out.println("Введите число");
            strnumber = scanner.next();
            proverka = isCorrectNumber(strnumber);

            if(!proverka)
            {
                System.out.println("Вы ввели нецелое число\n");
            }
        }

        int MainNumber = Integer.parseInt (strnumber);

        ArrayList<Integer> simpleNumbers= new ArrayList<>();

        simpleNumbers = BuildSimpleList(simpleNumbers,MainNumber);


        Logic(simpleNumbers,MainNumber);

        //razlojenie(MainNumber);

    }

    public static void Logic(ArrayList<Integer> simpleNumbers,int MainNumber)
    {
        for(int i =0;i<simpleNumbers.size();i++)
        {

            if(MainNumber%simpleNumbers.get(i)==0)
            {
                System.out.println(simpleNumbers.get(i));
                MainNumber= MainNumber/simpleNumbers.get(i);
                i--;
            }
        }
    }

    public static ArrayList<Integer> BuildSimpleList(ArrayList<Integer> simpleNumbers,int MainNumber)
    {
        for(int i =0 ;i<MainNumber;i++)
        {

                if (isSimpleNumber(i)) {
                    simpleNumbers.add(i);
                }

        }
        return simpleNumbers;
    }

    /*public static void razlojenie(int number)
    {
        while((number!=1)&&(!isSimpleNumber(number)))
        {

            for(int i=number-1;i>0;i--)
            {
                if(isSimpleNumber(i))
                {
                    if(number%i==0)
                    {
                        System.out.println(i);
                        number = number/i;
                    }
                }
            }
        }
    }*/

    public static boolean isSimpleNumber(int number)
    {
        if(number==1){
            return false;
        }
        if((((number%2==0)||(number % 3==0)||
                (number % 5==0)||(number % 7==0)||
                (number % 11==0)||(number % 13==0)||
                (number % 17==0)||(number % 19==0)||
                (number % 23==0)||(number % 29==0)||
                (number % 31==0)||(number % 37==0)||
                (number % 41==0)||(number % 43==0)||
                (number % 47==0)||(number % 53==0)||
                (number % 59==0)||(number % 61==0)||
                (number % 67==0)||(number % 71==0)||
                (number % 73==0)||(number % 79==0)||
                (number % 83==0)||(number % 89==0)||
                (number % 97==0)||(number % 101==0))&&(number>101))//немного оптимизируем проверку на простое число
        )
        {
            return false;
        }
        for(int i = number-1;i!=1;i--)
        {

            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

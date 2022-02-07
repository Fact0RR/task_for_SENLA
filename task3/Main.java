package task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите предолжение:");
        String str = scanner.nextLine();

        ArrayList<StrangeWord> words = new ArrayList<StrangeWord>();



        String strbufer = "";

        for (int i=0;i<str.length();i++)
        {
            if((str.charAt(i)!= ' ')&&(str.charAt(i)!= '.')&&(str.charAt(i)!= '!')&&(str.charAt(i)!= '?')
            &&(str.charAt(i)!=':')&&(str.charAt(i)!='-')&&(str.charAt(i)!=','))
            {
                strbufer = strbufer + str.charAt(i);
            }
            else
            {
                words.add(new StrangeWord(strbufer));
                strbufer = "";
            }
        }
        if (!strbufer.isEmpty())
        {
            words.add(new StrangeWord( strbufer));
            strbufer = null;
        }

        words.sort(new Comparator<StrangeWord>() {
            @Override
            public int compare(StrangeWord o1, StrangeWord o2) {
                if(o1.numberofvolume == o2.numberofvolume) return 0;
                else if(o1.numberofvolume < o2.numberofvolume) return 1;
                else return -1;
            }
        });


        for (int i =0;i< words.size();i++) {
            words.get(i).Zamena();
        }
        for (int i =0 ;i<words.size();i++)
        {
            System.out.println(words.get(i).word+"\t\t гласных:"+words.get(i).numberofvolume);
        }
    }

}
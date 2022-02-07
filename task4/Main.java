package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PixelNumber[] arrPixelNumbers = buildNumbersArray();

        showListOfNumbers(arrPixelNumbers);

    }

    public static void showListOfNumbers(PixelNumber[] arrPixelNumbers)
    {
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        System.out.println("Введите число:");

        Scanner scanner = new Scanner(System.in);

        String nstr = scanner.next();


        for (int i =0;i<nstr.length();i++)
        {
            if((nstr.charAt(i) - '0'>=0)&&(nstr.charAt(i) - '0'<=9))
            numberList.add(nstr.charAt(i) - '0');
        }

        //System.out.println(numberList);


        int BiggestValue = 0;

        for (int i = 0; i < numberList.size(); i++)
        {
            if (numberList.get(i)>BiggestValue)
            {

                BiggestValue = numberList.get(i);
            }
        }
        for(int k=0;k<arrPixelNumbers[1].getSizeOfPlace();k++) {
            for (int i = 0; i < numberList.size(); i++) {
                arrPixelNumbers[numberList.get(i)].ShowNumberLine(k,BiggestValue);
            }
            System.out.println();
        }
    }

    public static PixelNumber[] buildNumbersArray()
    {
        PixelNumber[] arrPixelNumbers= new PixelNumber[10];

        for (int a =0;a< arrPixelNumbers.length;a++)
        {
            arrPixelNumbers[a] = new PixelNumber(a,5);

        }

        arrPixelNumbers[0].array[0][1] = true; arrPixelNumbers[0].array[1][1] = true; arrPixelNumbers[0].array[3][1] = true; arrPixelNumbers[0].array[4][3] = true;
        arrPixelNumbers[0].array[0][2] = true; arrPixelNumbers[0].array[1][4] = true; arrPixelNumbers[0].array[3][4] = true; arrPixelNumbers[0].array[4][4] = true;
        arrPixelNumbers[0].array[0][3] = true; arrPixelNumbers[0].array[2][1] = true; arrPixelNumbers[0].array[4][1] = true;
        arrPixelNumbers[0].array[0][4] = true; arrPixelNumbers[0].array[2][4] = true; arrPixelNumbers[0].array[4][2] = true;

        arrPixelNumbers[1].array[1][1] = true; arrPixelNumbers[1].array[3][2] = true;
        arrPixelNumbers[1].array[1][2] = true; arrPixelNumbers[1].array[4][2] = true;
        arrPixelNumbers[1].array[0][2] = true;
        arrPixelNumbers[1].array[2][2] = true;


        arrPixelNumbers[2].array[0][1] = true; arrPixelNumbers[2].array[2][2] = true; arrPixelNumbers[2].array[4][3] = true;
        arrPixelNumbers[2].array[0][2] = true; arrPixelNumbers[2].array[3][1] = true;
        arrPixelNumbers[2].array[0][3] = true; arrPixelNumbers[2].array[4][1] = true;
        arrPixelNumbers[2].array[1][3] = true; arrPixelNumbers[2].array[4][2] = true;

        arrPixelNumbers[3].array[0][1] = true; arrPixelNumbers[3].array[2][2] = true; arrPixelNumbers[3].array[4][2] = true;
        arrPixelNumbers[3].array[0][2] = true; arrPixelNumbers[3].array[2][3] = true; arrPixelNumbers[3].array[4][3] = true;
        arrPixelNumbers[3].array[0][3] = true; arrPixelNumbers[3].array[3][4] = true;
        arrPixelNumbers[3].array[1][4] = true; arrPixelNumbers[3].array[4][1] = true;

        arrPixelNumbers[4].array[0][1] = true; arrPixelNumbers[4].array[1][3] = true;
        arrPixelNumbers[4].array[1][1] = true; arrPixelNumbers[4].array[2][3] = true;
        arrPixelNumbers[4].array[2][1] = true; arrPixelNumbers[4].array[4][3] = true;
        arrPixelNumbers[4].array[2][2] = true; arrPixelNumbers[4].array[3][3] = true;

        arrPixelNumbers[5].array[0][1] = true; arrPixelNumbers[5].array[2][2] = true; arrPixelNumbers[5].array[4][3] = true;
        arrPixelNumbers[5].array[0][2] = true; arrPixelNumbers[5].array[3][3] = true;
        arrPixelNumbers[5].array[0][3] = true; arrPixelNumbers[5].array[4][1] = true;
        arrPixelNumbers[5].array[1][1] = true; arrPixelNumbers[5].array[4][2] = true;

        arrPixelNumbers[6].array[0][1] = true; arrPixelNumbers[6].array[2][0] = true; arrPixelNumbers[6].array[3][3] = true;
        arrPixelNumbers[6].array[0][2] = true; arrPixelNumbers[6].array[3][0] = true; arrPixelNumbers[6].array[4][2] = true;
        arrPixelNumbers[6].array[2][1] = true; arrPixelNumbers[6].array[4][1] = true;
        arrPixelNumbers[6].array[1][0] = true; arrPixelNumbers[6].array[2][2] = true;

        arrPixelNumbers[7].array[0][1] = true; arrPixelNumbers[7].array[1][4] = true;
        arrPixelNumbers[7].array[0][2] = true; arrPixelNumbers[7].array[2][3] = true;
        arrPixelNumbers[7].array[0][3] = true; arrPixelNumbers[7].array[3][2] = true;
        arrPixelNumbers[7].array[0][4] = true; arrPixelNumbers[7].array[4][2] = true;

        arrPixelNumbers[8].array[0][1] = true; arrPixelNumbers[8].array[1][1] = true; arrPixelNumbers[8].array[3][1] = true; arrPixelNumbers[8].array[4][3] = true;
        arrPixelNumbers[8].array[0][2] = true; arrPixelNumbers[8].array[1][4] = true; arrPixelNumbers[8].array[3][4] = true; arrPixelNumbers[8].array[4][4] = true;
        arrPixelNumbers[8].array[0][3] = true; arrPixelNumbers[8].array[4][1] = true; arrPixelNumbers[8].array[2][2] = true;
        arrPixelNumbers[8].array[0][4] = true; arrPixelNumbers[8].array[4][2] = true; arrPixelNumbers[8].array[2][3] = true;

        arrPixelNumbers[9].array[1][1] = true; arrPixelNumbers[9].array[4][3] = true;
        arrPixelNumbers[9].array[0][2] = true; arrPixelNumbers[9].array[1][4] = true; arrPixelNumbers[9].array[3][4] = true;
        arrPixelNumbers[9].array[0][3] = true; arrPixelNumbers[9].array[2][2] = true;
        arrPixelNumbers[9].array[2][4] = true; arrPixelNumbers[9].array[4][2] = true; arrPixelNumbers[9].array[2][3] = true;


        return arrPixelNumbers;
    }
}

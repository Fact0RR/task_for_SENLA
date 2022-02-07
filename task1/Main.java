package task1;

public class Main {
    public static void main(String[] args) {

        int sum = 0;

        String text = "1j9";


        for (int i =0;i<text.length();i++)
        {
            if(Character.isDigit(text.charAt(i))) // проверяем является ли текущий элемент строки цифрой
            {
                sum = sum + text.charAt(i) - '0'; //небольшая хитрость перевода цифры из char в int (ASCII в помощь)
            }

        }

        System.out.println(sum);

    }
}

package task3;

public class StrangeWord {

    public String word;
    public int numberofvolume;

    public StrangeWord(String word) {
        this.word = word;
        for(int i = 0;i<word.length();i++)
        {
            if(IsVolume(word.charAt(i)))
            {
                numberofvolume++;
            }
        }
    }

    public static boolean IsVolume(char symbol)
    {
        if((symbol == 65)||(symbol == 69)||(symbol == 73)||(symbol == 79)||(symbol == 85)
                ||(symbol == 97)||(symbol == 101)||(symbol == 105)||(symbol == 111)||(symbol == 117)) {
            return true;
        }
        if((symbol == 'А')||(symbol == 'О')||(symbol == 'У')||(symbol == 'Э')||(symbol == 'Ы')||
                (symbol == 'Я')||(symbol == 'Е')||(symbol == 'Ё')||(symbol == 'Ю')||(symbol == 'И')||
                (symbol == 'а')||(symbol == 'о')||(symbol == 'у')||(symbol == 'э')||(symbol == 'ы')||
                (symbol == 'я')||(symbol == 'е')||(symbol == 'ё')||(symbol == 'ю')||(symbol == 'и'))
        {return true;}
        return false;
    }

    public void Zamena()
    {

        StringBuilder bigWord = new StringBuilder(word);

        for(int i =0 ;i<word.length();i++) {
            if (!((word.charAt(i) == 'А') || (word.charAt(i) == 'О') || (word.charAt(i) == 'У') || (word.charAt(i) == 'Э') || (word.charAt(i) == 'Ы') ||
                    (word.charAt(i) == 'Я') || (word.charAt(i) == 'Е') || (word.charAt(i) == 'Ё') || (word.charAt(i) == 'Ю') || (word.charAt(i) == 'И') ||
                    (word.charAt(i) == 65) || (word.charAt(i) == 69) || (word.charAt(i) == 73) || (word.charAt(i) == 79) || (word.charAt(i) == 85)) && (IsVolume(word.charAt(i)))) {

                     bigWord.setCharAt(i,(char) (word.charAt(i)-32));
                    //System.out.println(word.charAt(i)+" "+(char) (word.charAt(i)-32));
                    break;
            }
            if(((word.charAt(i) == 'А') || (word.charAt(i) == 'О') || (word.charAt(i) == 'У') || (word.charAt(i) == 'Э') || (word.charAt(i) == 'Ы') ||
                    (word.charAt(i) == 'Я') || (word.charAt(i) == 'Е') || (word.charAt(i) == 'Ё') || (word.charAt(i) == 'Ю') || (word.charAt(i) == 'И') ||
                    (word.charAt(i) == 65) || (word.charAt(i) == 69) || (word.charAt(i) == 73) || (word.charAt(i) == 79) || (word.charAt(i) == 85)))
            {break;}

        }
        word = bigWord.toString();
    }
}
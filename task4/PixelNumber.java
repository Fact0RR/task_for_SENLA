package task4;

public class PixelNumber {
    private final int token;
    private final int sizeOfPlace;

    public boolean [][] array;

    public PixelNumber(int token,int sizeOfPlace) {
        this.token = token;
        this.sizeOfPlace =sizeOfPlace;
        array = new boolean[sizeOfPlace][sizeOfPlace];

        for(int i = 0;i<this.sizeOfPlace;i++)
        {
            for(int j = 0;j<this.sizeOfPlace;j++)
            {
                array[i][j]=false;//заполняем все false`ами
            }
        }
    }

    public void ShowNumber()
    {
        for(int i = 0;i<this.sizeOfPlace;i++)
        {
            for(int j = 0;j<this.sizeOfPlace;j++)
            {
                if(array[i][j]==true)
                {
                    System.out.print(" "+this.token);
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public void ShowNumberLine(int line,int biggestValue)
    {
        for(int i=0;i<sizeOfPlace;i++)
        {
            if ((array[line][i] == true)&&(biggestValue == token)){
                System.out.print(" "+token);
            }
            else if(array[line][i] == true) {
                System.out.print(" *");
            }
            else
            {
                System.out.print("  ");
            }
        }
    }

    public int getSizeOfPlace() {
        return sizeOfPlace;
    }

    public int getToken() {
        return token;
    }
}

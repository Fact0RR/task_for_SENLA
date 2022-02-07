package task5;

import java.util.ArrayList;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        System.out.println("Укажите объем сейфа:");
        Scanner scanner = new Scanner(System.in);
        Safe safe = new Safe(scanner.nextInt());

        ArrayList<SomeThing> list = ObjectsListBuilder();


        Logic(list,safe);

    }

    public static ArrayList<SomeThing> ObjectsListBuilder()
    {
        ArrayList<SomeThing> list = new ArrayList<>();


        //набор продуктов
        list.add(new SomeThing(100,298,"eag"));
        list.add(new SomeThing(250,100,"water"));
        list.add(new SomeThing(150,323,"cheese"));
        list.add(new SomeThing(343,489,"meet"));
        list.add(new SomeThing(300,413,"milk"));
        list.add(new SomeThing(232,123,"bread"));
        list.add(new SomeThing(432,523,"coffee"));



        return list;
    }

    private static int N = 5;
    private static int M = 3;

    private static int[] generateCombinations(int[] arr)
    {
        if (arr == null)
        {
            arr = new int[M];
            for (int i = 0; i < M; i++)
                arr[i] = i + 1;
            return arr;
        }
        for (int i = M - 1; i >= 0; i--)
            if (arr[i] < N - M + i + 1)
            {
                arr[i]++;
                for (int j = i; j < M - 1; j++)
                    arr[j + 1] = arr[j] + 1;
                return arr;
            }
        return null;
    }
    public static ArrayList<int []> BuildExceptionList(int n)
    {
        N = n;
        ArrayList<int[]> l = new ArrayList<>();

        for(int ii =1;ii<N+1;ii++) {
            M= ii;
            int[] arr = null;

            while ((arr = generateCombinations(arr)) != null) {
                //out.println(Arrays.toString(arr));
                int[] arr2 = new int[arr.length];
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = arr[i];
                }
                l.add(arr2);
            }
        }

        return l;
    }

    public static void Logic(final ArrayList<SomeThing> list, final Safe safe)
    {

        int maxPrice = 0;
        ArrayList<SomeThing> bestCombination = new ArrayList<>();


        ArrayList<int []> ListOfAllCombinatin = BuildExceptionList(list.size());

        //создадим быструю комбинацию
        ArrayList<SomeThing> fastList = new ArrayList<>();

        for(int i = 0 ;i<ListOfAllCombinatin.size();i++)
        {
            for(int j =0 ;j<ListOfAllCombinatin.get(i).length;j++)
            {
             fastList.add(list.get(j));
            }
            //логика
            if(SumOfPVolume(fastList) <= safe.getTotalVolume())
            {
                if(SumOfPrice(fastList)>maxPrice)
                {
                    for(int b =0 ;b<bestCombination.size() ;b++ )
                    {
                        bestCombination.remove(0);
                    }
                    maxPrice = SumOfPrice(fastList);
                    for(int b =0 ;b<fastList.size();b++ )
                    {
                        bestCombination.add(fastList.get(b));
                    }
                }
            }

            //очищаем быстрый список
            for(int j =0 ;j<ListOfAllCombinatin.get(i).length;j++)
            {
                fastList.remove(0);
            }
        }

        System.out.println("Лучший прайс: "+maxPrice);
        if(maxPrice == 0)
        {
            System.out.println("Сейф слишком маленький :(");
        }
        System.out.println("набор продуктов:\n");
        ShowAll(bestCombination);
    }

    public static void ShowAll(ArrayList<SomeThing> list)
    {
        for(int i =0;i<list.size();i++)
        {
            System.out.println("Товар: "+list.get(i).getName()+" Цена: "+list.get(i).getPrice()
            +" Объем: "+ list.get(i).getVolume());
        }
    }


    public static int SumOfPrice(ArrayList<SomeThing> list)
    {
        int sum=0;

        for(int i =0;i<list.size();i++)
        {
            sum = list.get(i).getPrice()+sum;
        }

        return sum;
    }
    public static int SumOfPVolume(ArrayList<SomeThing> list)
    {
        int sum=0;

        for(int i =0;i<list.size();i++)
        {
            sum = list.get(i).getVolume()+sum;
        }

        return sum;
    }
}

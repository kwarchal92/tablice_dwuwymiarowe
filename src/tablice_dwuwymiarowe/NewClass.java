package tablice_dwuwymiarowe;

public class NewClass {

    public static void main(String[] args)
    {
        int n = 10, i, j, suma;
        int macierz[][] = new int[n][n];

        //wpisywanie 1 do tablicy na przekatnej i 0 poza przekatna.
        for (i = 0; i < macierz.length; i++)
        {
            for(j = 0; j < macierz.length; j++)
            {
                if (i == j)
                    macierz[i][j] = 1;
                else
                    macierz[i][j] = 0;
            }
        }

        //wyswietlanie zawartsci tablicy
        for (i = 0; i < macierz.length; i++)
        {
            for (j = 0; j < macierz.length; j++)
            {
                System.out.print(macierz[i][j] + "\t");
            }
            System.out.println();
        }

        suma = 0;

        for (i = 0; i < macierz.length; i++)
        {
            suma += macierz[i][i]; //suma = suma+macierz[i][i]
        }
        System.out.println("\nsuma wyroznionych elementow tablicy wynosi: " + suma + ".");
    }
}




import java.util.Random;
import java.util.Scanner;





public class Solution
{
    public static void main(String[] args)
    {
        // 5 .Donat un nombre enter major que zero, crea la matriu identitat de dimensió el nombre enter donat. (http://ca.wikipedia.org/wiki/Matriu_identitat)
        Scanner teclado = new Scanner(System.in);
        int num;

        do
        {
            System.out.print("Introduce un entero mayor que 0:");
            num = teclado.nextInt();
        }while (num <= 0);
        teclado.close();

        //Creamos matriz Identidad
        int identidad[][] = new int[num][num];
        for (int i = 0; i < num; i++)
            identidad[i][i] = 1;

        //Mostramos la matriz
        System.out.println("\nMatriz identidad:\n");
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
                System.out.print(identidad[i][j] + " ");
            System.out.println();
        }

    }
}

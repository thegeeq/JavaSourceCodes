

public class Pattern_4
{
    public static void main(String[] args)
    {

        for(int u=5; u>=1; u--)
        {

            for(int j=1;j<=u;j++)
            {
                System.out.print(j);

            }

            for(int k=1;k<=6-u;k++)
            {
                if(k>2)
                    System.out.print("  ");
                else if(k==2)
                    System.out.print(" ");

            }

            for(int l=u; l>=1; l--)
            {
                if(l==5)
                    System.out.print(l=l-1);
                else
                    System.out.print(l);

            }

            System.out.println();
        }

        for(int i=2; i<=5; i++)
        {

            for(int j=1; j<=i; j++)
            {
                System.out.print(j);

            }

            for(int k=1; k<=6-i; k++)
            {
                if(k==2)
                    System.out.print(" ");
                if(k>2)
                    System.out.print("  ");

            }

            for(int l=i; l>=1; l--)
            {
                if(l==5)
                    System.out.print(l=l-1);
                else
                    System.out.print(l);

            }

            System.out.println();
        }

    }
}

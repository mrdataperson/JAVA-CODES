public class charpat
{
    public static void main(String args[])
    {
        char[] word = {'A','B','C','D','E','F','G','H','I'};
        // left side pattern
        /*for(int i=0;i<word.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(word[j]);
            }
            System.out.println();
        }*/
       // square type pattern
       /*for(int i=0;i<word.length;i++)
        {
            for(int j=0;j<word.length;j++)
            {
                System.out.print(word[j]);
            }
            System.out.println();
        }*/
       // alligned left triangle
       char let = 'A';
       /*for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(let++);
            }
            System.out.println();
        }*/

       // square format
       for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(let++);
            }
            System.out.println();
        }
    }
}
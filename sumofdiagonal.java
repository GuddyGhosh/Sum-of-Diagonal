public class sumofdiagonal 
{
    public static void main(String args[])
    {
        int arr[][]=new int[4][4];
         arr[0][0]=1;
         arr[0][1]=2;
         arr[0][2]=3;
         arr[0][3]=4;

         arr[1][0]=5;
         arr[1][1]=6;
         arr[1][2]=7;
         arr[0][3]=8;

         arr[2][0]=9;
         arr[2][1]=10;
         arr[2][2]=11;
         arr[0][3]=12;

         arr[3][0]=13;
         arr[3][1]=14;
         arr[3][2]=15;
         arr[3][3]=16;

           int sum=0;
          for(int i=0;i<arr.length;i++)
          {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    sum=sum+arr[i][j];
                    System.out.println(arr[i][j]);
                }
               
            }
            
            System.out.println("total: "+sum);
          }
    }



}

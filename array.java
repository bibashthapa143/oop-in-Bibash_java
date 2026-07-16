public class array {
    public static void main(String[] args)
    {
        int a[]=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;

       int la=a[0];
        

        for(int i=0; i<a.length; i++)
        {
            if(la<a[i])
            {
                la=a[i];

            }
            

        }
        System.out.println(la);
        int even=0;
        int odd=0;

        for(int i=0; i<a.length; i++)
            {
                if(a[i]%2==0)
                {
                    even=even+a[i];

                    
                    
                }
                else{
                    odd=odd+a[i];
                }

            }
            System.out.println("Sum of Even are:"+even);
            System.out.println("Sum of odd are:"+odd);
    }
    
}

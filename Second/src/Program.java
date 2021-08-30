public class Program {
    public static void main(String args[]) {
        int a[];
        int sum=0;
        a=new int[15];
        for(int i=5;i<15;i++)
        {
            a[i]=i*i;

            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}

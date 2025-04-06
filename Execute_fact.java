package practice;
import java.io.*;

public class Execute_fact{
    public static void main(String[] args)
    throws IOException
    {
        int num,i;
        int fact = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:- ");
        num = Integer.parseInt(br.readLine());

        for(i = 1;i <= num;i++){
            fact = fact * i;
        }

        System.out.println(fact);
    }
}

package practice;

import java.io.*;

class Table1{
    private int num,i,result;

    void input(int n){
        this.num = n;
    }

    void output() {
        for (i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}

public class Excute_nTable {
    public static void main(String[] args)
    throws IOException
    {
        Table1 t = new Table1();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number:- ");
        int n = Integer.parseInt(br.readLine());


        t.input(n);
        t.output();
    }
}

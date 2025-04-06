package practice;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
class MaxArray{
    private int i,max;

    MaxArray() {
        max = 0;
    }

    void setValue(int index, int num, @NotNull int[] arr){
        arr[index] = num;
    }

     int maxElement(@NotNull int[] arr){
       for(i = 0 ; i < arr.length;i++){
           if(arr[i] > max){
               max = arr[i];
           }
       }
         return max;
    }

    boolean find(@NotNull int[] arr,int search){
    for(i = 0;i < arr.length;i++)
    {
        if(search == arr[i]){
            return true;
        }
        }
    return false;
    }
}

public class Execute_maxAr {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MaxArray obj = new MaxArray();

    int[] arr = new int[5];
    int num,i,max,search;
    boolean result;

    // store element in array
    for(i = 0; i< arr.length;i++){
        System.out.printf("Enter index[%d] value:- ",i);
        num = sc.nextInt();
        obj.setValue(i,num,arr);
    }

    // search max element
    max = obj.maxElement(arr);
        System.out.println("The maximum element is " + max);

        System.out.print("Enter element you want to search:- ");
        search = sc.nextInt();

        // search element
        result = obj.find(arr,search);

        if(result == false){
            System.out.printf("%d is not found in array\n",search);
        }
        else{
            System.out.printf("%d is found in array\n",search);
        }
    }


}

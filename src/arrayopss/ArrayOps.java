/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayopss;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Taif
 */
public class ArrayOps {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        static int  arr[]=new int[5];
    int count=0;
    public void add(int newElement)
    {
        if(count<arr.length)
        {
            arr[count]=newElement;
            count++;
        }
        else System.out.println("Array is full");
    }
    public void reverse()
    {
        int n=arr.length-1;
        for (int i = 0; i <arr.length/2; i++) {
            int t=arr[i];
            arr[i]=arr[n];
            arr[n]=t;
            n--;
        }
    }
       public void shiftRight()
    {
        int i;
        for (i =  arr.length-1; i >0; i--) {
            arr[i]=arr[i-1];

        }
        arr[i]=0;
    }
    public void shiftLeft()
    {
        int i;
        for (i =  0; i <arr.length-1; i++) {
            arr[i]=arr[i+1];

        }
        arr[i]=0;
    }

    public static void main(String[] args) {
        ArrayOps o= new ArrayOps();
        System.out.println(Arrays.toString(arr));
        Scanner s= new Scanner(System.in);
while(true) {
    o.add(s.nextInt());
    System.out.println(Arrays.toString(arr));


}
    }
}
    
    


import java.util.ArrayList;
public class Driver
{
    public static void main(String[] args){
        ArrayList<Integer> arr1=new ArrayList();
        ArrayList<Integer> arr2=new ArrayList();
        arr1.add(1);
        arr1.add(1);
        arr2.add(1);
        arr1.add(0);
        arr2.add(0);
        arr2.add(1);
        arr2.add(1);
        arr2.add(9);
        arr2.add(9);
        arr2.add(9);
        arr2.add(9);
        arr2.add(9);
        arr2.add(9);
        arr2.add(9);
        arr2.add(9);
        arr2.add(9);
        
        System.out.println(PrimeSieve.PrimeSieve(10000));        
        System.out.println(PrimeSieve.GoldBachPair(10000));
        System.out.println(PrimeSieve.BigInts(arr1,arr2));
    }
}

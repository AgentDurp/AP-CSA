import java.util.ArrayList;
public class PrimeSieve{
    public static ArrayList<Integer> PrimeSieve(int n){
        ArrayList<Integer> nums=new ArrayList();
        int p=2;
        for(int i=2;i<=n;i++){
            nums.add(i);
        }
        while(p<nums.get(nums.size()-1)){
            for(int z=0;z<nums.size();z++){
                if(nums.get(z)%p==0&&nums.get(z)>p){
                    nums.remove(z);
                }
            }
            p=nums.get(nums.indexOf(p)+1);
        }
        return nums;
    }

    public static ArrayList<Integer> GoldBachPair(int n){
        ArrayList<Integer> arr1=PrimeSieve(n);
        ArrayList<Integer> ans=new ArrayList();
        for(int i=0;ans.size()<2;i++){
            for(int k=i;k<arr1.size();k++){
                if(arr1.get(k)+arr1.get(i)==n){
                    ans.add(arr1.get(i));
                    ans.add(arr1.get(k));  
                    break;
                }
            }
        }
        return ans;
    }

    public static ArrayList<Integer> BigInts(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> ans=new ArrayList();
        int carry=0;//numbers which carry over in addition
        int sum=0;//sum of the two numbers
        int start=0;//start index of the smaller arrayList
        
        //adding the two arraylists together
        if(a.size()>=b.size()){
            start=b.size()-1;
            for(int i=a.size()-1;i>(a.size()-b.size())-1;i--){
                sum=a.get(i)+b.get(start);
                ans.add(0,(sum%10)+carry);
                carry=(sum)/10;
                start--;
            }
        }else{
            start=a.size()-1;
            for(int i=b.size()-1;i>(b.size()-a.size())-1;i--){
                
                sum=b.get(i)+a.get(start);
                ans.add(0,(sum%10)+carry);
                carry=(sum)/10;
                start--;
            }
        }
        //adding the stuff after one array list has ended
        for(int k=Math.abs(a.size()-b.size())-1;k>=0;k--){
            if(a.size()>=b.size()){
                ans.add(0,a.get(k));
            }else{
                ans.add(0,b.get(k));
            }
        }
        return ans;
    }

}
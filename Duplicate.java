import java.util.HashMap;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(nums[i])){
                return true;
           }else{
            map.put(nums[i],0);
           }
            
        }
        return false;
    }
}
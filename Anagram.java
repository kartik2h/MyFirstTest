import java.util.HashMap;

public class Anagram {
    
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(char temp: s.toCharArray()){
            if(!map.containsKey(temp)){
                map.put(temp,1);
            }else{
                map.put(temp,map.get(temp)+1);
            }
        }
        for(char temp:t.toCharArray()){
            if(!map.containsKey(temp)){
                return false;
            }else{
                if(map.get(temp)>=0){
                    map.put(temp,map.get(temp)-1);
                }else{
                    return false;
                }
                
            }
        }
        for(HashMap.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }
        return true;
        
    }
    
        public boolean isAnagram2(String s, String t) {
            int arr[] = new int[28];
            for(char temp : s.toCharArray()){
                arr[(int)temp-97] = arr[(int)temp-97]+1;
            }
            for(char temp:t.toCharArray()){
                arr[(int)temp-97] = arr[(int)temp-97]-1;
            }
            for(int i=0;i<28;i++){
                if(arr[i]!=0){return false;}
            }
            return true;
        }
    
}

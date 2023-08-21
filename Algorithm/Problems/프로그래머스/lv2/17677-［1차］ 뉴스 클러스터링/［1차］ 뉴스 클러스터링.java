import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        ArrayList<String> str1_list = new ArrayList<String>();
        ArrayList<String> str2_list = new ArrayList<String>();
        
        for(int i = 1;i < str1.length();i++){
            if(isAlphabet(str1.charAt(i))){
                if(isAlphabet(str1.charAt(i - 1))){
                    String str = String.valueOf(str1.charAt(i - 1)) + String.valueOf(str1.charAt(i));
                    str1_list.add(str.toLowerCase());
                }
            }else i++;
        }
        for(int i = 1;i < str2.length();i++){
            if(isAlphabet(str2.charAt(i))){
                if(isAlphabet(str2.charAt(i - 1))){
                    String str = String.valueOf(str2.charAt(i - 1)) + String.valueOf(str2.charAt(i));
                    str2_list.add(str.toLowerCase());
                }
            }else i++;
        }
        
        boolean[] str1_boolean = new boolean[str1_list.size()];
        boolean[] str2_boolean = new boolean[str2_list.size()];
        double min = 0 ,max = 0;
        
        for(int i = 0;i < str1_list.size();i++){
            if(str2_list.contains(str1_list.get(i))){
                for(int j = 0;j < str2_list.size();j++){
                    if(str1_list.get(i).equals(str2_list.get(j)) && !str1_boolean[i] && !str2_boolean[j]){
                        str1_boolean[i] = true;
                        str2_boolean[j] = true;
                        min++;
                        break;
                    }
                }
            }
        }
        
        max = min;
        
        for(int i = 0;i < str1_boolean.length;i++){
            if(!str1_boolean[i])
                max++;
        }
        for(int i = 0;i < str2_boolean.length;i++){
            if(!str2_boolean[i])
                max++;
        }
        
        if(min == 0 && max == 0)
            min = max = 1;
        
        double temp = min / max * 65536;
        answer = (int) temp;
        
        return answer;
    }
    
    public boolean isAlphabet(char ch){
        return (65 <= ch && ch <= 90) || (97 <= ch && ch <= 122);
    }
}
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] numbersToString = new String[numbers.length];
        
        for(int i = 0;i < numbers.length;i++) {
            numbersToString[i] = String.valueOf(numbers[i]);   
        }
        
        Arrays.sort(numbersToString,new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return Integer.valueOf(b + a) - Integer.valueOf(a + b);
            }
        });
        
        for(String number:numbersToString) {
            answer.append(number);
        }
        
        if(answer.charAt(0) == '0') {
            answer = new StringBuilder("0");
        }
            
        return answer.toString();
    }
}
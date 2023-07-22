class Solution {
    public String solution(int n) {
        
        StringBuilder answer = new StringBuilder();
        
        while(n!=0){
            int remainder = n%3;
            n = n/3;
            
            switch(remainder){
                case 0: answer.insert(0,4);
                        n--; 
                        break;
                case 1: answer.insert(0,1);
                        break;
                case 2: answer.insert(0,2);
                        break;
            }
        }
        
        return answer.toString();
    }   
}
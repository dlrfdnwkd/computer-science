class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya","ye","woo","ma"};
        
        for(String word:babbling){          
            splitWord:while(word.length() > 0){
                for(int i=0;i<words.length;i++){
                    if(word.startsWith(words[i])){
                        word = word.substring(words[i].length());
                        continue splitWord;
                    }
                }
                
                break;
            }
            
            if(word.length() == 0) answer++;
        }
        
        return answer;
    }
}
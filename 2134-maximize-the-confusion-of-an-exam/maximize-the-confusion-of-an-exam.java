class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        //case 1: Flip False to True (F-->T)

        int countF = 0;
        int res = -1;

        int i = 0;
        int j = 0;
        int n = answerKey.length();

        while(j < n){
            if(answerKey.charAt(j) == 'F'){
                countF++;
            }
            while(countF > k){
                if(answerKey.charAt(i) == 'F'){
                    countF--;
                }
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }

        i = 0;
        j = 0;
        int countT = 0;

        while(j < n){
            if(answerKey.charAt(j) == 'T'){
                countT++;
            }
            while(countT > k){
                if(answerKey.charAt(i) == 'T'){
                    countT--;
                }
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }


        return res;


        
    }
}
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < deck.length; i++){ //taking out frequencies
            hm.put(deck[i],hm.getOrDefault(deck[i],0)+1);
        }
        // int arr[] = new int[deck.length]; //making a new array to store only the frequencies
        // for(int i = 0; i < deck.length; i++){
        //     arr[i] = hm.get(deck[i]);
        // }

        // int num = gcdArr(arr); //taking the gcd of the frequencies cuz that will be the group size.
        // if(num > 1)return true; //gcd should be greater than 1 so we can make groups
        // else return false; //1 group size is not allowed that's why false.



        //-------------------------------
        int ans = 0;
        for(int key:hm.keySet()){
            ans = gcd(ans,hm.get(key));
        }
        if(ans>1)return true;
        else return false;
    }

    // public int gcdArr(int arr[]){
    //     int ans = arr[0];
    //     for(int i = 1; i < arr.length; i++){
    //         ans = gcd(ans,arr[i]);
    //     }
    //     return ans;
    // }

    public int gcd(int a, int b){
        if(a==0)return b;
        int temp = gcd(b%a,a);
        return temp;
    }
}
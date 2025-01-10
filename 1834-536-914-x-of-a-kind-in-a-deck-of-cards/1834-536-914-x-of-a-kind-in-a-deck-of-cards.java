class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < deck.length; i++){
            hm.put(deck[i],hm.getOrDefault(deck[i],0)+1);
        }
        int arr[] = new int[deck.length];
        for(int i = 0; i < deck.length; i++){
            arr[i] = hm.get(deck[i]);
        }

        int num = gcdArr(arr);
        if(num>1)return true;
        else return false;

    }

    public int gcdArr(int arr[]){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            ans = gcd(ans,arr[i]);
        }
        return ans;
    }

    public int gcd(int a, int b){
        if(a==0)return b;
        int temp = gcd(b%a,a);
        return temp;
    }
}
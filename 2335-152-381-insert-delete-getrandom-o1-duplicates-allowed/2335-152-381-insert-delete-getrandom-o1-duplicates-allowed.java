class RandomizedCollection {
    HashMap <Integer,HashSet<Integer>> hm = new HashMap<>();
    ArrayList <Integer> list = new ArrayList<>();
    Random r = new Random();


    public RandomizedCollection() {
        
    }
    
    public boolean insert(int val) {
        HashSet <Integer> set;
        boolean flag;
        if(hm.containsKey(val)==true){
            set = hm.get(val);
            flag = false;
        }
        else{
            set = new HashSet<>();
            flag = true;
        }
        set.add(list.size());
        hm.put(val,set);
        list.add(val);
        return flag;
    }
    
    public boolean remove(int val) {
        HashSet <Integer> set;
        if(hm.containsKey(val)==true){
            set = hm.get(val);
        }
        else return false;
        int remidx = -1;
        for(int x:set){
            remidx = x;
            break;
        }
        set.remove(remidx);
        hm.put(val,set);
        if(remidx == list.size()-1){
            list.remove(list.size()-1);
        }
        else{
            int idx2 = list.size()-1;
            int temp = list.get(idx2); //the no.at last index
            swap(idx2,remidx);
            list.remove(list.size()-1);
            HashSet<Integer> s = hm.get(temp);
            s.remove(idx2);
            s.add(remidx);
            hm.put(temp,s);          
        }
        if(hm.get(val).size() == 0)hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        int idx = r.nextInt(list.size());
        return list.get(idx);
    }

    public void swap(int idx1,int idx2){
        int a = list.get(idx1);
        int b = list.get(idx2);
        list.set(idx1,b);
        list.set(idx2,a);
        
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
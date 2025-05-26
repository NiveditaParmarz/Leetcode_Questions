class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {

        HashMap <Double,List<Integer>> hm = new HashMap<>();
        PriorityQueue <Double> q = new PriorityQueue<Double>(Collections.reverseOrder());
        int n = arr.length;
        // Max Heap
        // boolean flag = false;
        // double ans = -1;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                List<Integer> smallList = new ArrayList<>();
                double frac = (double)arr[i]/arr[j];
                smallList.add(arr[i]);
                smallList.add(arr[j]);
                hm.put(frac,smallList);
                q.add(frac);
                if(q.size() > k){
                    double removed = q.poll();
                    hm.remove(removed);
                    // flag = true;
                }
                // if(flag == true)break;
            }
            // if(flag == true)break;
        }
        double ans = q.peek();
        int ansArr[] = new int[2];
        ansArr[0] = hm.get(ans).get(0);
        ansArr[1] = hm.get(ans).get(1);

        return ansArr;
    }
}
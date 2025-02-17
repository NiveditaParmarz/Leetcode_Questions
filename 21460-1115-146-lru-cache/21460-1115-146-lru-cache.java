class Node{
        int key;
        int val;
        Node next = null;
        Node prev = null;
        Node(){
        }
}


class LRUCache {
    HashMap <Integer , Node> hm;
    Node H = new Node();
    Node T = new Node();
    int cap;

   public LRUCache(int capacity) {
        hm = new HashMap<>();
        H.next = T;
        T.prev = H;
        cap = capacity;
    }
    
    public int get(int key) {
        if(!hm.containsKey(key)){
            return -1;
        }

        else{
            int ans = hm.get(key).val;
            Node temp = delete(H,hm.get(key)); //hm.get(key) is the whole node, so we deleted the whole node and stored it as delete function returns the deleted node as well.
            add(H,T,temp);//added the node behind the tail.
            return ans; //returned the value of the node.
        }
    }
    
    public void put(int key, int value) {
        Node res = hm.get(key); //whole node

        if(res==null){ //if we don't have this app yet
            if(cap==hm.size()){ //means capacity of hashmap is full
                hm.remove(H.next.key); //hashmap se toh node ki key hi hatayeinge na. H.next is the whole node, H.next.key is they key of the node which is also present as a key in hashmap.
                delete(H,H.next);
            }
            Node n1 = new Node();
            n1.key = key;
            n1.val = value;
            add(H,T,n1);
            hm.put(key,n1);
        }

        else{
            Node temp = delete(H,res); //deleting the whole node from ll. //this will return the node to us.
            //now, key same rahegi as key only is being put again, but now it's value will change.

            temp.val = value; //hum node ki value set kar rahe hain.

            add(H,T,temp); //ab node linkedlist mei add kardi.
        }
       
    }


    public void add(Node head, Node tail, Node n1){
        //n1 is the node to be added

        //tail ke peeche add karni hai node
        
        Node tm1 = tail.prev; //tail minus 1
        tm1.next = n1; 
        n1.next = tail;
        tail.prev = n1;
        n1.prev = tm1;

    }

    public Node delete(Node head, Node temp){

        Node tp1 = temp.next;
        Node tm1 = temp.prev;

        tm1.next = tp1;
        tp1.prev = tm1;

        temp.next = null;
        temp.prev = null; 

        return temp;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
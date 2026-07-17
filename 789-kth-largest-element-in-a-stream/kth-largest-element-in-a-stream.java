class KthLargest {
    PriorityQueue<Integer>pq;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();// we are taking out the smallest number after its size gets exceeded 
            }
        }
        
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>k){
            pq.poll(); // similarly if the after adding new elemnt if the size gets exceeded then remove the smallest element
        }
        return pq.peek();
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
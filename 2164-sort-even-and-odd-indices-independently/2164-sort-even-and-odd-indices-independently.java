class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0;i<nums.length;i+=2){
            queue.add(nums[i]);
        }
        for(int i=0;i<nums.length;i+=2){
            nums[i]=queue.poll();
        }
        queue = new PriorityQueue<>(new MaxHeap());
        for(int i=1;i<nums.length;i+=2){
            queue.add(nums[i]);
        }
        for(int i=1;i<nums.length;i+=2){
            nums[i]=queue.poll();
        }
        return nums;
    }
}
class MaxHeap implements Comparator<Integer>{
    public int compare(Integer ca,Integer cb){
        return cb-ca;
    }
}
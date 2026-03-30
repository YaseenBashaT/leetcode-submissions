class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int remWeight = 0;
        for(int s:stones){
            maxHeap.offer(s);
        }
        while(maxHeap.size()>1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            remWeight = x-y;
            maxHeap.offer(remWeight);
        }
        return maxHeap.isEmpty()?0:maxHeap.poll();
    }
}

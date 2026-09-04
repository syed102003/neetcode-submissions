class Solution {
    public int totalhours(int[]piles , int hourly){
        int th=0;
        for(int i=0;i<piles.length;i++){
            th+=Math.ceil((double)piles[i]/hourly);
        }
        return th;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = findmax(piles);
        while(left<=right){
            int mid = left + (right-left)/2;
            int NH = totalhours(piles,mid);
            if(NH<= h){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    public int findmax(int piles[]){
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        return max;
    }
}

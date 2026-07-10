class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int w=0;
        while(l<r){
             int wi=(Math.min(heights[l],heights[r])*(r-l));
            if(wi>w){
                w=wi;
            }
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
           
          
        }
        return w;
    }
}

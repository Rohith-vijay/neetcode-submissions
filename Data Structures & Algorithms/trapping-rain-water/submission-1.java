class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=height[l];
        int rm=height[r];
        int w=lm-height[l];

        while(l<r){
            if(height[l]<height[r]){
                l++;
                lm=Math.max(lm,height[l]);
                w+=lm-height[l];

            }
            else{
                r--;
                rm=Math.max(rm,height[r]);
                w+=rm-height[r];
            }
        }
        return w;
    }
}

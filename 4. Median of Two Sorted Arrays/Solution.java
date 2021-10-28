class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;
        int[] join = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++){
            join[i] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            join[nums1.length + i] = nums2[i];
        }
        Arrays.sort(join);
        int l = join.length;
        if(l%2==0){
            median = (join[l/2] + join[(l/2) - 1]) / 2.0;
        }else{
            median = join[l/2];
        }
       // System.out.println(Arrays.toString(join));
        return median;
    }
}
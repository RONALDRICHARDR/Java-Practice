
import java.util.Arrays;


class solution{
    
   public double findMedianSortedArray(int[] nums1, int[] nums2){

        int res[]=new int [nums1.length+nums2.length];
        int p=0;
        for(int i=0;i<nums1.length;i++,p++){
            res[p]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            res[++p]=nums2[i];
        }
        Arrays.sort(res);
        int mid=res.length/2;
        if(res.length%2==0){
            return (res[mid]=res[mid-1])/2.0;
        }
        return res[mid]/1.0;
        
    }


}
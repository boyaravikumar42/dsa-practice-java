package practice;

import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
         List<Integer> obj=new ArrayList<>();
         int i=0;
         while(i<n)
         {
            if(nums[i]==i+1)
            i++;
            else
            {
               int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                
                nums[nums[i]-1]=temp;
            }

         }
         System.out.println(Arrays.toString(nums));
         for(int k=0;k<n;k++)
         {
            if(nums[k]!=i+1)
            obj.add(nums[k]);
         }
         
         return obj;
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,2};
        Solution s=new Solution();
        System.out.println(s.findDuplicates(arr));

    }
} 
    


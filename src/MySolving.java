import java.awt.print.Printable;
import java.util.*;
public class MySolving {

//	1)Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
//	The relative order of the elements may be changed.
//
//	Since it is impossible to change the length of the array in some languages,
//	you must instead have the result be placed in the first part of the array nums. 
//	More formally, if there are k elements after removing the duplicates, 
//	then the first k elements of nums should hold the final result.
//	It does not matter what you leave beyond the first k elements.
//
//	Return k after placing the final result in the first k slots of nums.
//
//	Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
//
	   public int removeElement(int[] nums, int val) {
		    int start = 0, end = nums.length-1;
		    while(start<=end){
		        if(nums[start] == val){
		            if(nums[end] == val)
		                end--;    
		            else{
		                nums[start] = nums[end];
		                start++; end --;
		            }
		        }else{
		            start++;
		        }
		    }
		    return start;
		}
//	  2) Given an integer array nums, return true if any value appears
//	   at least twice in the array, and return false if every element is distinct.
	   public boolean containsDuplicate(int[] nums) {
	        Set<Integer> hash_set= new HashSet<Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(hash_set.add(nums[i])==false)
	                return true;
	        }
	        return false;
	    }
        
//======================================================    
//3) Given an integer array nums, find the contiguous subarray
//(containing at least one number) which has the largest sum and return its sum.
//A subarray is a contiguous part of an array.
	   public int maxSubArray(int[] nums) {
	        int currSum=0;
	        int maxSum=nums[0];
	        
	        for(int num:nums){
	            currSum=Math.max(num,currSum+num);
	            maxSum=Math.max(maxSum,currSum);
	            
	        }
	        return maxSum;
	    }
	   
//	===============================================
//4)
	   
	   
	   
	   
	   
	   public List<Integer> spiralOrder(int[][] matrix) {
	     List<Integer> myList =new ArrayList<Integer>();
	     int left , right , top , bottom ;
	     left=0;right=matrix[0].length;top=0;bottom=matrix.length;
	     while(left<right && top<bottom) {
	    	 int i;
	    	 for( i=left;i<right;i++)
	    		 myList.add(matrix[top][i]);
	    	 top++;
	    	 
	    	 for( i=top;i<bottom;i++)
	    		 myList.add(matrix[i][right-1]);
	    	 right--;
	    	 if (!(left<right && top<bottom))
	    		 break;
	    	 
	    	 for( i=right-1;i>=left;i--)
	    		 myList.add(matrix[bottom-1][i]);
	    	 bottom--;
	    	 
	    	 for( i=bottom-1;i>=top;i--)
	    		 myList.add(matrix[i][left]);
	    	 left++;
	     }
	     
	     return myList;
	     
	     
	   }
	   
	   
//	 ===========================================================
//	   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//			   You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//			   You can return the answer in any order.
	    public int[] twoSum(int[] nums, int target) {
	        Hashtable<Integer, Integer> myDict=new Hashtable<Integer,Integer>();
	        int i=0;
	        int sec_value;
	        int [] result=new int[2] ;
	        for(i=0;i<nums.length;i++) {
	        	myDict.put(nums[i],i);
	        	
	        }
	        for(i=0;i<nums.length;i++)
	        	System.out.println(myDict.get(nums[i]));
	        	
	        System.out.println("hi");
	        for(i=0;i<nums.length;i++) {
	        	
	        	sec_value=target-nums[i];

	        	if(myDict.get(sec_value)!=null && i!=myDict.get(sec_value)) {
                   
	        		System.out.println("hi");
	        		  result[0]=i;
	        		  result[1]=myDict.get(sec_value);
	        		
	        	}
	        }
	       
	        return result;
	    }
	    
	    
	    public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int newSize=m+n;
	        int i=0;
	        int k=0;
	        int j=0;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySolving s=new MySolving();
		
		int []a= {3,3};
		int []arr=s.twoSum(a,6);
		for(int i=0;i<2;i++)
          System.out.println(arr[i]);
	}

}
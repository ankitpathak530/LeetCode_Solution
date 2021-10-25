package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class Median_Of_Two_Sorted_Array {

	public static void main(String[] args) {
		
        //Call method findMedianSortedArrays( [],[] )
	}
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         
         List<Integer> al = new ArrayList<Integer>();
         
         for(int i:nums1) al.add(i);
         for(int i:nums2) al.add(i);
        
         List<Integer> sortedList = al.stream().sorted().collect(Collectors.toList());
        
         int size = sortedList.size();
         double sum = 0;

         int s = size/2;
       
         if(size % 2 == 0)
             sum = (sortedList.get(s) + sortedList.get(s-1) )/2.0;
         else
             sum =  sortedList.get(s);
         
        
        return sum;
    }
}

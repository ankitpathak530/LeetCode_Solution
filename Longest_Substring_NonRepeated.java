package LeetCode;

public class Longest_Substring_NonRepeated {
      public static void main(String[] args){
    	  
    	  //Call lengthOfLongestSubstring(String) method
      }

      public int lengthOfLongestSubstring(String s) {          
          int max = 0;

          for(int i=0; i<s.length(); i++)
          {
              String str = "";
              
             for(int j=i; j<s.length(); j++)
              {                                       
                  if( str.indexOf(s.charAt(j)) == -1 )
                         str += Character.toString(s.charAt(j));
                  else
                  {
                      if(str.length() > max)
                      {
                            max = str.length();   
                            str = "";
                      }
                      break;
                  }
                  if(str != "" && str.length() > max)    max = str.length(); 
              }
          }
        return max;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb1.append(Character.toLowerCase(ch));

            }
           
        }
         StringBuilder sb2 = new StringBuilder(sb1);
         sb2.reverse();
         return sb1.toString().equals(sb2.toString());
    }

}

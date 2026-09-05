class Solution {
    public boolean isPalindromic(String s) {
StringBuilder sb=new StringBuilder();
for (char ch:s.toCharArray()){
    int ascII = (int)ch;
String binary = String.format ("%8s", Integer.toBinaryString(ascII)).replace(' ','0');
sb.append(binary);

}
//checking palindrome
String str = sb.toString();
int i =0;
int j =str.length()-1;
while (i<j)
{
    if (str.charAt(i)!=str.charAt(j)) return false;
    i++;
    j--; 

 }
return true; 
    }
   
}

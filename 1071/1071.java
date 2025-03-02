class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int i=0;
        int n=str1.length();
        int m=str2.length();

        if(!(str1 + str2).equals(str2 + str1)){
            return result.toString();
        }
        int length=Math.min(n, m);
        while(length>=0){
            if(m%length!=0 || n%length!=0){
                length--;
            } else{
                result.append(str1.substring(0, length));
                break;
            }
        }       
        return result.toString();
    }
}
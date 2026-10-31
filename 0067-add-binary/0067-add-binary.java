class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        // Loop from the rightmost ends of both strings until both are processed and carry is cleared
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to int
                i--;
            }
            
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
                j--;
            }
            
            // Append the current bit (sum % 2) to the result builder
            result.append(sum % 2);
            
            // Calculate the new carry (sum / 2)
            carry = sum / 2;
        }
        
        // Since we added bits from right to left, reverse the result string
        return result.reverse().toString();
    }
}
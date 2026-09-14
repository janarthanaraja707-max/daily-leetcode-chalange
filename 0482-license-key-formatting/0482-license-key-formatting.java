class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            
            if (s.charAt(i) == '-') {
                continue;
            }

            if (count == k) {
                result.append('-');
                count = 0;
            }

            result.append(Character.toUpperCase(s.charAt(i)));
            count++;
        }

        return result.reverse().toString();
    }
}
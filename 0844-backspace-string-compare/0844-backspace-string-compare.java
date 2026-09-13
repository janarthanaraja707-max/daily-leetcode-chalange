class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (a.length() > 0) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (b.length() > 0) {
                    b.deleteCharAt(b.length() - 1);
                }
            } else {
                b.append(t.charAt(i));
            }
        }

        return a.toString().equals(b.toString());
    }
}
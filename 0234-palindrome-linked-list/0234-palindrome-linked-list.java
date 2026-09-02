
class Solution {
    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode current = head;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        for (int i = 0; i < list.size() / 2; i++) {

            int j = list.size() - 1 - i;

            if (list.get(i) != list.get(j)) {
                return false;
            }
        }

        return true;
    }
}

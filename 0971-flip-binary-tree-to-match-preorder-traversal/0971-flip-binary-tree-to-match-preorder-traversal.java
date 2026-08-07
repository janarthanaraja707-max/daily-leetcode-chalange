class Solution {

    List<Integer> ans = new ArrayList<>();
    int index = 0;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {

        if (!dfs(root, voyage)) {
            return Arrays.asList(-1);
        }

        return ans;
    }

    private boolean dfs(TreeNode node, int[] voyage) {

        if (node == null)
            return true;

        if (node.val != voyage[index])
            return false;

        index++;

        if (node.left != null &&
            index < voyage.length &&
            node.left.val != voyage[index]) {

            ans.add(node.val);

            return dfs(node.right, voyage) &&
                   dfs(node.left, voyage);
        }

        return dfs(node.left, voyage) &&
               dfs(node.right, voyage);
    }
}
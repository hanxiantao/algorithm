package com.hand.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, root, result);
        return result;
    }

    private void helper(int depth, Node node, List<List<Integer>> result) {
        if (node == null) return;
        if (depth >= result.size()) result.add(new ArrayList<>());
        result.get(depth).add(node.val);
        for (Node child : node.children) {
            helper(depth + 1, child, result);
        }
    }
}

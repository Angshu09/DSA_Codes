package revise_DSA.Trees.Questions;

public class VerticalOrderTraversal {
//    class Solution {
//        public List<List<Integer>> verticalTraversal(TreeNode root) {
//            List<List<Integer>> ans = new ArrayList<>();
//            if (root == null) return ans;
//
//            // Priority queue to store the nodes with (column, row, value)
//            Queue<Tuple> q = new ArrayDeque<>();
//            q.offer(new Tuple(0, 0, root));
//
//            // TreeMap to store the result with sorted columns and rows
//            Map<Integer, Map<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
//
//            while (!q.isEmpty()) {
//                Tuple tuple = q.poll();
//                int col = tuple.col;
//                int row = tuple.row;
//                TreeNode node = tuple.node;
//
//                // Insert node value into TreeMap<column, <row, PriorityQueue of values>>
//                map.putIfAbsent(col, new TreeMap<>());
//                map.get(col).putIfAbsent(row, new PriorityQueue<>());
//                map.get(col).get(row).offer(node.val);
//
//                // Traverse the left and right subtrees
//                if (node.left != null) {
//                    q.offer(new Tuple(col - 1, row + 1, node.left));
//                }
//                if (node.right != null) {
//                    q.offer(new Tuple(col + 1, row + 1, node.right));
//                }
//            }
//
//            // Prepare the result from TreeMap
//            for (Map.Entry<Integer, Map<Integer, PriorityQueue<Integer>>> entry : map.entrySet()) {
//                List<Integer> vertical = new ArrayList<>();
//                for (PriorityQueue<Integer> pq : entry.getValue().values()) {
//                    while (!pq.isEmpty()) {
//                        vertical.add(pq.poll());
//                    }
//                }
//                ans.add(vertical);
//            }
//
//            return ans;
//        }
//
//        // Helper class to store (column, row, node)
//        private class Tuple {
//            int col, row;
//            TreeNode node;
//
//            public Tuple(int col, int row, TreeNode node) {
//                this.col = col;
//                this.row = row;
//                this.node = node;
//            }
//        }
//    }
}

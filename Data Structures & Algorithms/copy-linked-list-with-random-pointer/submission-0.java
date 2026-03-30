/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToNew = new HashMap<>();
        oldToNew.put(null, null);

        Node current = head;
        while(current != null){
            Node value = new Node(current.val);
            oldToNew.put(current, value);
            current = current.next;
        }

        current = head;
        while(current != null){
            Node newNode = oldToNew.get(current);
            newNode.next = oldToNew.get(current.next);
            newNode.random = oldToNew.get(current.random);
            current = current.next;
        }
        return oldToNew.get(head);
    }
}

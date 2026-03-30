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
        HashMap<Node, Node> listCopy = new HashMap<>();
        listCopy.put(null, null);
        Node cur = head;

        while(cur!=null){
            Node copy = new Node(cur.val);
            listCopy.put(cur, copy);
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            Node copy = listCopy.get(cur);
            copy.next = listCopy.get(cur.next);
            copy.random = listCopy.get(cur.random);
            cur = cur.next;
        }
        return listCopy.get(head);
    }
}

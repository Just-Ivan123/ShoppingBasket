public class Queue {
    private Node first;
    private Node last;
    public Queue() {
        first = null;
    }
    public void add(String p) {
        Node node = new Node(p);
        if (first == null) {
            node.nextNode = null;
            first = node;
            last = node;
        } else {
            last.nextNode = node;
            node.nextNode = null;
            last = node;
        }
    }
    public Node remove() {
        Node temp = first;
        Node second = null;
        if(first == null){
            return null;
        }
        while (temp.nextNode != null){
            second = temp;
            temp = temp.nextNode;
            if(temp.nextNode == null){
                second.nextNode = null;
                break;
            }
        }
        return temp;
    }
    public void printList() {
        Node currentNode = first;
        while(currentNode != null) {
            currentNode.printLink();
            currentNode = currentNode.nextNode;
        }
        System.out.println("");
    }
}


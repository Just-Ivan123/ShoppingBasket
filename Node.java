public class Node {
    public String product;
    public Node nextNode;

    public Node(String p){
        product = p;
    }
    public void printLink(){
        System.out.println(product);
    }
}

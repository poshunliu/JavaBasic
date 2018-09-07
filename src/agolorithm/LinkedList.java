package agolorithm;


public class LinkedList {

    public Node build(Node[] nodes){

        for(int i=1; i<nodes.length; i++){
            Node prev = nodes[i-1];
            prev.next= nodes[i];
        }
        return nodes[0];
    }

    public int getLength(Node head){
        int count =1;
        while (head.getNext() != null){
            head = head.getNext();
            count++;
        }return count;
    }

    public static void main(String[] arg){
        LinkedList linkedList = new LinkedList();
        Node[] nodes = {new Node(10),new Node(0),new Node(3)};

        linkedList.build(nodes);
        int res = linkedList.getLength(nodes[0]);
        System.out.println(res);
    }
}




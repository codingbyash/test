public class LL {
//    Node head;
//    class Node{
//        String data;
//        Node next;
//        Node(String data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    //add first element in linkedlist
//    public  void addFirst(String data){
//        Node newNode=new Node(data);
//        if(head==null){
//            head=newNode;
//            return;
//        }
//        newNode.next=head;
//        head=newNode;
//    }
//    //adding element at last in linkedlist
//    public void addLast(String data){
//        Node newNode= new Node(data);
//        if (head==null){
//            head=newNode;
//            return;
//        }
//        Node currNode=head;
//        while(currNode.next!=null){
//            currNode= currNode.next;
//        }
//        currNode.next=newNode;
//    }
//    public void printList(){
//        Node currNode=head;
//        while (currNode!=null){
//            System.out.print(currNode.data+ " -> ");
//            currNode=currNode.next;
//        }
//        System.out.println("NULL");
//    }
//    public static void main(String[] args) {
//        LL list=new LL();
//        list.addFirst("bro");
//        list.addFirst("you");
//        list.addFirst("are");
//        list.addFirst("How");
//        list.addLast("adding at last");
//        list.addLast("adding at last secondly");
//        list.printList();
//    }
//}
//


//public class LL {
//    Node head; // Declare a reference to the head node of the linked list
//
//    class Node {
//        String data; // Data held by the node
//        Node next; // Reference to the next node in the linked list
//
//        Node(String data) { // Constructor to create a new node with data
//            this.data = data;
//            this.next = null; // Initialize next as null
//        }
//    }
//
//    // Method to add the first element in the linked list
//    public void addFirst(String data) {
//        Node newNode = new Node(data); // Create a new node with the given data
//        if (head == null) { // If the list is empty
//            head = newNode; // Set the new node as the head
//            return;
//        }
//        newNode.next = head; // Set the next of the new node to the current head
//        head = newNode; // Update the head to the new node
//    }
//
//    // Method to add an element at the last position in the linked list
//    public void addLast(String data) {
//        Node newNode = new Node(data); // Create a new node with the given data
//        if (head == null) { // If the list is empty
//            head = newNode; // Set the new node as the head
//            return;
//        }
//        Node currNode = head; // Initialize a current node to traverse the list
//        while (currNode.next != null) { // Traverse to the last node
//            currNode = currNode.next;
//        }
//        currNode.next = newNode; // Set the next of the last node to the new node
//    }
//
//    // Method to print the elements of the linked list
//    public void printList() {
//        Node currNode = head; // Start from the head of the list
//        while (currNode != null) { // Traverse until the end of the list
//            System.out.print(currNode.data + " -> "); // Print current node's data
//            currNode = currNode.next; // Move to the next node
//        }
//        System.out.println("NULL"); // Print NULL to indicate the end of the list
//    }
//
//    public static void main(String[] args) {
//        LL list = new LL(); // Create an instance of the LL class (linked list)
//        // Add elements to the linked list
//        list.addFirst("bro");
//        list.addFirst("you");
//        list.addFirst("are");
//        list.addFirst("How");
//        list.addLast("adding at second last");
//        list.addLast("adding at last ");
////        // Print the linked list
//        list.printList();
//    }
//}
//
//
//
//
//
//
//
public static void main(String[] args) {
    System.out.println("Hello Swarna");
}

}











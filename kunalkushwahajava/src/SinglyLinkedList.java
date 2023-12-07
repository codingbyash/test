/*
public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node (int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insertFirst(int value){
        Node temp=new Node(value);
        temp.next=head;
        head=temp;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
       
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node temp=new Node(value);
        tail.next=temp;
        tail=temp;
        size++;
    }
    public void insertAtMiddle(int value,int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node =new Node(value,temp.next);
        temp.next=node;

    }
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;

    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-1);
        int val = tail.value;
        tail = secondLast;
        tail.next=null;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;

    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }


    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(99);
        list.insertLast(100);
        list.insertAtMiddle(76,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        list.delete(3);
        list.display();
        System.out.println(list.find(99));
    }




}
*/
/*public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node middle() {
        if (head == null) {
            return null; // Empty list
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Node middleNode = list.middle();
        if (middleNode != null) {
            System.out.println("Middle node value: " + middleNode.value);
        } else {
            System.out.println("List is empty");
        }

    }*/

    // Java Program for the above approach
import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.util.Scanner;

class singlyLinkedList {

/*
        Node head;

        */
    /*Creating a new Node*//*

        class Node {
            int data;
            Node next;
            public Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        */
    /*Function to add a new Node*//*

        public void pushNode(int data)
        {
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
        }


        */
    /*Finding the length of the list.*//*

        public int getLen()
        {
            int length = 0;
            Node temp = head;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
            return length;
        }

        */
    /*Printing the middle element of the list.*//*

        public void printMiddle()
        {
            if (head != null) {
                int length = getLen();
                Node temp = head;
                int middleLength = length / 2;
                while (middleLength != 0) {
                    temp = temp.next;
                    middleLength--;
                }
                System.out.print("The middle element is ["
                        + temp.data + "]");
                System.out.println();
            }
        }
        */
    /*Displaying the elements in the list*//*

        public void printNode()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("Null"
                    + "\n");
        }


        public static void main(String[] args)
        {
            singlyLinkedList list = new singlyLinkedList();
            for (int i = 5; i >= 1; i--) {
                list.pushNode(i);
                list.printNode();
                list.printMiddle();
            }
        }
*/

/*
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        public static Node insertAtBeginning(int data, Node head) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            return head;
        }
        public static Node insertAtEnd(int data,Node head){
            Node curr=new Node(data);
            if (head==null){
                return curr;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=curr;
            return head;
        }
        public static void displayNodes(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    };
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the size of LL");
            int n = sc.nextInt();
            Node head = null;
            for (int i = 0; i <= n; i++) {
                System.out.println("Enter the value to insert at beginning: ");
                int value = sc.nextInt();
                head = Node.insertAtBeginning(value, head);
            }
            System.out.println("Linked list elements: ");
            Node.displayNodes(head);
        }
*/


//REVERSING A LINKEDLIST USING HEAD
    static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
        public static Node insertAtbegining(int data,Node head){

            Node temp=new Node(data);
            temp.next=head;
            head=temp;
            return head;
        }
        public static void reverse(Node head){
            if(head==null || head.next==null){
                return;}
            Node prev=head;
            Node curr=prev.next;
            while(curr!=null){
                Node next=curr.next;
                //tikram shuru
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            head.next = null;  // Set the next reference of the original head to null
            head = prev;
            System.out.println();
            Node.displayNode(head);


        }
        public static Node deleteNode(Node head){
            Node temp=head;
            Node temp2=temp.next;
            temp.next=temp2.next;
            return head;


        }
        public static void displayNode(Node head){
            Node temp=head;
            while (temp != null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.print("null");
        }
}
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        Node head=null;
        System.out.println("ENter the nodes");
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head= Node.insertAtbegining(data,head);
        }
        Node.displayNode(head);
        Node.reverse(head);
//        Node.deleteNode(head);
//        Node.displayNode(head);


    }
/*
    //-----------------DELETING A NODE IN A LINKEDLIST WHWN YOU AHAVE ACCES TO THE NODE INDIRECTLY-----------------

    public static class Node{

        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    public static Node InsertAtEnd(Node head,int data){
            Node curr=new Node(data);
            if (head==null){
                head=curr;
            }
            else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next=curr;
            }
        return head;

    }
    public static void displayNode(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        System.out.println("null");
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of ll: ");
        int n= sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            head=Node.InsertAtEnd(head,data);
        }

        Node.displayNode(head);
        Node.diaplayhead(head)

    }*/

 /*   public static void main(String[] args) {
        int n = 7;
        int arr[] = {1, 2, 3, 4, 3, 2, 1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[n - i - 1]) {
                count++;
                System.out.println("check palindrome");
            }
        }
        if (count == n) {
            System.out.println("yes palindrome");
        } else if (count < n) {
            System.out.println("no palindrome");

        }
    }*/
}

















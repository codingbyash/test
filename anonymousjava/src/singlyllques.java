public class singlyllques {
    //finding the middle of a linkedlist entered by user
    private Node head;
    private Node tail;
    private int size;
    private singlyllques(){
        this.size=0;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void add() {
        Node temp=new Node(int value);




    }

        public Node middle(int value){
            int n=0;
            Node temp=head;
            while(head!=null){
                n++;
                temp=temp.next;
            }
        int half=n/2;
            while(half--){
                temp=temp.next;
            }
            return temp;
        }



    }

    public static void main(String[] args) {
        singlyllques sq=new singlyllques();
        System.out.println(sq.middle(5));
    }
}

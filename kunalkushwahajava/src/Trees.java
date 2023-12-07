import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

//package com.company;
//public class Trees {
      /*  static class Node{
            int data;
            Node left;
            Node right;

            public Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        static class BinaryTree{
            static int index=-1;
            public static Node buildTree(int nodes[]){
                index++;
                if(nodes[index]==-1){
                    return null;
                }
                Node newNode=new Node(nodes[index]);
                newNode.left=buildTree(nodes);
                newNode.right=buildTree(nodes);
                return newNode;
            }
        }
        //this is the preorder traversal, in this the node is written first and then left and then the right(APNA NORMAL WALA HAI YE)
        public static void preorder(Node root){
            if(root == null){
                System.out.print(" null" + " " );
                return;
            }
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        public static void inorder(Node root){
            if(root==null){
                System.out.print(" null "+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data+ " ");
            inorder(root.right);
        }

        public static void postorder(Node root)
        {
            if(root==null){
                System.out.print(" null "+" ");
                return;
            }
            postorder(root.left);
        postorder(root.right);
            System.out.print(root.data+" ");
        }

    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);

        preorder(root);
//        System.out.println();
        System.out.println("\nye raha inorder");
        inorder(root);



//        System.out.println
        System.out.println(" \nyr raha postorder");
        postorder(root);

    }

*/


//    public class CharacterDemo{
//        char ch1 = 'A';
//        Character ch2 = ch1;
//        Character ch3 = 'B';
//        char ch4 = ch3;
//        Integer object = new Integer(16);
//        int i1 = object.intValue();
////        Integer j = Integer.valueOf("ABC");
//        System.out.println(ch2);
//
//
//
//    }
//
//
//}

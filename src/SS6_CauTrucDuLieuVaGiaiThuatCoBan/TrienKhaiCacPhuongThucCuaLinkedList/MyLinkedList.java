package SS6_CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucCuaLinkedList;

import java.util.LinkedList;

public class MyLinkedList<E> implements Cloneable {
    private Node head;
    private int numNode = 0;

    public MyLinkedList(){
        head = null;
    }
    public  void add(int index, E element){
        if(index < 0){
            throw new IndexOutOfBoundsException("Index: "+ index + ", numNode: " + numNode);
        }
        if (index == 0){
            addFirst(element);
        }else {
            Node temp = head;
            for (int i = 0; i < index -1 ; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;
            numNode++;
        }
    }
        public void addFirst(E e){
            Node newNode = new Node(e);
            if(head == null){
                head = newNode;
            }else {
                newNode.next = head;
                head = newNode;
            }
            numNode++;
        }

        public void printList(){
            Node temp = head;
                System.out.println("=====");
                int i = 0;
                while (temp != null){
                    System.out.println("i= "+i+" value " + temp.data);
                    temp = temp.next;
                    i++;
                }
        }

        public void addLast(E e){
            if (head == null)
                head = new Node(e);
            else{
             Node temp = head;
                for (int i = 0; i < numNode - 1  ; i++) {
                    temp = temp.next;
                }
                temp.next = new Node(e);
            }
            numNode ++;
        }

        public E remove(int index){
        Node temp = head;
        Node holder;
        if(index < 0 || index > numNode){
            throw new IndexOutOfBoundsException("ngoai mang");
        }
            for (int i = 0; i < index -1 ; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = temp.next.next;
            numNode --;
            return (E) holder.data;

        }
        public boolean remove(Object object){
        Node temp = head;
        Node holder = head;
        boolean isRemoved = false;
            for (int i = 0; i < numNode ; i++) {
                if(object.equals(temp.data)){
                    holder.next = temp.next;
                    numNode--;
                    isRemoved =true;
                }
                holder = temp;
                temp = temp.next;
            }
            return isRemoved;
        }

        public MyLinkedList<E> clone(){
        try{
            MyLinkedList<E> list = (MyLinkedList<E>) super.clone();
            return list;
        }catch (CloneNotSupportedException e){
            throw new InternalError(e);
        }
        }
//        public boolean contains(E e){
//        return indexOf(e) != -1;
//        }
//    public int indexOf(E e){
//        Node temp = head;
//        for (int i = 0; i < numNode; i++) {
//
//        }
//    }







    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return data;
        }
    }
}
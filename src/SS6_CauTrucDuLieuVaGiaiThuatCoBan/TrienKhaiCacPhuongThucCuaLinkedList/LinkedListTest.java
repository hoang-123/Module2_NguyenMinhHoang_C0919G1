package SS6_CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucCuaLinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(4);
        list.addFirst(2);
        list.addFirst(1);
        list.add(1,5);
        list.addLast(4);

        list.printList();
        System.out.println("========");
        MyLinkedList<Integer> list2 = list.clone();
        list2.printList();
    }
}

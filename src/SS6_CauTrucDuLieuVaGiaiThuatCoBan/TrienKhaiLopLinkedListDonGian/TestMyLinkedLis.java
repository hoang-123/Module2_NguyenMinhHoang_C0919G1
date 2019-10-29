package SS6_CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiLopLinkedListDonGian;

public class TestMyLinkedLis {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList("CodeGym");
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,10);
        ll.add(4,9);
        ll.printList();
        System.out.println("++++++++++");
        System.out.println(ll.getData(ll.get(3)));
    }
}

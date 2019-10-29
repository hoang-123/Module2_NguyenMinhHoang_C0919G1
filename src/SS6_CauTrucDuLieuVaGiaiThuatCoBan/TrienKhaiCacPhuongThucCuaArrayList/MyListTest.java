package SS6_CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucCuaArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> arr = new MyList<>();
        arr.add(0,"nguyen");
        arr.add(1,"minh");
        arr.add(2,"hoang");
        arr.add(2,"code");
        arr.show();

        System.out.println(arr.indexOf(null));
//        System.out.println("==============");
//
//        MyList<String> arr2 = (MyList<String>) arr.clone();
//        arr2.add("123");
//        arr2.show();
//        System.out.println("==============");
//        MyList<String> arr3 = (MyList<String>) arr.clone();
//        arr3.show();








//        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add(44);
//        arrayList.add(5);
//        arrayList.add(1,1);
//        System.out.println(arrayList);

    }
}

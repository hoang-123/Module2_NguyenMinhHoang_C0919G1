package SS6_CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucCuaArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException("loiiii");
        }
        elements = new Object[capacity];
    }

    public boolean add(E e) {
        ensureCapacity(1);
        elements[size++] = e;
        return true;
    }

    private void ensureCapa() {
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(int index, E e) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Ko nam trong mang");
        }
        ensureCapacity(1);
        System.arraycopy(elements,  index, elements, index + 1 , size - index);
        elements[index] = e;
        size++;
    }
    public void ensureCapacity(int minCapacity){
        elements = Arrays.copyOf(elements, elements.length + minCapacity);
    }


    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    public void clear(){
        for (int i = 0; i < size ; i++) {
            elements[i] = null;
        }
        size = 0;
    }


    public void show(){
        for (int i = 0; i < elements.length ; i++) {
            System.out.println("i= " + i + " value: " + elements[i]);
        }
    }
    public E remove(int index){
       if(index < 0 || index > size){
           throw new IndexOutOfBoundsException("Nam ngoai mang");
       }
        E objRemoved = (E) elements[index];
       System.arraycopy(elements, index+1, elements, index,  size-index-1);
        elements[size - 1] = null;
        size--;
        return objRemoved;

//        Object temp = this.elements[index];
//        for (int i = index; i < (elements.length -1) ; i++) {
//            elements[i] = elements[i +1];
//        }
//        size --;
//        elements = Arrays.copyOf(elements, size);
//        return (E) temp;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public Object clone(){
        MyList<E> newMyList = new MyList<>();
        newMyList.elements = elements;
        newMyList.size = size;
        return newMyList;
    }
    boolean contains(E e){
        return indexOf(e) >= 0;
    }











    }






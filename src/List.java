import java.util.Arrays;

public class List<E> {
    // 1 - size xac dinh so phan tu trong danh sach;

    // 2 - so luong phan tu toi da la 10;

    // 3 - mang doi tuong chua cac phan tu trong danh sach;

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 4;
    private Object elements[];

    // phuong thuc khoi tao ko tham so;
    public List() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // thay doi phan tu toi da;
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // method them 1 phan tu moi vao danh sach;
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    // truy cap 1 phan tu trong danh sach;
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}

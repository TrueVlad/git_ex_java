public class Array_1 implements Array {
    int a[] = new int[4];
    int size = 0;

    @Override                                           // переписываем метод !?
    public int Get(int i) {                            // отличается от MeArray, выводится элемент с конца
        if (i<a.length)
        return a[a.length - i - 1];
        else
            return a[0];
    }

    public boolean Add(int i) {
        if (size != a.length) {
            a[size] = i;
            size++;
            return true;
        } else return false;
    }
}

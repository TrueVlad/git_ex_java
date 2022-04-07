public class MeArray implements Array {                 // что бы сделать класс, классом реализации, нужно написать implements
    int a[] = new int[4];
    int size = 0;

    @Override                                           // переписываем метод !?
    public int Get(int i) {
        return a[i];
    }

    public boolean Add(int i) {
        if (size != a.length) {
            a[size] = i;
            size++;
            return true;
        } else return false;
    }
}

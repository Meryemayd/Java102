package OdevGenericList;

public class MyList <T>{
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyList(){
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public MyList(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.array = new Object[capacity];
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public int getCapacity(){
        return array.length;
    }

    public void add(T data){
        ensureCapacity();
        array[size++] = data;
    }

    public T get(int index){
        checkIndex(index);
        return (T) array[index];
    }

    public void remove(int index){
        checkIndex(index);
        if(size - 1 - index >= 0){
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        array[--size] = null;
    }

    public void set(int index, T data){
        checkIndex(index);
        array[index] = data;
    }

    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++){
            result.append(array[i]);
            if(i < size - 1){
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

    public int indexOf(T data){
        for(int i = 0; i < size; i++){
            if(data.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i = size - 1; i >= 0 ; i--){
            if(data.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T[] toArray(){
        T[] result = (T[]) new Object[size];
        System.arraycopy(array, 0, result, 0, size);
        return result;
    }

    public void clear(){
        for (int  i = 0; i < size; i++){
            array[i] = null;
        }
        size = 0;
    }

    public MyList<T> sublist(int start, int finish){
        checkSublistIndices(start, finish);
        int sublistSize = finish - start + 1;
        MyList<T> sublist = new MyList<>(sublistSize);
        System.arraycopy(array, start, sublist.array, 0, sublistSize);
        sublist.size = sublistSize;
        return sublist;
    }

    public boolean contains(T data){
        return indexOf(data) != -1;
    }

    private void ensureCapacity(){
        if(size == array.length){
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    private void checkSublistIndices(int start, int finish){
        if(start < 0 || finish >= size || start > finish){
            throw new IndexOutOfBoundsException("Invalid sublist indices: " + start + ", " + finish);
        }
    }
}


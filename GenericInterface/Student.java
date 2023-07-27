package GenericInterface;

public class Student <T> implements IDatabase <T>{


    @Override
    public boolean insert(T data) {
        System.out.println(data);
        System.out.println("veri eklendi");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("veri silindi");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("veri güncellendi");
        return true;
    }

    @Override
    public T select() {
        System.out.println("veri çekildi");
        return null;
    }
}

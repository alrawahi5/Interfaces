public interface ShopsInterface {

    default Integer id(Integer id) {
        id = 1;
        for (int i = 1; i <= 100; i++) {
            System.out.print(id);
            id++;
        }
        return id;
    }

    String name();

    String address();

    String phoneNumber();
}

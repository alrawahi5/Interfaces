public interface ItemInterface {

    default Integer id(Integer id) {
        id = 1;
        for (int i = 1; i <= 100; i++) {
            System.out.print(id);
            id++;
        }
        return id;
    }

    Integer quantity();

    String name();

    Integer price();
}

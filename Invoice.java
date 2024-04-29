import java.util.List;

public interface Invoice {
    default Integer id(Integer id) {
        id = 1;
        for (int i = 1; i <= 100; i++) {
            System.out.print(id);
            id++;
        }
        return id;
    }
    String items(List<String> items);
    Integer quantity();
    void date();
    void paidAmount();
    void balance();
}

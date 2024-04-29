import java.util.List;

public interface Invoice {
    String ID();
    String items(List<String> items);
    Integer quantity();
    void date();
    void paidAmount();
    void balance();
}

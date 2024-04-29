import java.util.Date;
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

    String customerFullname();

    String items(List<String> items);

    Integer quantity();

    default void date() {
        Date date = new Date();
        System.out.println("Date is: " + date);
    }

    void totalAmmount();

    void paidAmount();

    void balance();
}

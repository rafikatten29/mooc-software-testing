package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tudelft.invoicemocked.Invoice;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    void checkDiscounts() {

        Product oven = new Product("Electic oven", 200, "HOME");
        Product computer = new Product("Computer", 500, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> results = Arrays.asList(oven, computer);
        Mockito.when(dao.all()).thenReturn(results);

        DiscountApplier discountApplier = new DiscountApplier(dao);
        discountApplier.setNewPrices();

        for(Product product : dao.all()) {
            if(product.getCategory().equals("BUSINESS")) {
                Assertions.assertEquals(550, product.getPrice());
            }
            if(product.getCategory().equals("HOME")) {
                Assertions.assertEquals(180, product.getPrice());
            }
        }
    }

}

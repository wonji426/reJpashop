package rejpabook.rejpashop.service;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import rejpabook.rejpashop.domain.item.Book;

@SpringBootTest
public class ItemUpdateTest {

    @Autowired
    EntityManager em;
    
    @Test
    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        //TX
        book.setName("newBook");

        //변경감지 == dirty checking
        //TX commit


    }
}

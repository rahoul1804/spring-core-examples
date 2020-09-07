package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service

public class ProductService {
    /**
     * REQUIRED (default) ---- 1->if doesn't recieves it creates . 1-> if recieves , its uses recieved one
     * REQUIRES_NEW
     * MANDATORY
     * NEVER
     * SUPPORTS
     * NOT_SUPPORTED
     * NESTED
     *
     * a() ---> b()
     */

    @Autowired
    private ProductRepository productRepository;

    @Transactional/*(propagation = Propagation.REQUIRED)*/
    public void addTenProducts() { // created
        for (int i=1; i<=10; i++) {
            productRepository.addProduct("Product " + i);
            if(i==5) throw RunTimeExcpetion();
        }
    } // commits
}

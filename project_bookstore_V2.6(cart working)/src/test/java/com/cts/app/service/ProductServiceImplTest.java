package com.cts.app.service;
import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class ProductServiceImplTest {

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
//
//	@Test
//	void testSetProductDao() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetAllProduct() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetProductByName() {
//		fail("Not yet implemented");
//	}
//
//}

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.cts.app.dao.ProductDao;
import com.cts.app.exceptions.ClassNotFoundException;
import com.cts.app.exceptions.SystemException;
import com.cts.app.model.Product;

public class ProductServiceImplTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp1() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
    @Mock
    private ProductDao productDao;
    
    @InjectMocks
    private ProductServiceImpl productService;
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    public void testGetAllProduct() {
        Product product1 = new Product(1,1, "Book1", "Author1", "Desc1", "100.0", "5", 22);
        Product product2 = new Product(2,2, "Book2", "Author2", "Desc2", "200.0", "10", 15);
        List<Product> expectedProducts = Arrays.asList(product1, product2);
        
        Mockito.when(productDao.getAllProduct()).thenReturn(expectedProducts);
        
        List<Product> actualProducts = productService.getAllProduct();
        
        assertEquals(expectedProducts, actualProducts);
        Mockito.verify(productDao).getAllProduct();
    }
    
    @Test
    public void testGetProductByName_whenProductExists() throws ClassNotFoundException, SystemException {
        String prodName = "Book1";
        Product expectedProduct = new Product(1,1, "Book1", "Author1", "Desc1", "100.0", "5", 22);
        
        Mockito.when(productDao.getProductByName(prodName)).thenReturn(Optional.of(expectedProduct));
        
        Product actualProduct = productService.getProductByName(prodName);
        
        assertEquals(expectedProduct, actualProduct);
        Mockito.verify(productDao).getProductByName(prodName);
    }
    
    @Test
    public void testGetProductByName_whenProductDoesNotExist() throws ClassNotFoundException, SystemException {
        String prodName = "NonExistingProduct";
        
        Mockito.when(productDao.getProductByName(prodName)).thenReturn(Optional.empty());
        
        ClassNotFoundException exception = assertThrows(ClassNotFoundException.class, () -> {
            productService.getProductByName(prodName);
        });
        
        assertEquals("Product NAME does not Exists : " + prodName, exception.getMessage());
        Mockito.verify(productDao).getProductByName(prodName);
    }
}

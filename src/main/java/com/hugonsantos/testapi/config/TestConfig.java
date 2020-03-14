package com.hugonsantos.testapi.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hugonsantos.testapi.entities.Category;
import com.hugonsantos.testapi.entities.Order;
import com.hugonsantos.testapi.entities.Product;
import com.hugonsantos.testapi.entities.User;
import com.hugonsantos.testapi.entities.enums.OrderStatus;
import com.hugonsantos.testapi.repositories.CategoryRepository;
import com.hugonsantos.testapi.repositories.OrderRepository;
import com.hugonsantos.testapi.repositories.ProductRepository;
import com.hugonsantos.testapi.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public TestConfig() {
			
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Lorem ipsum dolor sit amet, consectetur", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Lorem ipsum dolor sit amet, consectetur", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Lorem ipsum dolor sit amet, consectetur", 1200.9, "");
		Product p5 = new Product(null, "Rails for Dummies", "Lorem ipsum dolor sit amet, consectetur", 100.99, "");
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Hugo Nascimento", "hugonsantos03@gmail.com", "948523236", "Hugo100");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
}

package guru.springframework.services;


import guru.springframework.domain.Author;
import guru.springframework.domain.Product;
import guru.springframework.domain.ProductCategory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private Map<Integer, Product> productMap;

    public ProductServiceImpl() {
        loadProducts();
    }

    private void loadProducts() {
        Author jt = new Author();
        jt.setFirstName("John");
        jt.setLastName("Thompson");
        jt.setId(1);
        jt.setImage("no_avatar.jpg");
        ProductCategory springIntroCat = new ProductCategory();
        springIntroCat.setId(1);
        springIntroCat.setCategory("Spring Introduction");
        ProductCategory springCoreCat = new ProductCategory();
        springCoreCat.setId(2);
        springCoreCat.setCategory("Spring Core");

        ProductCategory springBootCat = new ProductCategory();
        springBootCat.setId(3);
        springBootCat.setCategory("Spring Boot");


        ProductCategory thymeleafCat = new ProductCategory();
        thymeleafCat.setId(4);
        thymeleafCat.setCategory("Thymeleaf");

        productMap = new HashMap<>();

        Product springIntro = new Product();
        springIntro.setId(1);
        springIntro.setCourseName("Introduction to Spring");
        springIntro.setCourseSubtitle("Introductory Course for the Spring Framework");
        springIntro.setAuthor(jt);
        springIntro.setCourseDescription("Why would you want to learn about the Spring Framework? Simple, Spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know the Spring Framework. \n" +
                "\n" +
                "\n" +
                "\n" +
                "My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework. This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java. \n" +
                "\n" +
                "You will learn what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you how to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use. \n");

        springIntro.setPrice(new BigDecimal(0));
        springIntro.setImageUrl("scgeIJ9wRGGNWvK0jAld_ThumbFREE_01.png");
        springIntro.getProductCategories().add(springBootCat);
        springIntro.getProductCategories().add(springIntroCat);
        productMap.put(1, springIntro);


        Product springCoreUltimate = new Product();
        springCoreUltimate.setId(2);
        springCoreUltimate.setCourseName("Spring Core Ultimate");
        springCoreUltimate.setCourseSubtitle("The Ulitmate Bundle of my Spring Courses");
        springCoreUltimate.setAuthor(jt);
        springCoreUltimate.setCourseDescription("Spring Core Ultimate is a bundle of my Spring Core Courses! \n" +
                "\n" +
                "In this bundle you get: \n" +
                "•Spring Core - The foundation of Spring\n" +
                "•Spring Core Advanced - Advanced topics in the Spring Framework\n" +
                "•Spring Core Dev Ops - Managing and deploying Spring Applications in the enterprise\n");
        springCoreUltimate.setPrice(new BigDecimal(199));
        springCoreUltimate.setImageUrl("DkBQKd4WQxWTCLnFwJCR_ThumbSPRINcoreUltimate.png");
        springCoreUltimate.getProductCategories().add(springBootCat);
        springCoreUltimate.getProductCategories().add(springCoreCat);
        productMap.put(2, springCoreUltimate);

        Product thymeleaf = new Product();
        thymeleaf.setId(3);
        thymeleaf.setCourseName("Thymeleaf");
        thymeleaf.setCourseSubtitle("Rocking out Thymeleaf with Spring ");
        thymeleaf.setAuthor(jt);
        thymeleaf.setCourseDescription("Thymeleaf is an exciting new natural templating framework for Java web applications. In this course we dive into Thymeleaf and how it is used under Spring Boot with Spring MVC.");
        thymeleaf.setPrice(new BigDecimal(199));
        thymeleaf.setImageUrl("J8mqML4lQRmUmM4gdCW0_Thumb_Thymeleaf.png");
        thymeleaf.getProductCategories().add(springBootCat);
        thymeleaf.getProductCategories().add(thymeleafCat);
        productMap.put(3, thymeleaf);


        Product springCoreAdv = new Product();
        springCoreAdv.setId(4);
        springCoreAdv.setCourseName("Spring Core Advanced");
        springCoreAdv.setCourseSubtitle("Advanced Topics of Spring Core");
        springCoreAdv.setAuthor(jt);
        springCoreAdv.setCourseDescription("My Spring Core course is intended to be a predecessor to this course. In Spring Core, I gave you a solid foundation in working with the Spring Framework. In this course, I build upon that foundation expanding your skills with the Spring Framework. The skills taught in this course are skills you will need for enterprise application development with the Spring Framework.");
        springCoreAdv.setPrice(new BigDecimal(199));
        springCoreAdv.setImageUrl("fMahox0zTOW4gYkMMjmN_ThumbSPRINcoreAdv.png");
        springCoreAdv.getProductCategories().add(springBootCat);
        springCoreAdv.getProductCategories().add(springCoreCat);
        productMap.put(4, springCoreAdv);


        Product springCoreDevOps = new Product();
        springCoreDevOps.setId(5);
        springCoreDevOps.setCourseName("Spring Core Ultimate");
        springCoreDevOps.setCourseSubtitle("Managing and Deploying Spring Applications in the Enterprise ");
        springCoreDevOps.setAuthor(jt);
        springCoreDevOps.setCourseDescription("Managing applications in the enterprise is not a trivial task. A whole new segment in the industry known as \"Dev Ops\" has arisen to address the challenges of maintaining and deploying applications in the enterprise. \n" +
                "\n" +
                "The Spring Framework is by far the most popular framework for building enterprise class applications. Spring has a very robust feature set designed specifically address the needs of enterprise application development. \n");
        springCoreDevOps.setPrice(new BigDecimal(199));
        springCoreDevOps.setImageUrl("DkBQKd4WQxWTCLnFwJCR_ThumbSPRINcoreUltimate.png");
        springCoreDevOps.getProductCategories().add(springBootCat);
        springCoreDevOps.getProductCategories().add(springCoreCat);
        productMap.put(5, springCoreDevOps);


    }


    @Override
    public Product getProduct(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> listProducts() {
        return new ArrayList<>(productMap.values());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.domain;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bensatu
 */
public class BookTest {

    Book instance;

    public BookTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Book();
        instance.setAddress("address");
        List<String> authors = new ArrayList<>();
        authors.add("author1");
        authors.add("author2");
        instance.setAuthors(authors);
        instance.setPublisher("publisher");
        instance.setTitle("title");
        instance.setYear("2017");
        instance.setEdition("44");
        instance.setKey("avain");
        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        tags.add("tag2");
        instance.setTags(tags);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        assertEquals("title", instance.getTitle());

    }

    /**
     * Test of getYear method, of class Book.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        assertEquals("2017", instance.getYear());
    }

    /**
     * Test of getPublisher method, of class Book.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        assertEquals("publisher", instance.getPublisher());
    }

    /**
     * Test of getAddress method, of class Book.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        assertEquals("address", instance.getAddress());
    }

    /**
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        Book instance1 = new Book();
        instance1.setTitle("title");
        assertEquals("title", instance1.getTitle());
    }

    /**
     * Test of setYear method, of class Book.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        Book instance1 = new Book();
        instance1.setYear("2017");
        assertEquals("2017", instance1.getYear());
    }

    /**
     * Test of setPublisher method, of class Book.
     */
    @Test
    public void testSetPublisher() {
        System.out.println("setPublisher");
        Book instance1 = new Book();
        instance1.setPublisher("publisher");
        assertEquals("publisher", instance1.getPublisher());
    }

    /**
     * Test of setAddress method, of class Book.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Book instance1 = new Book();
        instance1.setAddress("address");
        assertEquals("address", instance1.getAddress());
    }

    /**
     * Test of toString method, of class Book. One author.
     */
    @Test
    public void testToStringOneAuthor() {
        List<String> authors = new ArrayList<>();
        authors.add("author1");
        instance.setAuthors(authors);
        System.out.println("toString");
        String expResult = "author1. title. publisher, 44, 2017. address. Key{avain} tag1,tag2.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "author1 and author2. title. publisher, 44, 2017. address. Key{avain} tag1,tag2.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Book. Three authors.
     */
    @Test
    public void testToStringThreeAuthors() {
        List<String> authors = new ArrayList<>();
        authors.add("author1");
        authors.add("author2");
        authors.add("author3");
        instance.setAuthors(authors);
        System.out.println("toString");
        String expResult = "author1, author2, and author3. title. publisher, 44, 2017. address. Key{avain} tag1,tag2.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Book. One tag.
     */
    @Test
    public void testToStringOneTag() {
        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        instance.setTags(tags);
        System.out.println("toString");
        String expResult = "author1 and author2. title. publisher, 44, 2017. address. Key{avain} tag1.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Book. Three tags.
     */
    @Test
    public void testToStringThreeTags() {
        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        tags.add("tag2");
        tags.add("tag3");
        instance.setTags(tags);
        System.out.println("toString");
        String expResult = "author1 and author2. title. publisher, 44, 2017. address. Key{avain} tag1,tag2,tag3.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toBibTex method, of class Book.
     */
    @Test
    public void testToBibTex() {
        System.out.println("toBibTex");
        String expResult = "@book{avain,\n"
                + "author = {author1 and author2},\n"
                + "title = {title},\n"
                + "year = {2017},\n"
                + "publisher = {publisher},\n"
                + "address = {address},\n"
                + "edition = {44},\n"
                + "}";
        assertEquals(expResult, instance.toBibTex());
    }

    /**
     * Test of getId method, of class Book.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        assertEquals(null, instance.getId());

    }

}

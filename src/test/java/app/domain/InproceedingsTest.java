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
public class InproceedingsTest {

    Inproceedings instance;

    public InproceedingsTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Inproceedings();
        instance.setAddress("address");
        List<String> authors = new ArrayList<>();
        authors.add("author1");
        authors.add("author2");
        instance.setKey("avain");
        instance.setAuthors(authors);
        instance.setBookTitle("bookTitle");
        instance.setStartingPage("1");
        instance.setEndingPage("100");
        instance.setPublisher("publisher");
        instance.setStartingPage("1");
        instance.setTitle("title");
        instance.setYear("2017");
        instance.setEditor("editor1");
        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        tags.add("tag2");
        instance.setTags(tags);

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Inproceedings.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String result = instance.getTitle();
        assertEquals("title", result);
    }

    /**
     * Test of getBookTitle method, of class Inproceedings.
     */
    @Test
    public void testGetBookTitle() {
        System.out.println("getBookTitle");
        String result = instance.getBookTitle();
        assertEquals("bookTitle", result);
    }

    
    /**
     * Test of getYear method, of class Inproceedings.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        assertEquals("2017", instance.getYear());
    }

    /**
     * Test of getPublisher method, of class Inproceedings.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        assertEquals("publisher", instance.getPublisher());
    }

    /**
     * Test of getStartingPage method, of class Inproceedings.
     */
    @Test
    public void testGetStartingPage() {
        System.out.println("getStartingPage");
        assertEquals("1", instance.getStartingPage());
    }

    /**
     * Test of getEndingPage method, of class Inproceedings.
     */
    @Test
    public void testGetEndingPage() {
        System.out.println("getEndingPage");
        assertEquals("100", instance.getEndingPage());
    }

    /**
     * Test of getAddress method, of class Inproceedings.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        assertEquals("address", instance.getAddress());
    }

    /**
     * Test of getVolume method, of class Inproceedings.
     */
    @Test
    public void testGetVol() {
        instance.setVolume("5");
        System.out.println("getVolume");
        assertEquals("5", instance.getVolume());
    }

    /**
     * Test of setTitle method, of class Inproceedings.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "title1";
        Inproceedings instance1 = new Inproceedings();
        instance1.setTitle(title);
        assertEquals("title1", instance1.getTitle());

    }

    /**
     * Test of setBookTitle method, of class Inproceedings.
     */
    @Test
    public void testSetBookTitle() {
        System.out.println("setBookTitle");
        String booktitle = "bookTitle1";
        Inproceedings instance1 = new Inproceedings();
        instance1.setBookTitle(booktitle);
        assertEquals("bookTitle1", instance1.getBookTitle());

    }

    /**
     * Test of setYear method, of class Inproceedings.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        String year = "2017";
        Inproceedings instance1 = new Inproceedings();
        instance1.setYear(year);
        assertEquals("2017", instance1.getYear());
    }

    /**
     * Test of setPublisher method, of class Inproceedings.
     */
    @Test
    public void testSetPublisher() {
        System.out.println("setPublisher");
        String publisher = "publisher1";
        Inproceedings instance1 = new Inproceedings();
        instance1.setPublisher(publisher);
        assertEquals("publisher1", instance1.getPublisher());
    }

    /**
     * Test of setAddress method, of class Inproceedings.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "address1";
        Inproceedings instance1 = new Inproceedings();
        instance1.setAddress(address);
        assertEquals("address1", instance1.getAddress());
    }

    /**
     * Test of setStartingPage method, of class Inproceedings.
     */
    @Test
    public void testSetStartingPage() {
        System.out.println("setStartingPage");
        String page = "11";
        Inproceedings instance1 = new Inproceedings();
        instance1.setStartingPage(page);
        assertEquals("11", instance1.getStartingPage());
    }

    /**
     * Test of setEndingPage method, of class Inproceedings.
     */
    @Test
    public void testSetEndingPage() {
        System.out.println("setEndingPage");
        String page = "60";
        Inproceedings instance1 = new Inproceedings();
        instance1.setEndingPage(page);
        assertEquals("60", instance1.getEndingPage());
    }

    /**
     * Test of setVolume method, of class Inproceedings.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        String vol = "7";
        Inproceedings instance1 = new Inproceedings();
        instance1.setVolume(vol);
        assertEquals("7", instance1.getVolume());
    }

    /**
     * Test of toString method, of class Inproceedings. One author.
     */
    @Test
    public void testToStringOneAuthor() {
        List<String> authors = new ArrayList<>();
        authors.add("author1");
        instance.setAuthors(authors);
        System.out.println("toString");
        String expResult = "author1. title. In editor1, editor, bookTitle, pages 1-100. publisher, 2017. address. Key{avain} tag1,tag2.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Inproceedings.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "author1 and author2. title. In editor1, editor, bookTitle, pages 1-100. publisher, 2017. address. Key{avain} tag1,tag2.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Inproceedings. Three authors.
     */
    @Test
    public void testToStringThreeAuthors() {
        List<String> authors = new ArrayList<>();
        authors.add("author1");
        authors.add("author2");
        authors.add("author3");
        instance.setAuthors(authors);
        System.out.println("toString");
        String expResult = "author1, author2, and author3. title. In editor1, editor, bookTitle, pages 1-100. publisher, 2017. address. Key{avain} tag1,tag2.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Inproceedings. One tag.
     */
    @Test
    public void testToStringOneTag() {
        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        instance.setTags(tags);
        System.out.println("toString");
        String expResult = "author1 and author2. title. In editor1, editor, bookTitle, pages 1-100. publisher, 2017. address. Key{avain} tag1.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Inproceedings. Three tags.
     */
    @Test
    public void testToStringThreeTags() {
        List<String> tags = new ArrayList<>();
        tags.add("tag1");
        tags.add("tag2");
        tags.add("tag3");
        instance.setTags(tags);
        System.out.println("toString");
        String expResult = "author1 and author2. title. In editor1, editor, bookTitle, pages 1-100. publisher, 2017. address. Key{avain} tag1,tag2,tag3.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toString method, of class Inproceedings. No publisher.
     */
    @Test
    public void testToStringNoPublisher() {
        instance.setPublisher("");
        System.out.println("toString");
        String expResult = "author1 and author2. title. In editor1, editor, bookTitle, pages 1-100, 2017. address. Key{avain} tag1,tag2.";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Test of toBibTex method, of class Inproceedings.
     */
    @Test
    public void testToBibTex() {
        System.out.println("toBibTex()");
        String expResult = "@inproceedings{avain,\n"
                + "author = {author1 and author2},\n"
                + "title = {title},\n"
                + "booktitle = {bookTitle},\n"
                + "year = {2017},\n"
                + "pages = {1--100},\n"
                + "publisher = {publisher},\n"
                + "address = {address},\n"
                + "editor = {editor1},\n"
                + "}";
        assertEquals(expResult, instance.toBibTex());
    }
}

package main;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.util.HashSet;
import java.util.Set;

public class test {
    @Test
    public void test1() {
        AdresnayaKniga a = new AdresnayaKniga();
        a.add("Иванов", new Adress("Улица", "12", "71"));
        assertEquals(new Adress("Улица", "12", "71"), a.findAddress("Иванов"));
    }

    @Test
    public void test2() {
        AdresnayaKniga a = new AdresnayaKniga();
        a.add("Иванов", new Adress("Улица", "12", "71"));
        a.add("Иванова", new Adress("Улица", "12", "71"));
        Set<String> s = new HashSet<>();
        s.add("Иванов");
        s.add("Иванова");
        assertEquals(s, a.findHumans("Улица", "12"));
    }

    @Test
    public void test3() {
        AdresnayaKniga a = new AdresnayaKniga();
        a.add("Иванов", new Adress("Улица", "12", "71"));
        a.add("Иванова", new Adress("Улица", "12", "71"));
        Set<String> s = new HashSet<>();
        s.add("Иванов");
        s.add("Иванова");
        assertEquals(s, a.findHumans("Улица"));
    }

    @Test
    public void test4() {
        AdresnayaKniga a = new AdresnayaKniga();
        a.add("Иванов", new Adress("Улица", "12", "71"));
        a.add("Иванова", new Adress("Улица", "12", "71"));
        Set<String> s = new HashSet<>();
        s.add("Иванов");
        a.removeHuman("Иванова");
        assertEquals(s, a.findHumans("Улица"));
    }

    @Test
    public void test5() {
        AdresnayaKniga a = new AdresnayaKniga();
        a.add("Иванов", new Adress("Улица", "12", "71"));
        a.izmenenieAdresa("Иванов", new Adress("Улица", "12", "722"));
        Set<String> s = new HashSet<>();
        s.add("Иванов");
        assertEquals(s, a.findHumans("Улица"));
    }
}

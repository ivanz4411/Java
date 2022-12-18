package ru.mirea.lab1.Homework2.Homework2_1;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    Author aut;
    @BeforeEach
    public void createAuthor()
    {
       aut = new Author ("Ivan", "ivanz441@list.ru", 'm');
    }

    @org.junit.jupiter.api.Test
    void getName() {

        Assert.assertEquals("Ivan",aut.getName());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        Assert.assertEquals("ivanz441@list.ru",aut.getEmail());
    }
}
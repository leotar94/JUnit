package it.leo.junit.test;

import it.leo.junit.model.Fattoriale;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestFattoriale extends TestCase {

//    Fattoriale fattoriale;
//    public TestFattoriale(){}
//
//    @BeforeClass
//    public static void setUpClass() throws Exception{}
//    @AfterClass
//    public static void tearDownClass() throws Exception{}
//
//    @Before
//    @Override
//    public void setUp(){
//        fattoriale=new Fattoriale();
//    }
//
//    @After
//    @Override
//    public void tearDown(){
//        fattoriale= null;
//    }
/*
il blocco di commenti non è necessario perchè o definito i metodi come
static... infatti funziona lo stesso, se i metodi non fossero static
allora c'è bisogno di inizializzare i dati...
 */
    public void testFattoriale(){
        assertEquals(120,Fattoriale.calcFatt(5));
    }

}

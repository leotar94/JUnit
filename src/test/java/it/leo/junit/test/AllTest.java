package it.leo.junit.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestFattoriale.class, TestPotenza.class})
public class AllTest {
}
/*
in questa classe possiamo far girare tutti i test unitari che abbiamo
creato nelle classi test
 */
package com.myapp;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={NotepadConfig.class})
//@ContextConfiguration("classpath:beans.xml")
public class NotepadTest {

	@Autowired
	Notepad n1;
	@Autowired
	Notepad n2;
	
	@Autowired
	UniqueThing uniqueThing1;
	@Autowired
	UniqueThing uniqueThing2;
	
	@Test
	public void testNotepad(){
		assertNotSame(n1, n2);
		
		assertSame(uniqueThing1, uniqueThing2);
	}
}

package entity;

import static org.junit.Assert.*;

import javax.persistence.EntityManagerFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml"})
public class TestEntiymanger {
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	@Test
	public void test() {
		entityManagerFactory.createEntityManager();
	}

}

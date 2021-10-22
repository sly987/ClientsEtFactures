package operations;

import static operations.Operations.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestsOperations
{
	@Test
	public void testSucc()
	{
		assertEquals("test de la fonction successeur", 2, succ(1));
		assertEquals("test de la fonction successeur", -2, succ(-3));
		assertEquals("test de la fonction successeur", 1, succ(0));
	}

	@Test
	public void testPred()
	{
		assertEquals("pred", 5, pred(6));
		assertEquals("pred", -8, pred(-7));
		assertEquals("pred", -1,pred(0));
	}

	@Test
	public void testSomme()
	{
		assertEquals("somme", 2, somme(2, 0));
		assertEquals("somme", 2, somme(0, 2));
		assertEquals("somme", 9, somme(3, 6));
		assertEquals("somme", 10, somme(13, -3));
		assertEquals("somme", -10, somme(-13, 3));
		assertEquals("somme", -16, somme(-13, -3));
	}

	@Test
	public void testProduit()
	{
		assertEquals("produit", 0, produit(2, 0));
		assertEquals("produit", 0, produit(0, 2));
		assertEquals("produit", 2, produit(2, 1));
		assertEquals("produit", 18, produit(3, 6));
		assertEquals("produit", -18, produit(-3, 6));
		assertEquals("produit", 18, produit(-3, -6));
	}

	@Test
	public void testPuissance()
	{
		assertEquals("puissance", 1, puissance(4, 0));
		assertEquals("puissance", 5, puissance(5, 1));
		assertEquals("puissance", 1, puissance(1, 50));
		assertEquals("puissance", 9, puissance(3, 2));
		assertEquals("puissance", 1024, puissance(2, 10));
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	@Test 
	public void testcomf () throws Exception 
	{
		PlanetExplorer plex = new PlanetExplorer(10, 10, "");
		assertEquals("(0,1,N)",plex.executeCommand("f"));
	}
	@Test
	public void testcomb ()
	{
		PlanetExplorer  plex = new PlanetExplorer(10,10,"");
		plex.executeCommand("f");
		assertEquals("(0,0,N)",plex.executeCommand("b"));
	}
}

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	/*@Test
	public void test_executeCommand() {
		fail("Not yet implemented");
	}*/
	
	@Test 
	public void testMoveN ()
	{
		PlanetExplorer plex = new PlanetExplorer(10, 10, "");
		assertEquals("(0,1,N)",plex.executeCommand("f"));
	}
}

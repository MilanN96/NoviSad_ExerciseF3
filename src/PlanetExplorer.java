import java.util.ArrayList;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:it8/2015

public class PlanetExplorer {
	private String direction = "N";
	private int x;
	private int y;
	private int yPos;
	private int xPos;
	private String obstacles;
	private String [] obstaclesArray;
	ArrayList<Integer> arl = new ArrayList<Integer>();
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x=x;
		this.y=y;
		this.obstacles=obstacles;
		
	}
	public PlanetExplorer(int x, int y){
		
			this.x=x;
			this.y=y;
			
			
		}
	public boolean obstacles()
	{
		obstaclesArray = obstacles.split("//(|//,|//)");
	       for(int i=0;i<obstaclesArray.length;i++)
	       {
	    	   arl.add(Integer.parseInt(obstaclesArray[i]));
	       }
	       for(int i =0; i<arl.size();i=i+2)
	       {
	    	   if(xPos==arl.get(i)&&yPos==arl.get(i+1))
	    	   {
	    		   return false;
	    	   }
	    	   return true;
	       }
	       return true;
	}
	
	public String executeCommand(String command){
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(xPos,yPos,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where xPos and yPos are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		/*obstaclesArray = obstacles.split("//(|//,|//)");
	       for(int i=0;i<obstaclesArray.length;i++)
	       {
	    	   arl.add(Integer.parseInt(obstaclesArray[i]));
	       }*/
	       
	      
	       
	       if(direction=="W" || direction=="E")
			{
				
				if(this.xPos==x-1){
					xPos=0;
				}
				
				else if(command=="f")
				{
					if(obstacles())
					xPos++;
					
					
					
				}
				else if(command=="b")
				{
					if(obstacles())
					xPos--;
					
				}
				
			}
		
	       if(direction=="N" || direction=="S")
			{
				if(this.yPos==y-1){
					yPos=0;
				}
				else if(command=="f")
				{
					if(obstacles())
					yPos++;
					
				}
				else if(command=="b")
				{
					if(obstacles())
					yPos--;
					
				}
			}
			
			if(command=="l")
			{
				direction="W";
			}
			if(command=="r")
			{
				direction="E";
				
			}
			
			return "("+xPos+","+yPos+","+direction+")";
		 
		
	}
}

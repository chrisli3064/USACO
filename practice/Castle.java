import java.io.*;
import java.util.StringTokenizer;

public class Castle{
  public static void main(String args[])throws IOException{
	  BufferedReader br = new BufferedReader(new FileReader("castle.in"));
	  StringTokenizer st = new StringTokenizer(br.readLine());
	  int columns = Integer.valueOf(st.nextToken());
	  int rows = Integer.valueOf(st.nextToken());
	  //int[][] castle = new int[rows][columns];
	  List<List<node>> castle = new ArrayList<List<node>>();
	  
	  
	  final int w = 1;
	  final int n = 2;
	  final int e = 4;
	  final int s = 8;
	  for(int i=0; i<rows; i++){
		  List<node> room = new ArrayList<node>();
		  
		  StringTokenizer st1 = new StringTokenizer(br.readLine());
		  for(int j=0; j<columns; j++){
			  castle[i][j]=Integer.valueOf(st.nextToken());
		  }
		  list.add(room);
	  }
  }
}
class node{
  int total;
  boolean north;
  boolean south;
  boolean west;
  boolean east;

  public node(int total, boolean north, boolean south, boolean west, boolean east){
        this.total = total;
	this.north = north;
	this.south = south;
	this.west = west;
	this.east = east;
  }

  public int getTotal(){
	  return total;
  }
  public boolean getNorth(){
	  return north;
  }
  public boolean getWest(){
	  return west;
  }
  public boolean getEast(){
	  return east;
  }
  public boolean getSouth(){
	  return south; 
  }
}
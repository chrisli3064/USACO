import java.io.*;
import java.util.*;

public class Castle{
  public static void main(String args[])throws IOException{
      BufferedReader br = new BufferedReader(new FileReader("castle.in"));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int columns = Integer.valueOf(st.nextToken());
      int rows = Integer.valueOf(st.nextToken());
      node[][] castle = new node[rows][columns];
      
      
      final int w = 1;
      final int n = 2;
      final int e = 4;
      final int s = 8;
      for(int i=0; i<rows; i++){
          
          
          StringTokenizer st1 = new StringTokenizer(br.readLine());
          for(int j=0; j<columns; j++){
              
              castle[i][j]= new node(Integer.valueOf(st.nextToken()));
          }
          
      }
  }
}
class wall{
}
class node{
  int total;
  boolean north;
  boolean south;
  boolean west;
  boolean east;

  /*public node(int total, boolean north, boolean south, boolean west, boolean east){
    this.total = total;
    this.north = north;
    this.south = south;
    this.west = west;
    this.east = east;
  }*/
  public node(int total){
    switch(total){
        case 1:
            this.west = true;
            break;
        case 2:
            this.north = true;
            break;
        case 4:
            this.east = true;
            break;
        case 8:
            this.south = true;
            break;
        case 3:
            this.west = true;
            this.north = true;
            break;
        case 5:
            this.east = true;
            this.west = true;
            break;
        case 9:
            this.west = true;
            this.south=true;
            break;
        case 6:
            this.north=true;
            this.east = true;
            break;
        case 10:
            this.north = true;
            this.south = true;
            break;
        case 12:
            this.east = true;
            this.south = true;
            break;
        case 7:
            this.west = true;
            this.north = true;
            this.east =true;
            break;
        case 11:
            this.west = true;
            this.north = true;
            this.south =true;
            break;
        case 13:
            this.west = true;
            this.east = true;
            this.south = true;
            break;
        case 14:
            this.north = true;
            this.east =true;
            this.south = true;
            break;
        case 15:
            this.north = true;
            this.east= true;
            this.west = true;
            this.south = true;
        default:
            this.north = false;
            this.east= false;
            this.west = false;
            this.south = false;
            }
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
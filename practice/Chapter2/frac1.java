package Chapter2;

/*
ID: christo57
LANG: JAVA
PROB: frac1
*/
import java.util.*;
import java.io.*;
class frac1{

   public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\chris\\Documents\\GitHub\\USACO\\practice\\Chapter2\\frac1.in"));
       PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\chris\\Documents\\GitHub\\USACO\\practice\\Chapter2\\frac1.out"));
       int n = Integer.valueOf(br.readLine());
       HashMap<Double, String> hm = new HashMap<Double,String>();
       HashSet<Double> hs = new HashSet<Double>();

       for(int i=1; i<=n; i++){
           for(int j=1; j<i; j++){
               
               if(hm.containsKey(j/Double.valueOf(i))){
                   String[] parts = hm.get(j/Double.valueOf(i)).split("/");
                   int previousJ = Integer.valueOf(parts[0]);
                   int previousI = Integer.valueOf(parts[1]);
                   hm.put(j/Double.valueOf(i), Math.min(previousJ, j)+"/"+Math.min(previousI, i));
                }
                else hm.put(j/Double.valueOf(i),j+"/"+i);
               hs.add(j/Double.valueOf(i));
           }
       }
       ArrayList<Double> al = new ArrayList<Double>(hs);
       Collections.sort(al);
       for(int i=0; i<al.size(); i++){
           pw.write(hm.get(al.get(i))+ " ");
       }
       pw.write("1/1");
       pw.close();
   }



}
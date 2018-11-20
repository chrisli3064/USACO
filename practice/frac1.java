import java.util.*;
import java.io.*;
/**
*PROB: frac1
*NAME: christo57
**/
class frac1{

   public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new FileReader("frac1.in"));
       PrintWriter pw = new PrintWriter(new FileWriter("frac1.out"));
       
       int n = Integer.valueOf(br.readLine());
       
       HashMap<Double, String> hm = new HashMap<Double,String>();
       HashSet<Double> hs = new HashSet<Double>();
       System.out.println("0/1");
       for(int i=1; i<n; i++){
           for(int j=1; j<i; j++){
               hm.put(i/Double.valueOf(j), i+"/"+j);
               hs.add(i/Double.valueOf(j));
           }
       }
       ArrayList<Double> al = new ArrayList<Double>();
       Collections.sort(al); 
       for(int i=0; i<al.size(); i++){
           System.out.print(al.get(i)+ " ");
           pw.write(hm.get(al.get(i)));
       }
       pw.close();
   }


}
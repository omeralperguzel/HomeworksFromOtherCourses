/* QUESTION: (HARD)
Have the function HamiltonianPath(strArr) take strArr which will be an array of length three. The first part of the array will be a list of vertices in a graph in the form (A,B,C,...), the second part of the array will be the edges connecting the vertices in the form (A-B,C-D,...) where each edge is bidirectional. The last part of the array will be a set of vertices in the form (X,Y,Z,...) and your program will have to determine whether or not the set of vertices given forms a Hamiltonian path on the graph which means that every vertex in the graph is visited only once in the order given.

For example: if strArr is ["(A,B,C,D)","(A-B,A-D,B-D,A-C)","(C,A,D,B)"] then the vertices (C,A,D,B) in this order do in fact form a Hamiltonian path on the graph so your program should return the string yes. If for example the last part of the array was (D,A,B,C) then this doesn't form a Hamiltonian path because once you get to B you can't get to C in the graph without passing through the visited vertices again. Here your program should return the vertex where the path had to terminate, in this case your program should return B. 

The graph will have at least 2 vertices and all the vertices in the graph will be connected. 
*/

import java.util.*; 
import java.io.*;

public class Main {

  ArrayList<String> ed = new ArrayList<String>();

  public String HamiltonianPath(String[] strArr) {
    // code goes here
    ArrayList<String> vt = new ArrayList<String>();

    ArrayList<String> vtF = new ArrayList<String>();
    ArrayList<String> vstd = new ArrayList<String>();  

    String s1 = strArr[0];
    String s2 = strArr[1];
    String s3 = strArr[2];
    s1 = s1.substring(s1.indexOf('(')+1,s1.indexOf(')'));
    s2 = s2.substring(s2.indexOf('(')+1,s2.indexOf(')'));
    s3 = s3.substring(s3.indexOf('(')+1,s3.indexOf(')'));

    String s[] = s1.split(",");
    for (int i = 0; i < s.length; i++){
      vt.add(s[i]);
    }
    s = s2.split(",");
    for (int i = 0; i < s.length; i++){
      ed.add(s[i]);
    }
    s = s3.split(",");
    for (int i = 0; i < s.length; i++){
      vtF.add(s[i]);
    }

    vstd.add(vtF.get(0));
    
    for (int i = 0; i < vtF.size()-1; i++) {
		
		  String v1 = vtF.get(i);
		  
		  String v2 = vtF.get(i+1);
		  if(!vstd.contains(v2))
			  vstd.add(v2);
		  else
			  return v2;
		  
		  if(!isPath(v1,v2))
			  return v1;
	}
	  
    return "yes";
    
  } 

private boolean isPath(String v1, String v2) {
	
	String s1 = v1+"-"+v2;
	String s2 = v2+"-"+v1;
	
	if(ed.contains(s1) || ed.contains(s2))
		return true;
	else
		return false;
}

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    Main a = new Main();
    System.out.print(a.HamiltonianPath(s.nextLine())); 
  }

}

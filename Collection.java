package tamilnadu.chennai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  CollectionsDemo cd = new CollectionsDemo(); 
  //cd.learn_List(); 
  cd.learn_map(); 

 }

 private void learn_map() {
  // TODO Auto-generated method stub
  HashMap hm = new HashMap(); 
  hm.put("Meals", 100); 
  hm.put("Spl Meals", 120); 
  hm.put("Mini Meals", 120); 
  hm.put("Biryani", 100); 
  hm.put("Chicken Biryani", 130); 
  hm.put("Meals", 200); 
  //System.out.println(hm);
  /*
   * System.out.println(hm.keySet()); System.out.println(hm.values());
   * System.out.println(hm.entrySet());
   * System.out.println(hm.containsKey("Meals"));
   * System.out.println(hm.containsValue(150));
   */
  Set s = hm.entrySet(); 
  Iterator i = s.iterator(); 
  while(i.hasNext())
  {
   Entry entry = (Entry) i.next();
   int price = (int)entry.getValue(); 
   if(price==120)
   System.out.println(entry.getKey() + " "+ entry.getValue());
  }
  
 }

 private void learn_List() {
  // TODO Auto-generated method stub
  int[] a = {10,10,20,30,40, 20}; 
  ArrayList al = new ArrayList(); 
  al.add(10); 
  al.add(20.4f);
  al.add(true); 
  al.add(20); 
  al.add('c');
  al.add("RRR"); 
  Iterator i = al.iterator(); 
  while(i.hasNext())
  {
   Object o = i.next(); 
   try 
   {
   Integer in = (Integer) o; 
   System.out.println(in);
   }
   catch(ClassCastException cce)
   {
    
   }
  }  
 }

}

package tamilnadu.chennai;

public class Mobile implements Comparable {
 
 String brandName, model; 
 int price;

 public Mobile(String brandName, String model, int price) {
  // TODO Auto-generated constructor stub
  this.brandName = brandName; 
  this.model = model; 
  this.price = price; 
 }

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Mobile m1 = new Mobile("Vivo", "V25", 20000); 
  Mobile m2 = new Mobile("Oppo", "O25", 18000); 
  System.out.println(m1);
  System.out.println(m2);

 }
 public String toString()
 {
  return this.brandName+ " "+ this.model; 
  //return ""+this.price; 
 }
 //m1 m2
 //this keyword
 
 @Override
 public int compareTo(Object o) {
  // TODO Auto-generated method stub
  int price2 = this.price; 
  System.out.println(price2);
  Mobile m =    (Mobile)o; 
  int price1 = m.price; 
  System.out.println(price1);

  if(price2>price1)
    return -1234;
  else if(price1>price2)
   return 909; 
  return 0;
 }

}

//access modifiers and getters , setters

package com.company;
class MyEmployee{
    private int id;
  private String name;

   public String getName(){
       return name;
   }
   public int getId(){
       return id;
   }
   public void setName(String n){
//       name = n;
//       or we can use this also
       this.name  = n;
   }
   public void setId(int i){
       id = i;
   }
}
public class Lect25 {
    public static void main(String[] args) {
        MyEmployee shanky = new MyEmployee();
//        shanky.id = 19;
//        shanky.name = "shashank";// -> throws error due to private access modifiers
        shanky.setId(19);
        System.out.println(shanky.getId());

        shanky.setName("shashank");
        System.out.println(shanky.getName());
    }
}

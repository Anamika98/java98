import java.util.*;
class map1 {
  public static void main(String[] args) {
     Map <String, Integer> m1 = new HashMap<>();
     m1.put("Bhanu",1611981106);
      m1.put("Anamika",1611981061);
       m1.put("Arpit",1611983009);
        m1.put("Ekangika",1611981140);
    m1.put("Abhilasha",1611981008);
    m1.put("Diksha", 1611981443);
    m1.put("Aayushi",1611981005);
   Set set=m1.entrySet();
    Iterator it=set.iterator();
    System.out.println("elements and keys:");
    while(it.hasNext())
    {
      Map.Entry mr=(Map.Entry)it.next();
     System.out.print(mr.getKey()+" : ");
     System.out.println(mr.getValue());
  }
  }
}
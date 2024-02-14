public class marks {
            public static void main(String []args) {
            int sid = Integer.parseInt(args[0]); 
            String sname = args[1];
            float m1 = Integer.parseInt(args[2]);
            float m2 = Integer.parseInt(args[3]); 
            float m3 = Integer.parseInt(args[4]);
            float avg;
            avg= (m1+ m2 + m3)/3;
     if(avg >= 60) {
        System.out.println(sid + sname + "belongs to" + "Class 1");
     }
     else if(avg >=50 && avg < 60 ) {
        System.out.println(sid+ sname + "belongs to" +"Class 2");
     }
     else if(avg >= 30 && avg < 50) {
         System.out.println(sid+ sname + "belongs to" +"Class 3");
            }
    else {
    System.out.println(sid+ sname+ "belongs to" +"fail");
    }
  }
}




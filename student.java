//intialize through  method reference
 
class student{
     int id;
     String name;
     void info(int i,String n){
        id=i;
        name=n;
    }
     void display(){
        System.out.println(id+"  "+name);
     }
}
class Teststudent{
         public static void main(String [] args){
            student s1=new student();
                        student s2=new student();

            s1.info(71, "Nikhil");
            s2.info(8,"Aditya");
            s1.display();
            s2.display();
         }
    } 


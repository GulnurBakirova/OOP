public class Person {
    String name;
    int age;
    int tilJondom;

    void language(String [] til) {
           int jondom = til.length;
            if (jondom >= 4) {
                System.out.println(name + " Siz poliglotsuz!");
            }else if (jondom == 2 || jondom ==3) {
                System.out.println(name + " Jakshy jetishkendik!");
            }
        }
        void jash(String name1, int age){
                if (age>7 && age<18){
                    System.out.println(name1 + " Schoolchild!");
                } else if (age>=18 && age<=23) {
                    System.out.println(name1 + " Student!");
                }else if (age>23){
                    System.out.println(name1 + " Owner of some profession!" );
                }
            }






        }





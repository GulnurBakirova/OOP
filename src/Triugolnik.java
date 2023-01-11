public class Triugolnik {
    int a;
    int b;
    int c;

    void area(){
        int p = 0;
        double s = 0;

        p = (a+b+c)/2;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Triugolniktin ayanty : " + s);
    }

}

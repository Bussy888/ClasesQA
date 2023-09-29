package badPractice;

public class Calc {
    public int add(int a, int b){
        return a+a;
    }

    public static void main(String[] args) {
        //mala Practica
        Calc calc = new Calc();
        if(calc.add(5,6)==11)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}

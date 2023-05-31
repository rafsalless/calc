import java.util.Scanner;
public class Calc {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            Result n1=new Result(0);
            Result n2=new Result(0);
            Result res=new Result(0);

            System.out.printf("%nDigite o valor 1: ");
                n1.setValor(scan.nextInt());
            System.out.printf("%nDigite o valor 2: ");
                n2.setValor(scan.nextInt());
                res.setValor(n1.getValor(0)+ n2.getValor(0) );
            System.out.printf("%n A soma de d% com d% e igual a d%" ,n1.getValor(0) ,n2.getValor(0) ,res.getValor(0));
        }
    }
    
}

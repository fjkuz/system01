import java.util.Scanner;
public class Main {
    void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Расчет a * b \na = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("a * b = ");
        System.out.print(mult(a,b));
    }
    static int mult(int a, int b){
        int rez=0;
        for(int i=0;i<b;i++){
            rez+=a;
        }
        return rez;
    }
}

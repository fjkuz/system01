import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Расчет a * b \na = ");
    int a = scan.nextInt();
    System.out.print("b = ");
    int b = scan.nextInt();
    System.out.print("Способ 1\n a * b = ");
    System.out.println(mult1(a,b));
    System.out.print("Способ 2\n a * b = ");
    System.out.println(mult2(a,b));
    System.out.print("Способ 3\n a * b = ");
    System.out.println(mult3(a,b));
    System.out.print("Способ 4\n a * b = ");
    System.out.println(mult4(a,b));
    System.out.print("Способ 5\n a * b = ");
    System.out.println(mult5(a,b));
    System.out.print("Способ 6\n a * b = ");
    System.out.println(mult6(a,b));
}
static int mult1(int a, int b){//сложение
    int rez=0;
    for(int i=0;i<b;i++){
        rez+=a;
    }
    return rez;
}
static int mult2(int a, int b){//логарифм
 return (int)Math.round(Math.exp(Math.log(a)+Math.log(b)));
}
static int mult3(int a, int b){//рекурсия
    if (b == 0) {
        return 0;
    }
    else{
        return a +mult3(a,b-1);
    }
}
static int mult4(int a, int b){//сложение с проверкой переполнения
    int rez=0;
    for(int i=0;i<b;i++){
        rez=Math.addExact(rez,a);
    }
    return rez;
}
static int mult5(int a, int b){//битовое сложение
    int rez=0;
    while (b != 0) {
        if((b&1)==1){
            rez+=a;
        }
        a<<=1;
        b>>=1;
    }
    return rez;
}
static int mult6(int a,int b){
    return(int)Math.round(Math.pow(10,Math.log10(a)+Math.log10(b)));
}
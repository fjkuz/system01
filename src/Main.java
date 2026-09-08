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
    System.out.print(mult4(a,b));
}
static int mult1(int a, int b){
    int rez=0;
    for(int i=0;i<b;i++){
        rez+=a;
    }
    return rez;
}
static int mult2(int a, int b){
    int rez=0;
    while(b>0){
        rez+=a;
        b--;
    }
    return rez;
}
static int mult3(int a, int b){
    if (b == 0) {
        return 0;
    }
    else{
        return a +mult3(a,b-1);
    }
}
static int mult4(int a, int b){
    int rez=0;
    while(b>0){
        if(b%2!=0) {
            rez += a;
        }
        a+=a;
        b/=2;
    }
    return rez;
}
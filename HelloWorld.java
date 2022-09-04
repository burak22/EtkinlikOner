import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat = input.nextInt();
        if (heat<5){
            System.out.println("Kayak Yapabilirsiniz.");
        }
        else if (heat<25){
            if(heat<15){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            else{
                System.out.println("Piknik Yapabilirsiniz");
            }
        }
        else{
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}
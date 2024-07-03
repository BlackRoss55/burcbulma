import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day, mon;

        System.out.print("Doğum gününüzü giriniz: ");
        day = sc.nextInt();

        System.out.print("Kaçıncı ayda doğduğunuzu giiriniz: ");
        mon = sc.nextInt();

        if(day<1 || day >31 || mon <1 || mon >12){
            System.out.print("Girilen gün veya ay hatalıdır.");
        }
        if(mon == 1){
            if(day >=1 && day <=21 ){
                System.out.print("Burcunuz oğlak!");
            }
            else if (day>21){
                System.out.print("Burcunuz kova!");
            }
        }
        else if (mon == 2){
            if(day >=1 && day <20){
                System.out.print("Burcunuz kova!");
            }
            else if(day>=20){
                System.out.print("Burcunuz balık!");
            }
        }
        else if (mon == 3){
            if(day >=1 && day < 21){
                System.out.print("Burcunuz balık!");
            }
            else if(day >20){
                System.out.print("Burcunuz koç!");
            }
        }
        else if (mon == 4){
            if(day >=1 && day <21){
                System.out.print("Burcunuz koç!");
            }
            else if(day >=21){
                System.out.print("Burcunuz boğa!");
            }
        }
        else if (mon ==5){
            if(day >=1 && day <21){
                System.out.print("Burcunuz boğa!");
            }
            else if(day>=21){
                System.out.print("Burcunuz ikizler!");
            }
        }
        else if( mon == 6){
            if(day >=1 && day <=22){
                System.out.print("Burcunuz ikizler");
            }
            else if (day >22){
                System.out.print("Burcunuz yengeç");
            }
        }
        else if (mon == 7){
            if(day >=1 && day <= 22){
                System.out.print("Burcunuz yengeç");
            }
            else if (day>22){
                System.out.print("Burcunuz aslan");
            }
        }
        else if (mon == 8){
            if(day >=1 && day <23){
                System.out.print("Burcunuz aslan");
            }
            else if(day>22){
                System.out.print("Burcunuz başak");
            }
        }
        else if (mon==9){
            if(day >=1 && day<22){
                System.out.print("Burcunuz başak");
            }
            else if(day>21){
                System.out.print("Burcunuz terazi");
            }
        }
        else if(mon == 10){
            if(day >=1 && day<22){
                System.out.print("Burcunuz terazi");
            }
            else if(day >21){
                System.out.print("Burcunuz akrep");
            }
        }
        else if(mon == 11){
            if(day >=1 && day < 22){
                System.out.print("Burcunuz akrep");
            }
            else if(day >21){
                System.out.print("Burcunuz yay");
            }
        }
        else if (mon == 12){
            if (day >=1 && day <22){
                System.out.print("Burcunuz yay");
            }
            else if(day>21){
                System.out.print("Burcunuz oğlak");
            }
        }
    }
}
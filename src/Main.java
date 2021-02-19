import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int S = scanner.nextInt();
    int N = scanner.nextInt();
    List<Integer> list = new LinkedList<>();
    //List<Integer> list_1 = new LinkedList<>();
	for(int i = 1; i<=N; i++){
	    double speed = scanner.nextInt();
        int rest = scanner.nextInt();
        double speed_1 = speed;
        int time = 0;
        int k = 0;
        while(k<S) {
            k += speed;
            time++;
            double a = Math.floor(speed / 2);
            if (a == 0) {
                if (k==S){
                    break;
                }
                time += rest;
                speed = speed_1;
                continue;
            }
            speed = a;
        }
        list.add(time);
	}
       Print(Print(Print(list)));

    }


        public static List<Integer> Print(List<Integer> list){
        int min = 100000000;
        for (Integer integer : list){
            if (integer<min){
                min = integer;
            }
        } if (min == 10000000){
            list.clear();
            return list;
            }
            for (Integer in : list) {

                if (in==min){
            int i = list.indexOf(min);
            System.out.print(i + 1 + " " );
            list.set(i, 10000000);
        }}
        System.out.print("\n");
        return list;
    }


    }



import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isAyni(int[]arr, int value){
        for(int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {


        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        int count = 0;
        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list.length; j++){
                if(list[i] == list[j]){
                    count++;
                }
            }if(!isAyni(duplicate , list[i])){
                duplicate[startIndex++] = list[i];
                System.out.println(list[i] + " sayisi " + count + " kere tekrar edildi");

            }
            count = 0 ;
        }

    }
}
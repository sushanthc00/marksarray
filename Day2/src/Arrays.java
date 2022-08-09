import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = {35,37,38,17,48,12,45,26,34,28};
        int size= marks.length;
        int hold;

        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(marks[i]>marks[j]){
                    hold = marks[i];
                    marks[i] = marks[j];
                    marks[j] = hold;
                }
            }
        System.out.println("Highest marks is " + marks[size-1]);
      


    }
}

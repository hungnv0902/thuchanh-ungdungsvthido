import java.util.Scanner;
public class svthido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong sinh vien :");
        int size = input.nextInt();
        float[] score = new float[size];

        if(0 < size && size <= 30) {
            int i = 0;
            do {
                System.out.println("Nhap diem so cua sinh vien thu " + (i+1));
                score[i] = input.nextFloat();
                i ++;
            } while (i < size);


        }

        int count = 0;

        for(int i = 0;i < size;i ++) {
            if(score[i] >= 5) {
                count ++;
            }
        }

        System.out.println("Co " + count + " sv thi do");
    }
}

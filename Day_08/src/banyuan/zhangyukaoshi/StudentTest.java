package banyuan.zhangyukaoshi;

import java.util.Scanner;

public class StudentTest extends StudentAdmin{
    public static void main(String[] args) {
        StudentAdmin st=new StudentTest();
        st.menu();
        Scanner sc=new Scanner(System.in);
        int de=sc.nextInt();
        while(de!=99){
        switch(de){
            case 10:create();break;
            case 11:select();break;
            case 12:update();break;
            case 13:delete();break;
            case 14:input();break;
            case 15:courseSort();break;
            case 16:sumSort();break;
            case 99:break;
            default:break;}
        }
    }
}

package banyuan.Test;
/**冒泡排序*/
public class test04 {
    public static void main(String[] args) {
        int[]se=new int[20];
        for (int i = 0; i <20 ; i++) {
se[i]=20-i;
        }
        for (int i = 0; i <20-1 ; i++) {
            for (int j = 0; j+1 <20-i ; j++) {
                if(se[j]<se[j+1]){int temp=se[j];
                se[j]=se[j+1];
                se[j+1]=temp;

                }

            }

        }

        for (int i = 0; i < 20; i++) {
            System.out.println(se[i]);
        }

    }
}

/** Giới thiệu lớp Random */

package OOP_20;

import java.util.Random;


public class test20 {
    public static void main(String[] args) {      
        Random ramdom = new Random();
        for(int i = 1; i < 24; i ++){
          int x =  ramdom.nextInt(11)+1;
            System.out.println("Nhóm "+i+" làm đề tài "+x);
        }    
    }
}

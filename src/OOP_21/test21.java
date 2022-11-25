/* Lớp thời gian
 * System.currentTimeMillis() => trả về khoảng thời gian bằng mili giây, thường dùng để đo khoảng thời gian của 1 công việc nào đó
 * TimeUnit => dùng để chuyển đổi thời gian giữa ngày tháng năm, giờ phút giây.
 * Calendar => lớp tạo ra các thành phần như 1 quấn lịch.
 * add()    => phương thức add trong calendar có thể cộng trừ thời gian, ngày, tháng, năm.
 */
package OOP_21;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class test21 {
    public static void main(String[] args) {
        // System.currentTimeMillis();
        long t1 = System.currentTimeMillis();

        for(int i = 0; i < 15000; i++){
            System.out.println("TEST");
        }
        long t2 = System.currentTimeMillis();
        // đo thời gian chạy của vòng lặp for
        System.out.println("Trước khi chạy for: "+t1);
        System.out.println("sau khi chạy for: "+t2);
        System.out.println("số mili giây để chạy vòng lặp: "+(t2-t1) + " mili giây");
        System.out.println("số giây để chạy vòng lặp: "+((t2-t1)/1000 + "s"));

        // TimeUnit
        // Chuyển đổi 3000 năm -> giây
        System.out.println("3000 năm = "+ TimeUnit.DAYS.toSeconds(3000*365) + "s");

        // chuyển 25 tiếng -> giây
        System.out.println("25h = " +TimeUnit.HOURS.toSeconds(25) + "s");

        // chuyển 120 giây -> phút
        System.out.println("120s = "+TimeUnit.SECONDS.toMinutes(120) + " phút");

        // tạo đối tượng calendar
        Calendar c = Calendar.getInstance();

        // in ra ngày tháng năm hiện tại
        // vì tháng chạy từ 0 - 11 nên month hiện tại cần phải cộng thêm 1
        System.out.println(c.get(Calendar.DATE) + "/"+ (c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));

        // phương thức add trong calendar có thể cộng trừ thời gian, ngày, tháng, năm
        // cộng thêm 30 giờ vào ngày hiện tại
        c.add(Calendar.HOUR, 30);
        System.out.println(c.get(Calendar.DATE) + "/"+ (c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
   
        // cộng thêm 14 ngày
        c.add(Calendar.DATE, 14);
        System.out.println(c.get(Calendar.DATE) + "/"+ (c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
    
        // trừ đi 3 năm
        c.add(Calendar.YEAR, -3);
        System.out.println(c.get(Calendar.DATE) + "/"+ (c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
    }
}

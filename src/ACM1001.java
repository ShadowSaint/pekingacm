import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Shadow on 2017/3/20.
 */
public class ACM1001 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext())
        {
            BigDecimal a=scanner.nextBigDecimal();
            int b=scanner.nextInt();
            a=a.pow(b).stripTrailingZeros();//去掉小数点后面的零
            String m_string=a.toPlainString();//不带指数段的字符串表示形式
            if(m_string.charAt(0)=='0'){
                m_string=m_string.substring(1);
            }
            System.out.println(m_string);
        }
    }
}

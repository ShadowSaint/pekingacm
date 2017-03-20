import java.util.*;

/**
 * Created by Shadow on 2017/3/20.
 */
public class ACM1002 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int total=scanner.nextInt();
        scanner.nextLine();
        LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
        for (int i=0;i<total;i++){
            String input=scanner.nextLine();
            input=input.replace("-","");
            StringBuffer stringBuffer=new StringBuffer();
            for (int j=0;j<input.length();j++){
                stringBuffer.append(getNumber(input.charAt(j)));
                if (j==2){
                    stringBuffer.append("-");
                }
            }
            String number=stringBuffer.toString();
            if (map.get(number)==null){
                map.put(number,1);
            }else {
                int count=map.get(number);
                count=count++;
                map.put(number,count);
            }
        }
        scanner.close();
        for (String number:map.keySet()){
            System.out.println(number+" "+map.get(number));
        }
    }

    private static char getNumber(char input){
        if (input=='A'||input=='B'||input=='C'){
            return '2';
        }
        if (input=='D'||input=='E'||input=='F'){
            return '3';
        }
        if (input=='G'||input=='H'||input=='I'){
            return '4';
        }
        if (input=='J'||input=='K'||input=='L'){
            return '5';
        }
        if (input=='M'||input=='N'||input=='O'){
            return '6';
        }
        if (input=='P'||input=='R'||input=='S'){
            return '7';
        }
        if (input=='T'||input=='U'||input=='V'){
            return '8';
        }
        if (input=='W'||input=='X'||input=='Y'){
            return '9';
        }
        return input;
    }
}

import java.util.ArrayList;
<<<<<<< Updated upstream
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestAll {
    public static void main(String[] args) {
        String msg = "[xxx]  [2222]";
        List<String> list = extractMessageByRegular(msg);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"-->"+list.get(i));
        }
    }
    /**
     * 使用正则表达式提取中括号中的内容
     * @param msg
     * @return
     */
    public static List<String> extractMessageByRegular(String msg){
        List<String> list=new ArrayList<String>();
        Pattern p = Pattern.compile("(\\[[^\\]]*\\])");
        Matcher m = p.matcher(msg);
        while(m.find()){
            list.add(m.group().substring(1, m.group().length()-1));
        }
        return list;
    }
}
=======
import java.util.HashMap;

public class TestAll {


    static  int cc ;

    public static void main(String[] args) {



        int bgin = 1;
        int end = 30;
        int difer  = end-bgin;
        if (difer>=5){
            while(difer>=0){
                int tem = bgin +4;
                if (tem<end){
                    System.out.println(bgin +" "+ tem);
                }else{
                    System.out.println(bgin +" "+ end);
                }
                difer-=5;
                bgin = tem+1;
            }
            System.out.println();
        }else{
            System.out.println(bgin +" "+ end);
        }

        String ss= "2";
        fun(ss);
        System.out.println(ss);
    }


static void fun(String s){
        s=s+"1";
    System.out.println(s);
}
}
>>>>>>> Stashed changes

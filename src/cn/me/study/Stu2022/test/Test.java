package cn.me.study.Stu2022.test;

public class Test
{
    public static int aMethod(int i)throws Exception
    {
        try{
            return  10/0;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }

    public static void main(String [] args)
    {
        String string = new String();
//        StringUtils.isEmpty()
    }
    static class String {
        String(){
            System.out.println(1232);
        }
    }

}

public class InstanceMethod
{
    // when instance variable ho or static method ho;

    int a;
    int b;

    static int add()
    {
        int a =5;
        int b =5;
        System.out.println(a+b);
        return 0;
    }


    public static void main(String[] args)
    {
        InstanceMethod im =new InstanceMethod();
        add();
        System.out.println(im.a);
        System.out.println(im.b);
    }

     }|
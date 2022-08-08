import java.util.Arrays;
import java.util.Date;

class a{
    public static void main(String[]args) 
    {
        int Age=20;
        int notMyAge=30;
        Age = Age+notMyAge;
        notMyAge = Age-notMyAge;
        Age= Age-notMyAge;
        System.out.println("First = "+ Age);
        System.out.println("Second = "+notMyAge);
        int ThatSameAge=Age;
        System.out.println(ThatSameAge);
        System.out.println("Hello world");
        Date Tareekh = new Date ();
        System.out.println(Tareekh);
        String message = "Hello this is not a test  " + "!!";
        System.out.println(message);
        System.out.println("The Total num of alphabets used = " + message.length());
        int[] Numbers = new int[10];
        Numbers[0] = 2;
        Numbers[1] = 3;
        Numbers[2] = 4;
        Numbers[3] = 4;
        Numbers[4] = 4;
        System.out.println(Arrays.toString(Numbers));
        int x = 10 + 3 * 7;
        int xx = (10 + 3) * 7;
        System.out.println(x);
        System.out.println(xx);
        String i = "1";
        System.out.println(i+(2));
        System.out.println(i+(Numbers[2]));
    }


}
package chapter01introduction;

public class problem48 {
    public static void main(String[] args) {
        int n=19;
        function(n);
    }
    static int count=0;
    private static void function(int n) {

        if(n<=1)
        {
            System.out.println("in return");
            return;

        }
        if(n>1)
        {
            count++;
            System.out.println(count+"  "+n);
            function(n/2);
            function(n/2);
        }
    }
}

package chapter01introduction;

public class problem27 {

    public static void main(String[] args) {

        int n= 19;
        function(n);

    }

    private static void function(int n) {
        int  count=0;
        if(n==1)
        {
            return;
        }
        for (int i = 0; i <=n ; i++) {

            for (int j = 0; j <=n ; j++)
            {
                count++;
                System.out.println(count);
                break;
            }

        }
    }

}

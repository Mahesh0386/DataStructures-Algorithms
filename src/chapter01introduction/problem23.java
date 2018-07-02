package chapter01introduction;

/*
We can define the ‘s’ terms according to the relation si = si-1 + i. The value of ‘i’ increases by 1
for each iteration. The value contained in ‘s’ at the ith iteration is the sum of the first ‘i’ positive
integers. If k is the total number of iterations taken by the program, then the while loop terminates
if:
 */
public class problem23 {
    public static void main(String[] args) {

        int n=19;
      Fucntion(n);
    }

    public static void Fucntion(int n)
    {
        int i=1, s=1;
        while(s<=n)
        {
            i++;
            s=s+i;
            System.out.println("*");
        }
    }
}

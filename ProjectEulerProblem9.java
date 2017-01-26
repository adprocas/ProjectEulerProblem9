/*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */
package projecteulerproblem9;
public class ProjectEulerProblem9 {
    public static void main(String[] args) {
        for(int c = 997; c > 0; c--) {
            for(int b = 2; b < c; b++) {
                for(int a = 1; a+b+c <= 1000; a++) {
                    if((a + b + c == 1000) && ((a*a) + (b*b) == (c*c))) {
                        long result = a*b*c;
                        System.out.println(result);
                        return;
                    }
                }
            }
        }
    }
    
}

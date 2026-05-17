package Variable;

public class Printvariables {
    public static void main(String[] args){
        String firstName="Efte";
        String lastName="Sabbir";
        String fullName=firstName+lastName;
        System.out.println(fullName);
        System.out.println(firstName+" "+lastName);
        /* in java + has two meanings
        1.for string,it joins them together called concatenation
        2.for numbers, it add values together
         */
        int x=5;
        int y=6;
        System.out.println("the sum value is :"+x+y);  //56
        System.out.println("the sum value is:"+(x+y));  //11
    }
}

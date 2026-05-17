package Variable;

public class Variables {
    public static void main(String[] args){
        String name="Sabbir";
        int age;
        age=22;
        System.out.println(name);
        System.out.println(age);
        final int myNum=15;// fixed values ,cannot overwrite existing values,unchangable like constatnt
       // myNum=20; error:cannot assign a value to the final variable
        System.out.println(myNum);
        // othertypes
        //float cgpa=3.55 error!cause you r not using f in last that means the type is double ;
        double cgpa=3.55;
        float resut=3.55f;
        float gpa=4.5f;
        char firstLetter='S';
        boolean isStudent=true;
        System.out.println(cgpa);
        System.out.println(resut);
        System.out.println(gpa);
        System.out.println(firstLetter);
        System.out.println(isStudent);


    }
}

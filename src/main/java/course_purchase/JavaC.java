package course_purchase;

public class JavaC implements Courses{

    @Override
    public boolean coursePurchased(){

        System.out.println("JAVA course purchased");
        return true;
    }
}

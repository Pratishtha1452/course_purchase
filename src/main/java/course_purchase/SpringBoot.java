package course_purchase;

public class SpringBoot implements Courses{

    @Override
    public boolean coursePurchased(){

        System.out.println("SpringBoot course purchased");
        return true;
    }
}

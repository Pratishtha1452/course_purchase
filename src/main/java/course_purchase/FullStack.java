package course_purchase;

public class FullStack implements Courses{

    @Override
    public boolean coursePurchased(){

        System.out.println("FullStack course purchased");
        return true;
    }
}

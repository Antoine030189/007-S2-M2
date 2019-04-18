import java.util.Scanner;

public class StudentMenu {

    private static final StudentMenu SINGLE_INSTANCE = new StudentMenu();

    public static StudentMenu getInstance(){
        return SINGLE_INSTANCE;
    }

}

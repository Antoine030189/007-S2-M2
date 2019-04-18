import java.util.Scanner;

public class keuzeMenu {


    private static final keuzeMenu SINGLE_INSTANCE = new keuzeMenu();

    public static keuzeMenu getInstance() {
        return SINGLE_INSTANCE;
    }

    public static void main(String[] args) {
        callMenu();
    }

    public static void callMenu() {
        System.out.println("Welkom bij het examenprogramma");
        System.out.println("Log in met je gebruikersnaam en wachtwoord.");
        try {
            Thread.sleep(5000);//2000ms = 2s
        } catch (InterruptedException ex) {
        }
        System.out.println("Menu");
        System.out.println("1) Lijst met examens");
        System.out.println("2) Overzicht studenten");
        System.out.print("Voer je keuze in: ");
        askUserInput();
    }

    public static void askUserInput() {
        Scanner userInput = new Scanner(System.in);
        int menuChoice = userInput.nextInt();
        checkUserInput(menuChoice);
    }
//
    public static void checkUserInput(int menuChoice) {
        switch (menuChoice) {
            case 1: //Return exams
                break;
            case 2: //Return students
                break;
//            case 3:
//                Student.makeNewStudent();
//                break;
            case 4: //Remove student
                break;
            case 5: //Start exam (make new object of Exam
                break;
            case 6: //Return Attempt for student
                break;
            case 7: //Return Attempts for student
                break;
            case 8: //Return count for Attempts
                break;
            default:
                break;
        }
    }
}
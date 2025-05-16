import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println(" Welcome to the Java Quiz! \n");

        // Array of questions
        String[] questions = {
            "1. What is the size of int in Java?",
            "2. Which keyword is used to inherit a class in Java?",
            "3. Which of these is not a Java feature?",
            "4. What is the default value of boolean in Java?",
            "5. What is the superclass of all classes in Java?",
            "6. Which method is the entry point of a Java program?",
            "7. Which access modifier makes a member accessible only within its own class?",
            "8. What is used to handle exceptions in Java?",
            "9. Which of these is not a primitive data type?",
            "10. What does JVM stand for?",
            "11. What is method overloading?",
            "12. What is the use of 'this' keyword?",
            "13. What is the output of 5 + \"3\" in Java?",
            "14. What is used to create an object in Java?",
            "15. Which package contains Scanner class?",
            "16. What is bytecode in Java?",
            "17. What is final keyword used for?",
            "18. Can a class be both abstract and final?",
            "19. Which interface is used to sort collections?",
            "20. What does the 'static' keyword mean in Java?"
        };

        // Array of options
        String[][] options = {
            {"a) 4 bytes", "b) 2 bytes", "c) 8 bytes", "d) Depends on system"},
            {"a) implement", "b) extends", "c) this", "d) super"},
            {"a) Object-Oriented", "b) Use of pointers", "c) Platform Independent", "d) Secure"},
            {"a) true", "b) false", "c) null", "d) 0"},
            {"a) Object", "b) Class", "c) Interface", "d) Main"},
            {"a) start()", "b) init()", "c) main()", "d) run()"},
            {"a) public", "b) private", "c) protected", "d) default"},
            {"a) catch", "b) try", "c) throw", "d) All of the above"},
            {"a) int", "b) float", "c) String", "d) boolean"},
            {"a) Java Visual Machine", "b) Java Virtual Machine", "c) Just Virtual Memory", "d) Java Variable Manager"},
            {"a) Using the same method name with different return types", "b) Using same method name with different parameters", "c) Redefining method in subclass", "d) Using static methods"},
            {"a) Refers to current class object", "b) Refers to superclass", "c) Used in interfaces", "d) None"},
            {"a) 8", "b) 53", "c) 5 + 3", "d) Error"},
            {"a) create", "b) make", "c) new", "d) init"},
            {"a) java.io", "b) java.util", "c) java.lang", "d) java.net"},
            {"a) Source code", "b) Machine code", "c) Compiled Java code", "d) Binary code"},
            {"a) To prevent inheritance", "b) To prevent modification", "c) To declare constant", "d) All of the above"},
            {"a) Yes", "b) No", "c) Depends", "d) Only in interfaces"},
            {"a) Comparator", "b) Serializable", "c) Runnable", "d) Cloneable"},
            {"a) Belongs to class not object", "b) Can be inherited", "c) Cannot be used with variables", "d) Used only for arrays"}
        };

        // Correct answers
        String[] answers = {
            "a", "b", "b", "b", "a", "c", "b", "d", "c", "b",
            "b", "a", "b", "c", "b", "c", "d", "b", "a", "a"
        };

        // Ask questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                score++;
            }
            System.out.println();
        }

        // Final result
        System.out.println(" Quiz Over!");
        System.out.println(" Your Score: " + score + " out of " + questions.length);

        if (score == 20) {
            System.out.println(" Perfect! You're a Java Pro!");
        } else if (score >= 15) {
            System.out.println(" Great job! You know Java well.");
        } else if (score >= 10) {
            System.out.println(" Good attempt! Keep practicing.");
        } else {
            System.out.println(" Keep learning! You'll get better.");
        }

        sc.close();
    }
}

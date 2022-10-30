//import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner cs = new Scanner(System.in)
        System.out.println("Пожалуйста, авторизуйтесь");
        chooseUser();
    }

    public static void chooseUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите вашу специальность :");
        System.out.println("(1) Director");
        System.out.println("(2) Marketer");
        System.out.println("(3) HR");
        System.out.println("(4) Manager");
        System.out.println("(5) Worker");
        System.out.println("(6) SalesManager");
        System.out.println("(0) close");

        String choice = sc.next();

        switch(choice.toLowerCase()) {
            case "1":
            case "director":
                System.out.println("welcome, Director!");
                DirectorLg();
                break;
            case "0":
            case "close":
                System.exit(0);
                break;
            case "2":
            case "marketer":
                System.out.println("welcome, Marketer!");
                MarketerLg();
                break;
            case "3":
            case "hr":
                System.out.println("welcome, HR!");
                HRLg();
                break;
            case "4":
            case "manager":
                System.out.println("welcome, Manager!");
                ManagerLg();
                break;
            case "5":
            case "worker":
                System.out.println("welcome, Worker!");
                WorkerLg();
                break;
            case "salesmanager":
            case "6":
                System.out.println("welcome, Sales manager!");
                SalesManagerLg();
                break;
            default:
                System.out.println("incorrect choice!");
        }
    }
    ////////////////////////////////////       USER'S LOGIN         \\\\\\\\\\\\\\\\\\
    ////////////   Director Login     \\\\\\\\\\\\\\\\
    public static void DirectorLg(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a username:>> ");
        String userName = sc.next();
        System.out.print("Write your password:>> ");
        String userPass = sc.next();
        if(userName.equals("director") && (userPass.equals("admin"))){
            System.out.println("Директор, вы успешно вошли!");
            DirectorsMenu();
        }
        else{
            System.out.println("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
            System.out.println("Желаете повторить[0] или выйти[1]? ");
            int ex = sc.nextInt();
            if(ex == 0){
                DirectorLg();
            }else if(ex == 1){
                chooseUser();
            }
        }
    }
    ////////////     Marketer Login    \\\\\\\\\\
    public static void MarketerLg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a username:>> ");
        String userName = sc.next();
        System.out.print("Write your password:>> ");
        String userPass = sc.next();
        if (userName.equals("marketer") && (userPass.equals("admin"))) {
            System.out.println("Marketer, вы успешно вошли!");
            MarketersMenu();
        } else {
            System.out.println("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
            System.out.println("Желаете повторить[0] или выйти[1]? ");
            int ex = sc.nextInt();
            if (ex == 0) {
                MarketerLg();
            } else if (ex == 1) {
                chooseUser();
            }
        }
    }
    //////////        HR  Login      \\\\\\\\\\\
    public static void HRLg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a username:>>");
        String userName = sc.next();
        System.out.print("Write your password");
        String userPass = sc.next();
        if (userName.equals("HR") && (userPass.equals("admin"))) {
            System.out.println("HR, вы успешно вошли!");
        } else {
            System.out.println("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
            System.out.println("Желаете повторить[0] или выйти[1]? ");
            int ex = sc.nextInt();
            if (ex == 0) {
                HRLg();
            } else if (ex == 1) {
                chooseUser();
            }
        }
    }
    ///////////       Manager Login     \\\\\\\\\\\
    public static void ManagerLg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a username:>>");
        String userName = sc.next();
        System.out.print("Write your password");
        String userPass = sc.next();
        if (userName.equals("Manager") && (userPass.equals("admin"))) {
            System.out.println("Manager, вы успешно вошли!");
            ManagersMenu();
        } else {
            System.out.println("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
            System.out.println("Желаете повторить[0] или выйти[1]? ");
            int ex = sc.nextInt();
            if (ex == 0) {
                ManagerLg();
            } else if (ex == 1) {
                chooseUser();
            }
        }
    }
    ////////////       Worker Login   \\\\\\\\\\\\\
    public static void WorkerLg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a username:>> ");
        String userName = sc.next();
        System.out.print("Write your password:>> ");
        String userPass = sc.next();
        if (userName.equals("worker") && (userPass.equals("admin"))) {
            System.out.println("Worker, вы успешно вошли!");
            WorkersMenu();
        } else {
            System.out.println("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
            System.out.println("Желаете повторить[0] или выйти[1]? ");
            int ex = sc.nextInt();
            if (ex == 0) {
                WorkerLg();
            } else if (ex == 1) {
                chooseUser();
            }
        }
    }
    ////////////       Sales Manager Login   \\\\\\\\\\\\\
    public static void SalesManagerLg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a username:>> ");
        String userName = sc.next();
        System.out.print("Write your password:>> ");
        String userPass = sc.next();
        if (userName.equals("salesManager") && (userPass.equals("admin"))) {
            System.out.println("Sales manager, вы успешно вошли!");
            WorkersMenu();
        } else {
            System.out.println("Извините, но мы не нашли такой тип аккаунта, пожалуйста повторите.");
            System.out.println("Желаете повторить[0] или выйти[1]? ");
            int ex = sc.nextInt();
            if (ex == 0) {
                WorkerLg();
            } else if (ex == 1) {
                chooseUser();
            }
        }
    }


    ///////////////////////////      USER'S ACTIONS    \\\\\\\\\\\\\\\\\\
    ////////  Director's Action   \\\\\\\\\\\\\\\\\
    public static void DirectorsMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 9");
        System.out.println("Menu:");
        System.out.println("(1) Показать список всех зон покрытия ");
        System.out.println("(2) Показать список категорий бюджета ");
        System.out.println("(3) Показать выделенный бюджет для определенной категории мест для маркетинга ");
        System.out.println("(4) Показать текущие средства для маркетинга");
        System.out.println("(5) Показать общий бюджет необходимый для зарплаты");
        System.out.println("(6) Повысить зарплату сотруднику");
        System.out.println("(7) Понизить зарплату сотруднику");
        System.out.println("(8) Показать список оборудований для строительства объектов");
        System.out.println("(9) Выход");

        String directorsChoise = sc.next();
        switch (directorsChoise){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "7":
                break;
            case "8":
                break;
            case "9":
                System.out.println("Программа завершена, мы будем рады вашему возвращению!");
                System.exit(9);
                break;
            default:
                System.out.println("Wrong number try again");
                DirectorsMenu();
        }
    }
    ////////    Marketer's Action    \\\\\\\\\\\\\\\\\
    public static void MarketersMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 6:");
        System.out.println("Menu:");
        System.out.println("(1) Показать список всех зон охвата клиентов по регионам ");
        System.out.println("(2) Показать список категорий для маркетинга ");
        System.out.println("(3) Показать выделенный бюджет для определенной категории мест для маркетинга  ");
        System.out.println("(4) Показать общий бюджет для маркетинга ");
        System.out.println("(5) Потратить бюджет на продвижение");
        System.out.println("(6) Выход ");

        String marketersChoise = sc.next();
        switch (marketersChoise){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                System.out.println("Программа завершена, мы будем рады вашему возвращению!");
                System.exit(6);
                break;
            default:
                System.out.println("Wrong number try again");
                MarketersMenu();
        }
    }
    ////////    Manager's Action         \\\\\\\\\\\\\\\\
    public static void ManagersMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 5");
        System.out.println("Menu:");
        System.out.println("(1) Показать список сотрудников  ");
        System.out.println("(2) Показать список дел  ");
        System.out.println("(3) Показать список указаний к сотрудникам ");
        System.out.println("(4) Показать список всех зон покрытия");
        System.out.println("(5) Выход");

        String managersChoise = sc.next();
        switch (managersChoise){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.println("Программа завершена, мы будем рады вашему возвращению!");
                System.exit(5);
                break;
            default:
                System.out.println("Wrong number try again");
                ManagersMenu();
        }
    }
    ////////     Worker's Action       \\\\\\\\\\\\\\\\\
    public static void WorkersMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 5");
        System.out.println("Menu:");
        System.out.println("(1) Показать список порученных мне дел.");
        System.out.println("(2) Показать список завершенных указаний.");
        System.out.println("(3) Показать список дел над, которым я работаю.");
        System.out.println("(4) Показать зарплату");
        System.out.println("(5) Выход");

        String workersChoise = sc.next();
        switch (workersChoise){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.println("Программа завершена, мы будем рады вашему возвращению!");
                System.exit(5);
                break;
            default:
                System.out.println("Wrong number try again");
                WorkersMenu();
        }
    }
    public static void salesManagersMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Пожалуйста наберите номер меню для работы с программой, если закончили, то наберите 5");
        System.out.println("Menu:");
        System.out.println("(1) Показать список порученных мне дел.");
        System.out.println("(2) Показать список завершенных указаний.");
        System.out.println("(3) Показать список дел над, которым я работаю.");
        System.out.println("(4) Показать зарплату");
        System.out.println("(5) Выход");

        String salesManagersChoice = sc.next();
        switch (salesManagersChoice){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.println("Программа завершена, мы будем рады вашему возвращению!");
                System.exit(5);
                break;
            default:
                System.out.println("Wrong number try again");
                salesManagersMenu();
        }
    }
}



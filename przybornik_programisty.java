import java.util.Scanner;

public class przybornik_programisty {

    static String [] tasks = new String[100];
    static String [] projects = new String[100];
    static String [] changeLog = new String[100];

    static int tasksCount = 0;
    static int projectsCount = 0;
    static int changeLogCount = 0;

    public static void displayMenu() {
        System.out.println("1 - Create new task");
        System.out.println("2 - Remove task");
        System.out.println("3 - Create new project");
        System.out.println("4 - Remove project");
        System.out.println("5 - Display all tasks");
        System.out.println("6 - Display all projects");
        System.out.println("7 - Display change log");
        System.out.println("0 - Exit app");
    }

    public static void addTask(String task) {
        boolean hasCapacityForNewTask = tasksCount < tasks.length;
        if (hasCapacityForNewTask) {
            tasks[tasksCount] = task;
            tasksCount++;
            addLog("Dodano nowe zadanie: " + task);
        } else {
            addLog("Nie udało się dodać nowego zadania: " + task);
        }
    }

    public static void removeTask(int indexTask) {
        boolean isTaskExist = indexTask < tasksCount;
        if (isTaskExist) {
            addLog("Usunięto zadanie: " + tasks[indexTask]);
            for(int i=indexTask; i<tasksCount-1;i++) {
                tasks[i] = tasks[i+1];
            }
            tasksCount--;
        } else {
            addLog("Nie udało się usunąć zadania: " + tasks[indexTask]);
        }

    }

    public static void displayTasks() {
        System.out.println("List of tasks: ");
        for (int i=0; i<tasksCount;i++) {
            System.out.println(tasks[i]);
        }
        addLog("Wyświetlono listę zadań");
    }

    public static void addProject(String project) {
        boolean hasCapacityForNewProject = projectsCount < projects.length;
        if (hasCapacityForNewProject) {
            projects[projectsCount] = project;
            projectsCount++;
            addLog("Dodano nowy projekt: " + project);
        } else {
            addLog("Nie udało się dodać nowego projektu: " + project);
        }
    }

    public static void removeProject(int indexProject) {
        boolean isProjectExist = indexProject < projectsCount;
        if (isProjectExist) {
            addLog("Usunięto project: " + projects[indexProject]);
            for(int i=indexProject; i<projectsCount-1;i++) {
                projects[i] = projects[i+1];
            }
            projectsCount--;
        } else {
            addLog("Nie udało się usunąć projektu: " + projects[indexProject]);
        }
    }

    public static void displayProjects() {
        System.out.println("List of projects: ");
        for (int i=0; i<projectsCount;i++) {
            System.out.println(projects[i]);
        }
        addLog("Wyświetlono listę projektów");
    }

    public static void addLog(String log){
        boolean hasCapacityForNewLog = changeLogCount < changeLog.length;
        if (hasCapacityForNewLog) {
            changeLog[changeLogCount] = log;
            changeLogCount++;
        }
    }

    public static void displayChangeLog() {
        System.out.println("Change log: ");
        for (int i=0; i<changeLogCount;i++) {
            System.out.println(changeLog[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    int radix;
	    boolean isApplicationRun = true;
        while(isApplicationRun) {
	        displayMenu();
            System.out.print("Type number to choose option: ");
	        radix = scanner.nextInt();

	        switch(radix) {
                case 1:
                    System.out.println("Podaj nazwę zadania do dodania: ");
                    String task = scanner.next();
                    addTask(task);
                    break;
                case 2:
                    System.out.println("Podaj index zadania do usunięcia: ");
                    int index = scanner.nextInt();
                    removeTask(index);
                    break;
                case 3:
                    System.out.println("Podaj nazwę projektu do dodania: ");
                    String project = scanner.next();
                    addProject(project);
                    break;
                case 4:
                    System.out.println("Podaj index projektu do usunięcia: ");
                    int indexProject = scanner.nextInt();
                    removeProject(indexProject);
                    break;
                case 5:
                    displayTasks();
                    break;
                case 6:
                    displayProjects();
                    break;
                case 7:
                    displayChangeLog();
                    break;
                case 0:
                    isApplicationRun=false;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
                    break;
            }
        }

    }
}
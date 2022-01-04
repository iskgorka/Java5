import java.util.ArrayList;
import java.util.Arrays;

class UniversityGroup {

    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList;

    UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentList = new ArrayList<>();
        this.endYear = startYear + 5;
    }

    UniversityGroup(String groupName, int startYear, ArrayList<String> studentList) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentList = studentList;
        this.endYear = startYear + 5;
    }

    void addStudent(String student) {
        this.studentList.add(student);
    }

    boolean removeStudent(String student) {
        return this.studentList.remove(student);
    }

    String getGroupName() {
        return groupName;
    }

    int getStartYear() {
        return startYear;
    }

    int getEndYear() {
        return endYear;
    }

    ArrayList<String> getStudentList() {
        return studentList;
    }

    void getGroupDescription() {
        System.out.println("Group name is: " + getGroupName()
                + " \nStart year is: " + getStartYear()
                + " \nYear of graduation is: " + getEndYear()
                + " \nGroup has such students: " + getStudentList());
    }

    public static void main(String[] args) {
        UniversityGroup group1 = new UniversityGroup("218-B", 2018);
        UniversityGroup group2 = new UniversityGroup("AB-17", 2010, new ArrayList<>(Arrays.asList(args)));
        //group 1
        group1.addStudent("Vasya");
        group1.addStudent("Misha");
        group1.addStudent("Denys");
        group1.addStudent("Artur");
        group1.addStudent("Andrey");
        System.out.println(group1.studentList);
        group1.removeStudent("Denys");
        System.out.println(group1.studentList);
        group1.getGroupDescription();
        //group 2
        group2.addStudent("Maria");
        group2.addStudent("Darya");
        group2.addStudent("Hanna");
        group2.addStudent("Sofia");
        group2.addStudent("Katya");
        System.out.println(group2.studentList);
        group2.removeStudent("Maria");
        System.out.println(group2.studentList);
        group2.getGroupDescription();

        String res = group2.getGroupName();
        System.out.println(res);
    }
}



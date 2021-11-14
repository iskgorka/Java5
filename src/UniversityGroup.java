import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.ArrayList;
public class UniversityGroup {
    @Getter                                                  //getter
    private int getStartYear(){
        return startYear;
    }
    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList;
    public UniversityGroup(String groupName, int startYear){
        this.groupName = groupName;
        this.startYear = startYear;
        endYear = startYear + 5;
    }
    public UniversityGroup(String groupName, int startYear, ArrayList<String> studentList){
        this.groupName = groupName;
        this.startYear = startYear;
        endYear = startYear + 5;
    }
    void addStudent(String student){
        studentList.add(student);

    }
    public boolean removeStudent(String student){
        return false;
    }
    static void getGroupDescription(){
        System.out.println("Afonijie");
    }
    public static void main(String[] args){
        UniversityGroup group1 = new UniversityGroup("CIT-65", 2018);
        UniversityGroup group2 = new UniversityGroup("AP-218", 2001);   // ArrayList<String> studentList
        group1.addStudent("asd");
        group1.addStudent("ASDAS");
        group1.addStudent("KHJKHJK");
        group2.addStudent("qwe");
        group2.addStudent("zxc");
        group1.removeStudent("asd");
        getGroupDescription();
    }
}



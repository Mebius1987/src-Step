package Step.OOP.inkopsulation.Group;

/**
 * Created by Mebius on 08.04.2016.
 */
public class Group {
    private Student[] group;
    private String name;
    private String specialization;
    private int course;



    public void setGroup(Student[] group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if(course >= 1&& course<=5)
        this.course = course;
    }
    public Group(){
        group = new Student[15];
        for ( int i = 0; i< group.length;i++) {
            group[i] = new Student();
        }
    }
}

public class Student
{
    private String name;
    private int absence;
    
    public Student(String initName, int initAbsence)
    {
        name= initName;
        absence = initAbsence;
    }
    public String getName()
    {
        return name;
    }
    public int getAbsenceCount()
    {
        return absence;
    }
    public String toString()
    {
        return name;
    }
}
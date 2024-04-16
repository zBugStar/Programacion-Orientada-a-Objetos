public class gradeBook {
    private String courseName;

    public gradeBook(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String displayMessage(){
        return "Bienvenido a la lista de planillas : ";
    }
}
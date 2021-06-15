public class ProjectTest{
    public static void main(String[] args){
  
        Project project1=new Project();
        project1.setName("Yousef");
        project1.setDescription("This is my first project!");
        System.out.println(project1.elevatorPitch());

        Project project2=new Project("Adel","This is my second project");
        System.out.println(project2.elevatorPitch());

        System.out.println("You have "+Project.getNumer()+"projects");
    }
}
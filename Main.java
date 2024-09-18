
public class Main
{
    public static void main( String[] args )
    {
        CourseService courseService = new CourseService();

        String courseId = "phys_01";
        String studentId = "120120";
        
        System.out.println("La informacion del curso con ID " + courseId + " es: ");
        courseService.displayCourseInformation( courseId );
        System.out.println();
        
        System.out.println("La informacion del alumno con ID " + studentId + " es: ");
        courseService.displayStudentInformation( studentId);
        System.out.println();

        System.out.println("Se ha inscrito el alumno: " + studentId + " al curso " + courseId);
        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        System.out.println();

        System.out.println("Se ha dado de baja el curso: " + courseId + " para el alumno " + studentId);
        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        
        
    }


}
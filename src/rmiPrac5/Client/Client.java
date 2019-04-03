package rmiPrac5.Client;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;


import rmiPrac5.classes.StudentData;
import rmiPrac5.classes.StudentService;

public class Client {

    // Host or IP of Server
    private static final String HOST = "45.248.149.1";
    private static final int PORT = 6969;
    private static Registry registry;

    public static void main(String[] args) throws Exception {

        // Search the registry in the specific Host, Port.
        registry = LocateRegistry.getRegistry(HOST, PORT);

        // Lookup WeatherService in the Registry.
        StudentService service = (StudentService) registry.lookup(StudentService.class.getSimpleName());


        StudentData student = service.getStudents(4);
        System.out.println(student.getStdID());
        System.out.println(student.getStdName());

        StudentData studentData = service.getStudentsList();
        List<StudentData> list = studentData.getStudentList();
        for (StudentData s : list) {
            System.out.println(s.getStdID() + "  " + s.getStdName());

        }
        System.out.println();


    }
}
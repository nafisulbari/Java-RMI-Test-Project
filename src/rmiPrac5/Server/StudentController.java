package rmiPrac5.Server;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


import rmiPrac5.classes.StudentData;
import rmiPrac5.classes.StudentService;
 
public class StudentController extends UnicastRemoteObject implements
      StudentService {
 
  public StudentController() throws RemoteException {
      super();
  }
 

  @Override
    public synchronized StudentData getStudents(int id) throws RemoteException{
       id =5;
       String name="gg";

      return new StudentData(id,name);
  }

  @Override
  public synchronized StudentData getStudentsList() throws RemoteException{

      List<StudentData> stdsList = new ArrayList<StudentData>();

      for (int i = 0; i < 5; i++) {
          StudentData s = new StudentData(2,"ggs");
          stdsList.add(s);
      }
      return new StudentData(stdsList);
  }
}
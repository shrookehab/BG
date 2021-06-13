/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author SHROOK
 */
public class headd extends person{
    private static Scanner scan;
     public headd () throws ClassNotFoundException, IOException{
        super();
    }
    public void add_time(String id,String time) throws FileNotFoundException, ClassNotFoundException, IOException{
           LoadviolationCurrentList();
        //LoadviolationAppointmentList();
        if(Old_build.containsKey(id)){
             for(Map.Entry k:Old_build.entrySet()){
                     String x=k.getKey().toString();
                     if(x.equals(id)){
                        Vector v=(Vector)k.getValue(); 
                       if(v.size()==5)continue;
                        v.add(time);
                       // System.out.println(time);
                        //System.out.println(v.get(3));
                        k.setValue(v);
                              //  System.out.println(v.size());
                        break;
                     }  
            }
             File CurrentViolationFile = new File("CurrentViolation.txt");
                CurrentViolationFile.delete();
                for(Map.Entry k:Old_build.entrySet()){
                    String key = k.getKey().toString();
                    Vector v1=(Vector)k.getValue();               
                    SaveCurrentViolation(key, v1);
               }
          
    }
           // else JOptionPane.showMessageDialog(null," Violation Is Not Exist ");
        }
        public void add_validation(String id,String validation) throws FileNotFoundException, ClassNotFoundException, IOException{
            LoadviolationAppointmentList();
        //LoadviolationFinnishedList();
            if(timed_vio.containsKey(id)){
             for(Map.Entry k:timed_vio.entrySet())
             {
                     String x=k.getKey().toString();
                     if(x.equals(id)){
                        Vector v=(Vector)k.getValue(); 
                       if(v.size()==6)continue;
                           v.add(validation);
                        k.setValue(v);
                        break;
                     }  
            }
             File AppointmentFile = new File("Appointment.txt");
                AppointmentFile.delete();
                for(Map.Entry k:timed_vio.entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();               
                    SaveAppointmentViolation(key, v1);
               }
             
    }
           // else{ System.out.println(" violation is not exist ");System.out.println(" a7eeh ");}
        }
            public void time_violation_Edit(String id,String time) throws FileNotFoundException, ClassNotFoundException, IOException{
             LoadviolationAppointmentList();
                if(timed_vio.containsKey(id))
                {
           Vector v=new Vector();
          for(Map.Entry k:timed_vio.entrySet()){
                     String x=k.getKey().toString();
                     if(x==id){
              v=(Vector)k.getValue(); 
                    v.remove(v.size()-1);
                    k.setValue(v);
                     break;
                    }  
            }    
        
        File AppointmentFile = new File("Appointment.txt");
                AppointmentFile.delete();
                for(Map.Entry k:timed_vio.entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();               
                    SaveAppointmentViolation(key, v1);
                   

               }
}
      // else System.out.println("violation item is Not exist ");
       }
       

}
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

/**
 *
 * @author SHROOK
 */
public class member extends person{   
    
        private static Scanner scan;
 public member() throws ClassNotFoundException, IOException{
        super();
    } 
    public void finished_violations(String id) throws ClassNotFoundException, IOException{
LoadviolationAppointmentList();
        LoadviolationFinnishedList();
       if(timed_vio.containsKey(id)){
           Vector v=new Vector();
          for(Map.Entry k:timed_vio.entrySet()){
                     String x=k.getKey().toString();
                     if(x.equals(id)){
              v=(Vector)k.getValue(); 
                     break;
                     }  
                     }
          finished_violation.put(id, v);
          timed_vio.remove(id);
File AppointmentFile = new File("Appointment.txt");
                AppointmentFile.delete();
                for(Map.Entry k:timed_vio.entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();               
                    SaveAppointmentViolation(key, v1);
                  
               }
                File FinnishedViolationsFile = new File("FinnishedViolations.txt");
                FinnishedViolationsFile.delete();
                for(Map.Entry k:finished_violation.entrySet()){
               String key = k.getKey().toString();
              Vector v2=(Vector)k.getValue();               
                    SaveFinnishedViolation(key, v2);
                   

               }
       }
       else {
           //System.out.println("violation item is Not exist ");
       }
    }
       public void time_violation(String id) throws FileNotFoundException, ClassNotFoundException, IOException{
             LoadviolationCurrentList();
        LoadviolationAppointmentList();
           if(Old_build.containsKey(id)){
           Vector v=new Vector();
          for(Map.Entry k:Old_build.entrySet()){
                     String x=k.getKey().toString();
                     if(x.equals(id)){
              v=(Vector)k.getValue(); 
                     break;
                     }  
                     }
          timed_vio.put(id, v);
          Old_build.remove(id);
          File CurrentViolationFile = new File("CurrentViolation.txt");
                CurrentViolationFile.delete();
                for(Map.Entry k:Old_build.entrySet()){
               String key = k.getKey().toString();
              Vector v2=(Vector)k.getValue();               
                    SaveCurrentViolation(key, v2);
               }
           File AppointmentFile = new File("Appointment.txt");
                AppointmentFile.delete();
                for(Map.Entry k:timed_vio.entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();               
                    SaveAppointmentViolation(key, v1);
       }
           }
       else {
        //       System.out.println("violation item is Not exist ");
       }
       }
}
package Classes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
/**
 *
 * @author SHROOK
 */
public   class person {
private final String id="";
   public String user_name="";
  private String user_password="";
private  String Check="";
public  HashMap<String,Vector>Old=new HashMap<>() ;
public  HashMap<String,Vector>timed_vio=new HashMap<>() ;
public  HashMap<String,Vector>Old_build=new HashMap<>() ; 
public  HashMap<String,Vector>finished_violation=new HashMap<>() ; 
private  Scanner scan;
public person() throws FileNotFoundException, ClassNotFoundException, IOException{
   
          
   
    }

    public String getId() {
        return id;
    }



    public String getUser_password() {
        return user_password;
    }

    public String getCheck() {
        return Check;
    }



    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setCheck(String Check) {
        this.Check = Check;
    }
public void LoadUsers () throws FileNotFoundException, ClassNotFoundException, IOException{
        File UserFile = new File("Users.txt");
           if( UserFile.length()==0){
               return;
    }
        //BufferedReader Reader;
        scan = new Scanner(new File("Users.txt"));
        scan.useDelimiter("[,\n]");
         try {
             Old.clear(); 
            //Reader =  new BufferedReader(new FileReader(UserFile));
            //String ReadingLine = Reader.readLine();
            while (scan.hasNext()){
               Vector userInfo =  new Vector();
                String key = scan.next();
                String name = scan.next();
                String pass = scan.next();
                String Job = scan.next();                     
                userInfo.add(name);
                userInfo.add(pass);
                userInfo.add(Job);
             Old.put(key, userInfo);    
                //ReadingLine = Reader.readLine();
                 }
             scan.close();
               //Reader.close();
         }
            catch(Exception e){
               // System.out.println("File NOT Exist !!! ");
                //e.printStackTrace();
            }
    }
public boolean login(String name,String password,String j)throws FileNotFoundException, ClassNotFoundException, IOException
     {
         Old.clear();
        LoadUsers();
         for(Map.Entry k:Old.entrySet()){
            Vector d = (Vector)k.getValue();
   if (d.get(0).toString().equals(name)&& d.get(1).toString().equals(password)){ 
       if(d.get(2).toString().charAt(0)==j.charAt(0))
       return true;
         }
   
     }   
         return false;
     }
public void LoadviolationCurrentList()  throws FileNotFoundException, ClassNotFoundException, IOException{
    File CurrentViolationFile = new File("CurrentViolation.txt");
    if( CurrentViolationFile.length()==0){
        return;
    }
        
        //BufferedReader Reader;
        scan = new Scanner(new File("CurrentViolation.txt"));
        scan.useDelimiter("[,\n]");
         try {
             Old_build.clear();
                //Scanner input = new Scanner (InspectorFile);
                //String read = input.nextLine();
            //Reader =  new BufferedReader(new FileReader(CurrentViolationFile));
            //String ReadingLine = Reader.readLine();
            while ( scan.hasNext()){
                Vector ViolationInfo =  new Vector();
                String key = scan.next();
                String len = scan.next();
                int lenght = Integer.valueOf(len);
                for ( int i = 0; i < lenght;i++ ){
                String Violation =scan.next(); 
                ViolationInfo.add(Violation);
                }
                Old_build.put(key, ViolationInfo);         
                //ReadingLine = Reader.readLine();
                 }
               //Reader.close(); 
            scan.close();
            }
            catch(Exception e){
               // System.out.println("File NOT Exist !!! ");
                //e.printStackTrace();
            }
       
    }

public void LoadviolationAppointmentList()  throws FileNotFoundException, ClassNotFoundException, IOException{
    File AppointmentFile = new File("Appointment.txt");
        if( AppointmentFile.length()==0){
        return;
    }
      
        //BufferedReader Reader;
        scan = new Scanner(new File("Appointment.txt"));
        scan.useDelimiter("[,\n]");
         try {
             timed_vio.clear();
                //Scanner input = new Scanner (InspectorFile);
                //String read = input.nextLine();
            //Reader =  new BufferedReader(new FileReader(AppointmentFile));
           // String ReadingLine = Reader.readLine();
            while ( scan.hasNext()){
                  Vector ViolationInfo =  new Vector();
                String key = scan.next();
                int lenght = Integer.valueOf(scan.next());
                for ( int i = 0; i < lenght;i++ ){
                String Violation = scan.next();    
                ViolationInfo.add(Violation);
                
                }
                timed_vio.put(key, ViolationInfo);
                //ReadingLine = Reader.readLine();
              
                 }
               //Reader.close();
            scan.close();
            }
            catch(Exception e){
             //   System.out.println("File NOT Exist !!! ");
                //e.printStackTrace();
            }
   }

public void LoadviolationFinnishedList()  throws FileNotFoundException, ClassNotFoundException, IOException{
    File FinnishedViolationsFile = new File("FinnishedViolations.txt");
    if( FinnishedViolationsFile.length()==0){
        return;
    }
       
        //BufferedReader Reader;
        scan = new Scanner(new File("FinnishedViolations.txt"));
        scan.useDelimiter("[,\n]");
         try {
             finished_violation.clear();
            //Reader =  new BufferedReader(new FileReader(FinnishedViolationsFile));
            //String ReadingLine = Reader.readLine();
            while ( scan.hasNext()){
                 Vector ViolationInfo =  new Vector();
                String key = scan.next();
                int lenght = Integer.valueOf(scan.next());
                for ( int i = 0; i < lenght;i++ ){
                String Violation = scan.next();    
                ViolationInfo.add(Violation);
                
                } finished_violation.put(key, ViolationInfo);
                //ReadingLine = Reader.readLine();
                     
                 }
               //Reader.close();
            scan.close();
            }
            catch(Exception e){
             //   System.out.println("File NOT Exist !!! ");
                //e.printStackTrace();
            }
   }
public void SaveUsers (String ID, String name, String Password, String job) throws FileNotFoundException, ClassNotFoundException, IOException{
     File UserFile = new File("Users.txt");
         try {       
                if (UserFile.exists()){
                FileWriter fw = new FileWriter("Users.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                Output.println(ID + "," + name + "," + Password + "," + job );
         
                Output.close();
                }
                else{
                    UserFile.createNewFile();
                FileWriter fw = new FileWriter("Users.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                Output.println(ID + "," + name + "," + Password + "," + job );
          
                Output.close();
                }
            }
            catch(IOException e){
            
            }
}

public void SaveCurrentViolation (String id, Vector v) throws FileNotFoundException, ClassNotFoundException, IOException{

    File CurrentViolationFile = new File("CurrentViolation.txt");
        
         try//(output = new BufferedWriter(new FileWriter(my_file_name, true))//PrintWriter output = new PrintWriter(new FileWriter("log.txt",true))) 
         {
             //output.append("New Line!");
             if (CurrentViolationFile.exists()){
              FileWriter fw = new FileWriter("CurrentViolation.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                
                Output.write(id + "," + v.size());
                for ( int i = 0; i < v.size();i++)
                      Output.write("," + v.get(i) ); 
                Output.println();
                Output.close();
             }
             else{
                 CurrentViolationFile.createNewFile();
                  FileWriter fw = new FileWriter("CurrentViolation.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                
                Output.write(id + "," + v.size());
                for ( int i = 0; i < v.size();i++)
                      Output.write("," + v.get(i) ); 
                Output.println();
                Output.close();
             }
            }
         
            catch(IOException e){
               // System.out.println("File NOT Exist !!! ");
            }

    
}

public void SaveAppointmentViolation(String id,Vector v) throws FileNotFoundException, ClassNotFoundException, IOException{
 File AppointmentFile = new File("Appointment.txt");
        
         try//(output = new BufferedWriter(new FileWriter(my_file_name, true))//PrintWriter output = new PrintWriter(new FileWriter("log.txt",true))) 
         {
             //output.append("New Line!");
             if ( AppointmentFile.exists()){
              FileWriter fw = new FileWriter("Appointment.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                Output.write(id + "," + v.size());
                for ( int i = 0; i < v.size();i++)
                      Output.write("," + v.get(i) );
                Output.println();
                Output.close();
             }
             else{
                 AppointmentFile.createNewFile();
                 FileWriter fw = new FileWriter("Appointment.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                Output.write(id + "," + v.size());
                for ( int i = 0; i < v.size();i++)
                      Output.write("," + v.get(i) );
                Output.println();
                Output.close();
             }
            }
         
            catch(IOException e){
              //  System.out.println("File NOT Exist !!! ");
            }
    
    
}

public void SaveFinnishedViolation(String id,Vector v) throws FileNotFoundException, ClassNotFoundException, IOException{
File FinnishedViolationsFile = new File("FinnishedViolations.txt");
        
         try//(output = new BufferedWriter(new FileWriter(my_file_name, true))//PrintWriter output = new PrintWriter(new FileWriter("log.txt",true))) 
         {
             //output.append("New Line!");
             if (FinnishedViolationsFile.exists()){
              FileWriter fw = new FileWriter("FinnishedViolations.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                Output.write(id + "," + v.size());
                for ( int i = 0; i < v.size();i++)
                      Output.write("," + v.get(i) ); 
                Output.println();
                Output.close();
             }
             else
             {
                 FinnishedViolationsFile.createNewFile();
             FileWriter fw = new FileWriter("FinnishedViolations.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                Output.write(id + "," + v.size());
                for ( int i = 0; i < v.size();i++)
                      Output.write("," + v.get(i) );
                Output.println();
                Output.close();
             }
            }
         
            catch(IOException e){
               // System.out.println("File NOT Exist !!! ");
            }
    
    
}

        /*   public void view_violationslist() throws FileNotFoundException, ClassNotFoundException, IOException{
               LoadviolationCurrentList();
               LoadviolationAppointmentList();
               LoadviolationFinnishedList();
             //  System.out.println("The current_violation list : ");
             for(Map.Entry k:Old_build.entrySet()){
               String x=k.getKey().toString();
              Vector v=(Vector)k.getValue(); 
       System.out.println(x);
          for(int i=0;i<v.size();i++)System.out.println(v.get(i));
         }
             System.out.println("The current timed_violation list : ");
                          for(Map.Entry k:timed_vio.entrySet()){
               String x=k.getKey().toString();
              Vector v=(Vector)k.getValue(); 
      // System.out.println(x);
          for(int i=0;i<v.size();i++)System.out.println(v.get(i));
         }
                          
                          System.out.println("The finished_violation list : ");
                                       for(Map.Entry k:finished_violation.entrySet()){
               String x=k.getKey().toString();
              Vector v=(Vector)k.getValue(); 
           System.out.println(x);
          for(int i=0;i<v.size();i++)System.out.println(v.get(i));
         }
            
        }
*/
}

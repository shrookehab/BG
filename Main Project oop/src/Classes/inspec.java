/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Vector;
import java.util.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author SHROOK
 */
public class inspec extends person {
  private static Scanner scan;
   public inspec () throws IOException, ClassNotFoundException{
     super();
 }
   public void SaveImage(Violation a){
       File Imagefile = new File("Image file.txt");
       try {       
                if (Imagefile.exists()){
                FileWriter fw = new FileWriter("Image file.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                Output.println(a.getId() + "," + a.getPath());
                Output.close();
                }
                else{
                    Imagefile.createNewFile();
                FileWriter fw = new FileWriter("Image file.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter Output = new PrintWriter(bw);
                Output.println(a.getId()  + "," + a.getPath());
          
                Output.close();
                }
            }
            catch(IOException e){
        
            }
       
       
   }
   
   public String LoadImage(String ID) throws FileNotFoundException{
       
       File Imagefile = new File("Image file.txt");
       if( Imagefile.length()==0){
        return "";
    }
        
        //BufferedReader Reader;
        scan = new Scanner(new File("Image file.txt"));
        scan.useDelimiter("[,\n]");
         try {
                //Scanner input = new Scanner (InspectorFile);
                //String read = input.nextLine();
            //Reader =  new BufferedReader(new FileReader(CurrentViolationFile));
            //String ReadingLine = 77Reader.readLine();
            while ( scan.hasNext()){
           
                String id = scan.next();
                String Path = scan.next();
               if ( id.equals(ID))
                   return Path;
                }                             
               //Reader.close(); 
            scan.close();
            }catch(Exception e){
               // System.out.println("File NOT Exist !!! ");
                //e.printStackTrace();
            }
         return "";
   }

    
       
   
public void add_violation(Violation a) throws FileNotFoundException, ClassNotFoundException, IOException{
    LoadviolationCurrentList();
        if(!Old_build.containsKey(a.getId() )){
        Vector v=new Vector();
        v.add(a.getName());v.add(a.getAdress());v.add(a.getComplain());v.add(a.getInsp_name());
        Old_build.put(a.getId(), v);
        SaveCurrentViolation(a.getId(), v);
        SaveImage(a);
    }
    
}
public void Edit_violation(String id,String name,String adress,String complain) throws FileNotFoundException, ClassNotFoundException, IOException{
LoadviolationCurrentList();
    if(Old_build.containsKey(id)){
    Old_build.remove(id);
    Violation a=new Violation();
    a.setId(id);a.setName(name);a.setAdress(adress);a.setComplain(complain);a.setInsp_name(user_name);
    Vector v=new Vector();
v.add(a.getName());v.add(a.getAdress());v.add(a.getComplain());v.add(a.getInsp_name());
Old_build.put(id, v);

 File CurrentViolationFile = new File("CurrentViolation.txt");
                CurrentViolationFile.delete();
                for(Map.Entry k:Old_build.entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();               
                    SaveCurrentViolation(key, v1);
            
               }

}
//else System.out.println("violation item is Not exist ");
}

public void violation_delete(String id) throws FileNotFoundException, ClassNotFoundException, IOException{
    LoadviolationCurrentList();
    if(Old_build.containsKey(id)){
          Old_build.remove(id);          
          FileWriter fw = new FileWriter("CurrentViolation.txt");
                PrintWriter Output = new PrintWriter(fw);
                Output.flush();
               Output.close();
               fw.close();
                for(Map.Entry k:Old_build.entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();               
                    SaveCurrentViolation(key, v1);                  
               }
    }
   // else System.out.println("violation item is Not exist ");
}

    
    
}
package Classes;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHROOK
 */
public class addmin extends person {
    //private static Scanner scan;
     public addmin() throws ClassNotFoundException, IOException{
         super();
     }
     public void add_user(String id,String name,String pass,String job) throws FileNotFoundException, ClassNotFoundException, IOException{
         LoadUsers();
 if(Old.containsKey(id)){
   //  System.out.println("User is exist");
 }
 else {
     Vector v=new Vector();
     v.add(name);
     v.add(pass);
     v.add(job);
     Old.put(id,v);
      SaveUsers(id, name, pass, job);
 }
     }
      public void delete_User(String id) throws FileNotFoundException, ClassNotFoundException, IOException{
        LoadUsers();
          if(!Old.containsKey(id)){
    // System.out.println("User is not exist");
 }
 else {
 
              
              Old.remove(id);
               FileWriter fw = new FileWriter("Users.txt");
                PrintWriter Output = new PrintWriter(fw);
                Output.flush();
               Output.close();
               fw.close();
         for(Map.Entry k:Old.entrySet()){
               String key = k.getKey().toString();
              Vector v=(Vector)k.getValue();               
              SaveUsers(key, v.get(0).toString(), v.get(1).toString(), v.get(2).toString());
}
 }  
      }
    /*    public void view_inspectors() throws FileNotFoundException, ClassNotFoundException, IOException{
               LoadUsers();
                 for(Map.Entry k:Old.entrySet()){
               String x=k.getKey().toString();
              Vector v=(Vector)k.getValue(); 
          if(v.get(2)=="inspector"){
           //   System.out.println(x);
          for(int i=0;i<v.size();i++)System.out.println(v.get(i));
         }
                 }     
                 
        }
                public void view_head() throws FileNotFoundException, ClassNotFoundException, IOException{
               LoadUsers();
                  for(Map.Entry k:Old.entrySet()){
               String x=k.getKey().toString();
              Vector v=(Vector)k.getValue(); 
          if(v.get(2)=="head"){
             // System.out.println(x);
          for(int i=0;i<v.size();i++)System.out.println(v.get(i));
         }
                 }  
                  
        }
           public void view_members() throws FileNotFoundException, ClassNotFoundException, IOException{
                   LoadUsers();
                   for(Map.Entry k:Old.entrySet()){
               String x=k.getKey().toString();
              Vector v=(Vector)k.getValue(); 
          if(v.get(2)=="member"){
              System.out.println(x);
          for(int i=0;i<v.size();i++)System.out.println(v.get(i));
         }
                 }  
                    
        }
      */
           public void User_Edit(String id,String name,String password,String job) throws FileNotFoundException, ClassNotFoundException, IOException{
               LoadUsers();
               if(!Old.containsKey(id)){
                Vector v=new Vector();           
                for(Map.Entry k:Old.entrySet()){
              if(k.getKey().equals(id)){
                  String x=k.getKey().toString();
                 v.add(name);v.add(password);v.add(job);
                  break;
              }
                 }
                Old.remove(id);
                Old.put(id, v); 
                
          File UserFile = new File("Users.txt");
                UserFile.delete();
                for(Map.Entry k:Old.entrySet()){
               String key = k.getKey().toString();
              Vector v1=(Vector)k.getValue();               
              SaveUsers(key, v1.get(0).toString(), v1.get(1).toString(), v1.get(2).toString());
                   

               }
               }
            //   else System.out.println("User is not exist");
                
           }
   
}
